package Main;

import java.util.Scanner;

import Battle.*;
import Character.*;
import Dice.*;
import Item.*;
import Store.*;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("----------------------------");
		System.out.println(" 클래스를 선택해주세요(1.전사 2.도적)  ");
		System.out.println("----------------------------");

		Player player = new Player(input.nextInt());	

		while (true) {//스테이지 진입
			Field field = new Field();
			while (true) {//필드진입
				int chooseInField = field.move();
				if (chooseInField == 1) {
					Enemy enemy = new Enemy(32,32,4);
					while (true) {//전투시작
						MyTurn my = new MyTurn(player);//주사위 초기화
						while (true) { //내턴시작
							System.out.println();
							System.out.println("---------------------------------");
							my.printInfo(player, enemy);
							my.printDice();

							int idxDice=input.nextInt();
							if (idxDice==0) break; //턴종료
							int numDice=my.selectDice(idxDice-1);
							System.out.println();

							System.out.println("눈금 : "+numDice);
							my.printItem(my);

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

							my.getItem(invenIdx).action(player, enemy, numDice, my);//장비 발동
							player.getInventory(invenIdx).setCount(my.getItem(invenIdx).getCount());//카운트 변경

							my.setDice(idxDice-1, my.getItem(invenIdx).getChangeDice());//주사위 눈금 변경

							if (my.getItem(invenIdx).getTimes()==0) {
								my.setTurnItem(invenIdx, new Nothing());
							}//횟수0 아이템은 빈슬롯으로 변경					

							my.rebuildDice();//주사위 정리

							System.out.println("---------------------------------");
						}//end of while MyTurn
						
						//*****************
						//적 턴 추가해야함
						//*****************
						
						System.out.println();
						System.out.println("---------------------------------");
						System.out.println("종료 = 1");
						if (input.nextInt()==1) {
							break;
						}

					}//end of while Battle
				}
				else if (chooseInField == 2) {
					if (field.storeCount==1)
						while (true) {
							System.out.println();
							System.out.println("---------------------------------");
							System.out.println("상점에 방문했습니다");
							System.out.println("중복 상품은 당신의 운입니다");
							System.out.println("(한번만 교환가능합니다)");
							System.out.println();
							field.store.showList();

							System.out.println("상점의 장비를 선택하세요 (나가기 : 0)");
							int storeItem = input.nextInt()-1;
							if (storeItem+1 == 0) {
								break;
							}
							player.getInventoryAll();
							System.out.println("당신의 장비를 선택하세요 (다시선택 : 0)");
							int invenItem = input.nextInt()-1;
							if (invenItem+1 == 0) {
								continue;
							}
							else {
								field.store.changeItem(player, invenItem, field.store.getStoreList(storeItem));
								player.getInventoryAll();
								field.setStoreCount(0);
								break;
							}
						}//end of while 상점
					else {
						System.out.println();
						System.out.println("이미 교환 완료했습니다");
						System.out.println("-----------------------");
					}
						
				}
				else if (chooseInField == 3) {
					if (field.getHealCount()>0) {
						System.out.println();
						System.out.println("체력을 10회복합니다 (예:1 아니오:2)");
						System.out.println("남은 횟수 : "+field.getHealCount());				
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
					}
				}
				else {
					break;
				}				

			}//end of while Field
		}//end of while stage
	}
}

