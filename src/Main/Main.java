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
		int enemyNum=1;

		while (true) {//스테이지 진입

			Enemy[] enemy = new Enemy[]{
					new Marine(),
					new SwordMan(),
					new Gatekeeper(),
					new Onepun(),
					new Bear(),
					new Vampire()
			};			

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
					my.printDice(player);
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
					 
					if (player.getCondition(0)>0) {
						player.setCondition(0,player.getCondition(0)-1);
						player.subtractHp(2);
						System.out.println();
						System.out.println(RED+"발화효과로 [2] 의 피해를 입습니다"+RESET);
						System.out.println();
						continue;
					}//상태이상	발화	
					
					if (player.getCondition(1)>0) {
						player.setCondition(1,player.getCondition(1)-1);
						int max = my.getDice(0);
				        int maxIndex = 0;				 
				        for (int i = 0; i < my.getDice().length; i++) {
				            if (my.getDice(i) > max) {
				                max = my.getDice(i);
				                maxIndex = i;
				            }
				        }						
						my.setDice(maxIndex,1);
						System.out.println();
						System.out.println(CYAN+"빙결효과로 눈금이 1로 변합니다"+RESET);
						System.out.println();
						continue;
					}//상태이상 빙결

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
					
					if (player.getCondition(2)>0) {
						player.setCondition(2,player.getCondition(2)-1);
						my.setDice(idxDice-1, 0);
						System.out.println();
						System.out.println(PURPLE+"마비효과로 주사위를 잃습니다"+RESET);
						System.out.println();
						continue;
					}//상태이상 마비

					my.getItem(invenIdx).setCheck(false);//조건 초기화
					my.getItem(invenIdx).setChangeDice(0);//조건 초기화
					if (my.getItem(invenIdx).checkDice(numDice)==true) {
						System.out.println();
						System.out.println("---------------------------------");
						continue;
					}//장비 조건 확인

					my.getItem(invenIdx).action(player, enemy[enemyNum], numDice, my);//장비 발동

					if (my.getItem(invenIdx).getName()==new GreatSword().getName()&&my.getItem(invenIdx).getCount()==0) {
						my.setItem(invenIdx, new UsedGreat());
						player.setInventory(invenIdx, new UsedGreat());
					}

					if (player.getHp()<1||enemy[enemyNum].getHp()<1) {
						System.out.println("---------------------------------");
						my.printInfo(player, enemy[enemyNum]);
						System.out.println("---------------------------------");
						break;
					}//죽었는지 확인

					my.setDice(idxDice-1, my.getItem(invenIdx).getChangeDice());//사용한 주사위 눈금 변경

					if (my.getItem(invenIdx).getTimes()==0) {
						my.setItem(invenIdx, new Nothing());
					}//횟수0 아이템은 빈슬롯으로 변경					

					my.rebuildDice();//주사위 정리

					System.out.println("---------------------------------");
				}//end of while : 내 턴

				if (player.getHp()<1||enemy[enemyNum].getHp()<1) {					
					break;
				}

				//*****************
				// 전투 탈출
				//*****************

				System.out.println();
				System.out.println("---------------------------------");
				System.out.println("종료 = 1");
				if (input.nextInt()==1) {
					break;
				}

				System.out.println(enemy[enemyNum].getName()+"이(가) 주사위를 굴립니다");
				System.out.println("---------------------------------");
				System.out.println();				
				enemyTurn.printDice(enemy[enemyNum]);
				System.out.println();
				enemyTurn.printItem();
				System.out.println("---------------------------------");

				int enemyItemNum=0;
				for (int i =0; i<enemyTurn.getDice().length;i++) {
					input.next();
					System.out.println();
					System.out.print("["+(i+1)+"번 눈금:"+enemyTurn.getDice(i)+"]로 [");
					System.out.println((enemyItemNum+1)+"번째 "+enemy[enemyNum].getInventoryName(enemyItemNum)+"]을 사용합니다");
					System.out.println();
					enemy[enemyNum].getInventory(enemyItemNum).action(enemy[enemyNum], player, enemyTurn.getDice(i), enemyTurn);

					System.out.println();

					System.out.println("---------------------------------");
					my.printInfo(player,enemy[enemyNum]);					
					System.out.println();
					if (enemy[enemyNum].getInventory(enemyItemNum).getTimes()>0) {
						enemyItemNum--;
					}
					enemyItemNum++;
					if (player.getHp()<1||enemy[enemyNum].getHp()<1) {
						break;
					}
				}

				for (int i=0; i<enemy[enemyNum].getInventory().length;i++) {
					enemy[enemyNum].getInventory(i).setTimes(1);
				}

				if (player.getHp()<1||enemy[enemyNum].getHp()<1) {
					break;
				}
			}//end of while Battle

			if (player.getHp()<1) {
				System.out.println();
				System.out.println(RED+" YOU DIED"+RESET);
				break;
			}//졌을 때
			if (enemy[enemyNum].getHp()<1) {
				System.out.println();
				System.out.println(B_CYAN+enemy[enemyNum].getName()+"을(를) 물리쳤습니다!!"+RESET);
				enemyNum++;
				player.levelUp();
			}//이겼을 떄

			player.resetPlayer();//플레이어 정보 초기화

			while (true) {//필드진입
				int chooseInField = field.move(floor);
				if (chooseInField == 1) {
					if(enemyNum == enemy.length ) {
						System.out.println();
						System.out.println("이 층에는 더이상 적이 없습니다");
						continue;
					}
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
						System.out.println(YELLOW+"(예:1 아니오:0)"+RESET);				
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
					enemyNum=0;
					floor++;
					field = new Field();					
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

