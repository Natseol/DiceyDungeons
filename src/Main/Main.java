package Main;

import java.util.Scanner;

import Battle.*;
import Character.*;
import Dice.*;
import Item.*;
import Store.*;

public class Main {
		
//	public static int[] rollADice(int idx) {			
//		int dice[]=new int[idx];
//		for (int i = 0; i < dice.length; i++) {
//			dice[i]=Roll.roll6();			
//		}
//		return dice;
//	}
//	
//	public int selectDice(int[] dice, int idx) {
//		return dice[idx];	 
//	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
						
		Player player = new Player(30,40,5,1);
		
		Store store = new Store();
		
		store.changeItem(player, 0, 3);
		store.changeItem(player, 1, 23);
		store.changeItem(player, 2, 6);
		store.changeItem(player, 3, 10);
		store.changeItem(player, 4, 25);
		store.changeItem(player, 5, 18);
		
		
		Enemy enemy = new Enemy(32,32,4);		
		MyTurn my = new MyTurn(player); //내턴시작, 주사위 초기화
		while (true) {
			my.printInfo(player, enemy);
			my.printDice();
			
			int idxDice=input.nextInt();
			int numDice=my.selectDice(idxDice-1);
			System.out.println();
				
			System.out.println("눈금 : "+numDice);
			my.printItem(my);
			
			int invenIdx = input.nextInt()-1;
			System.out.println();
			
			my.getItem(invenIdx).setCheck(false);//조건 초기화
			my.getItem(invenIdx).setChangeDice(0);//조건 초기화
			if (my.getItem(invenIdx).checkDice(numDice)==true) {
				System.out.println();
				System.out.println("---------------------------------");
				continue;
			}//장비 조건 확인
			
			my.getItem(invenIdx).action(player, enemy, numDice, my);//장비 발동
			//수정필요:카운트변수 적용안됨
			
			if (my.getItem(invenIdx).getTimes()==0) {
				my.setTurnItem(invenIdx, Store.ITEMLIST[0]);
			}//횟수0 아이템은 빈슬롯으로 변경			
			
			my.setDice(idxDice-1, my.getItem(invenIdx).getChangeDice());//주사위 눈금 변경
			//수정필요:빈 슬롯 선택해도 주사위가 사라짐
			for (int i = 0 ; i<2;i++) {
				System.out.println(my.getOther());
			}
			my.rebuildDice();//주사위 정리
			
			System.out.println("---------------------------------");
		} //end of while MyTurn

	}
}
