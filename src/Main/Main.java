package Main;

import java.util.Scanner;

import Battle.*;
import Character.*;
import Dice.*;
import Field.*;
import Item.*;
import Monster.*;

public class Main extends Color {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("---------------------------------");
		System.out.println("     클래스를 선택하세요(1.전사 2.도적)  ");
		System.out.println("---------------------------------");

		Player player = new Player(input.nextInt());

		System.out.println();		

		int floor=1;
		Field field = new Field();
		
		while (true) {//스테이지 진입

			Enemy[] enemy = new Enemy[]{new Frog(), new Gatekeeper()};
			int enemyNum=1;

			System.out.println("---------------------------------");
			System.out.println("\t  전투를 시작합니다");
			System.out.println("---------------------------------");
			while (true) {//전투시작
				MyTurn my = new MyTurn(player);//주사위 초기화
				EnemyTurn enemyTurn = new EnemyTurn(enemy[enemyNum]);

				while (true) { //내턴시작
					System.out.println(" - 나의 턴 -");
					System.out.println("---------------------------------");
					my.printInfo(player, enemy[enemyNum]);
					System.out.println();
					my.printDice();					

					int idxDice=input.nextInt();
					if (idxDice==0) {
						System.out.println();
						System.out.println(" - 턴 종료 -");						
						System.out.println("---------------------------------");
						break; //턴종료
					}
					else if (idxDice==9) {
						enemyTurn.enemyInfo(enemy[enemyNum]);
						continue;
					}

					int numDice=my.getDice(idxDice-1);
					System.out.println();

					System.out.println("눈금 : "+numDice);
					my.printItem();

					int invenIdx = input.nextInt()-1;
					if (invenIdx==-1) {
						System.out.println();
						System.out.println("---------------------------------");
						continue;
					}
					System.out.println();

					my.getItem(invenIdx).setCheck(false);//조건 초기화
					my.getItem(invenIdx).setChangeDice(0);//조건 초기화
					if (my.getItem(invenIdx).checkDice(numDice)==true) {
						System.out.println();
						System.out.println("---------------------------------");
						continue;
					}//장비 조건 확인

					my.getItem(invenIdx).action(player, enemy[enemyNum], numDice, my);//장비 발동

					if (player.getHp()<1||enemy[enemyNum].getHp()<1) {
						System.out.println("---------------------------------");
						my.printInfo(player, enemy[enemyNum]);
						System.out.println("---------------------------------");
						break;
					}

					my.setDice(idxDice-1, my.getItem(invenIdx).getChangeDice());//주사위 눈금 변경

					if (my.getItem(invenIdx).getTimes()==0) {
						my.setItem(invenIdx, new Nothing());
					}//횟수0 아이템은 빈슬롯으로 변경					

					my.rebuildDice();//주사위 정리

					System.out.println("---------------------------------");
				}//end of while : 내 턴

				if (player.getHp()<1||enemy[enemyNum].getHp()<1) {					
					break;
				}

//				//*****************
//				// 전투 탈출
//				//*****************
//
//				System.out.println();
//				System.out.println("---------------------------------");
//				System.out.println("종료 = 1");
//				if (input.nextInt()==1) {
//					break;
//				}

				System.out.println(enemy[enemyNum].getName()+"이(가) 주사위를 굴립니다");
				System.out.println("---------------------------------");
				System.out.println();				
				enemyTurn.printDice();
				System.out.println();
				enemyTurn.printItem();
				System.out.println("---------------------------------");

				for (int i =0; i<enemyTurn.getDice().length;i++) {
					input.next();
					System.out.println();
					System.out.print("["+(i+1)+"번 눈금:"+enemyTurn.getDice(i)+"]로 [");
					System.out.println((i+1)+"번째 "+enemy[enemyNum].getInventoryName(i)+"]을 사용합니다");
					System.out.println();
					enemy[enemyNum].getInventory(i).action(enemy[enemyNum], player,enemyTurn.getDice(i), enemyTurn);
					System.out.println("---------------------------------");
					my.printInfo(player,enemy[enemyNum]);					
					System.out.println();
					if (player.getHp()<1||enemy[enemyNum].getHp()<1) {
						break;
					}
				}
				if (player.getHp()<1||enemy[enemyNum].getHp()<1) {
					break;
				}
			}//end of while Battle

			if (player.getHp()<1) {
				System.out.println();
				System.out.println(RED+" YOU DIED"+RESET);
				break;//END 스테이지종료
			}
			if (enemy[enemyNum].getHp()<1) {
				System.out.println();
				System.out.println(B_CYAN+enemy[enemyNum].getName()+"을(를) 물리쳤습니다!!"+RESET);
				player.levelUp();
			}

			player.getDiceQuantity(player);//주사위 갯수 초기화

			while (true) {//필드진입
				int chooseInField = field.move(floor);
				if (chooseInField == 1) {
					System.out.println();
					break;
				}
				else if (chooseInField == 2) {
					if (field.getStoreCount()==1)
						while (true) {
							System.out.println();
							field.getStore().printStore();
							field.getStore().showList();

							System.out.println(YELLOW+"상점의 장비를 선택하세요 (나가기 : 0)"+RESET);
							int storeIdx = input.nextInt()-1;
							if (storeIdx+1 == 0) {
								break;
							}
							System.out.println();
							player.getInventoryAll();
							System.out.println(YELLOW+"당신의 장비를 선택하세요 (다시선택 : 0)"+RESET);
							int invenIdx = input.nextInt()-1;
							if (invenIdx+1 == 0) {
								continue;
							}
							else if (invenIdx+1 == 6) {
								System.out.println("");
								System.out.println("고유장비는 변경할 수 없습니다");
								continue;
							}
							else {
								field.getStore().changeItem(player, invenIdx, field.getStore().getStoreList(storeIdx));
								player.getInventoryAll();
								field.setStoreCount(0);
								break;
							}
						}//end of while 상점
					else {
						System.out.println();
						System.out.println("이미 교환 완료했습니다");
						System.out.println("---------------------------------");
					}

				}
				else if (chooseInField == 3) {
					if (field.getHealCount()>0) {
						System.out.println();
						System.out.println("회복의 샘에 왔습니다");
						System.out.println("---------------------------------");
						System.out.println("체력을 10 회복합니다  남은 횟수 : "+field.getHealCount());
						System.out.println(YELLOW+"(예:1 아니오:2)"+RESET);				
						if (input.nextInt()==1) {
							player.setHp(player.getHp()+10);
							if (player.getHp()>player.getMaxHp()) {
								player.setHp(player.getMaxHp());
							}
							field.setHealCount(field.getHealCount()-1);
						}
					}
					else {
						System.out.println();
						System.out.println("모든 횟수를 소진했습니다");
						System.out.println("---------------------------------");
					}
				}
				else if (chooseInField == 4) {
					floor++;
					break;
				}
				else {
					player.printInfo();
					player.getInventoryAll();
					continue;
				}
			}//end of while Field
		}//end of while stage
	}//end of main
}

