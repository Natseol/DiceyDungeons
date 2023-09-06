package Main;

import java.util.Scanner;

import Battle.*;
import Character.*;
import Dice.*;
import Field.*;
import ItemList.*;
import Monster.*;

public class Main extends Script {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Script script = new Script();		

		script.chooseJob();
		int inputNum=0;
		while (inputNum>5||inputNum<1) {
			inputNum=Input.checkInput(scanner.nextLine());
		}
		Player player = new Player(inputNum);

		script.chooseItem(player.getJob());
		inputNum=0;
		while (inputNum>2||inputNum<1) {
			inputNum=Input.checkInput(scanner.nextLine());
		}
		player.setJobItem(player.getJob(), inputNum);

		Enemy[] enemy = new Enemy[19];
		for (int i=0;i<enemy.length;i++) {
			enemy[i]=Enemy.setEnemy(i);
		}
		int floor=1;		
		int eNum=0;
		Field field = new Field();

//		player.setCondition(0,3);
//		player.setCondition(1,2);
//		player.setCondition(2,4);
//		player.setCondition(3,2);

//		player.setLevel(5);
//		player.setSp(12);
//		player.setHp(52);
//		enemy[eNum].setHp(2);

//			enemy[eNum].setCondition(0,3);
//			enemy[eNum].setCondition(1,2);
//			enemy[eNum].setCondition(2,2);
//			enemy[eNum].setCondition(3,2);

		while (true) {//스테이지 진입
			
			int enemyTurnNum[][] = new int[enemy[eNum].getInventory().length][2];
			for (int i = 0; i < enemy[eNum].getInventory().length; i++) {
				enemyTurnNum[i][0]=enemy[eNum].getInventory(i).getTimes();
				enemyTurnNum[i][1]=enemy[eNum].getInventory(i).getCount();
			}
			
			int playerTurnNum[][] = new int[player.getInventory().length][2];
			for (int i = 0; i < player.getInventory().length; i++) {
				playerTurnNum[i][0]=player.getInventory(i).getTimes();
				playerTurnNum[i][1]=player.getInventory(i).getCount();
			}
			
			script.startBattle();			
			while (true) {//전투시작
							
				MyTurn myturn = new MyTurn(player);//주사위 초기화
				EnemyTurn enemyTurn = new EnemyTurn(enemy[eNum]);

				
				for (int i = 0; i < enemy[eNum].getInventory().length; i++) {
					enemy[eNum].getInventory(i).setTimes(enemyTurnNum[i][0]);//횟수 동기화
					enemyTurn.setTurnCount(i,enemyTurn.getItem(i).getCount());//카운트 동기화
				}
				
				for (int i = 0; i < player.getInventory().length; i++) {
					player.getInventory(i).setTimes(playerTurnNum[i][0]);//횟수 동기화
					myturn.setTurnCount(i,myturn.getItem(i).getCount());//카운트 동기화
				}

				myturn.doMyTurnLoop(player, enemy[eNum], enemyTurn);
				if (player.getHp()<1||enemy[eNum].getHp()<1) break;
				
				//*****************
				// 전투 탈출
				//*****************
//				System.out.println();
//				System.out.println("---------------------------------");
//				System.out.println("종료 = 1");
//				if (scanner.nextLine().equals("1")) break;

				System.out.println();
				enemyTurn.doEnemyTurnLoop(player, enemy[eNum], myturn);
				if (player.getHp()<1||enemy[eNum].getHp()<1) break;

				script.startMyTurn();

			}//end of while Battle

			if (player.getHp()<1) {
				script.printBattleInfo(player, enemy[eNum]);
				System.out.println();
				System.out.println(BOLD+RED+" YOU DIED"+RESET);
				break;
			}//졌을 때
			if (enemy[eNum].getHp()<1) {
				System.out.println();
				System.out.println(B_CYAN+enemy[eNum].getName()+"을(를) 물리쳤습니다!!"+RESET);
				eNum++;
				player.levelUp();
				if (eNum==13||eNum==17) {
					System.out.println("\n  새로운 상점이 열렸습니다\n");
					field = new Field();
				}
				if (eNum>18) {
					script.ending();
					System.exit(1);
				}
			}//이겼을 때

			player.resetPlayer();//플레이어 정보 초기화
			for (int i = 0; i < player.getInventory().length; i++) {
				player.getInventory(i).setTimes(playerTurnNum[i][0]);
				player.getInventory(i).setCount(playerTurnNum[i][1]);
			}
			
			while (true) {//필드진입

				script.chooseInField(floor);
				int chooseInField=Input.checkInput(scanner.nextLine());
				if (chooseInField == 1) {//1.전투
					if(eNum == 3||eNum == 6||eNum == 10||eNum == 14||eNum == 18 ) {
						System.out.println();
						System.out.println("이 층에는 더이상 적이 없습니다");
						continue;
					}
					System.out.println();
					break;
				}
				else if (chooseInField == 2) {//2.상점
					if (field.getStoreCount()==1) {
						field.inStore(player);
					}
					else {
						script.changeAlready();
					} 
				}
				else if (chooseInField == 3) {//3.회복샘
					if (field.getHealCount()>0) {
						field.visitWell(player);
					}
					else {
						script.useAlready();
					}
				}
				else if (chooseInField == 4) {//4.다음층
					if (eNum>=15&&eNum<=18) eNum=18;
					if (eNum>=11&&eNum<=14) eNum=14;
					if (eNum>=7&&eNum<=10) eNum=10;
					if (eNum>=4&&eNum<=6) eNum=6;
					if (eNum>=0&&eNum<=3) eNum=3;
					floor++;
					field = new Field();
					script.downFloor();
					break;
				}
				else {//아무키. 정보					
					script.printPlayerInfo(player);
					script.printInventoryAll(player);
					continue;
				}
			}//end of while Field
			if (eNum==18) {
				System.out.println(" 최후의 상점에 들어갑니다.");
				System.out.println(" 나가면 바로 전투가 시작됩니다");
				field=new Field();
				field.inStore(player);				
			}
			
		}//end of while stage
		scanner.close();
	}//end of main
}

