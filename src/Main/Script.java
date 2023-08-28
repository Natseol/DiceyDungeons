package Main;

import Battle.*;
import Character.*;
import Dice.Roll;
import Field.Store;
import Item.*;

public class Script extends Color {
	public void chooseJob() {		
		System.out.println("---------------------------------");
		System.out.println("     클래스를 선택하세요(1.전사 2.도적)  ");
		System.out.println("---------------------------------");		
	}

	public void startBattle() {
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println("\t  전투를 시작합니다");
		System.out.println("---------------------------------");
	}
	
	public void startMyTurn() {
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println("\t   - 나의 턴 -");
		System.out.println("---------------------------------");
	}
	
	public void battleInfo(Player player, Enemy enemy) {
		System.out.println();
		System.out.print("Lv:"+player.getLevel()+" 주사위:"+player.getDiceQuantity()+"\t\t");
		System.out.println(enemy.getName()+" 주사위:"+enemy.getDiceQuantity());
		System.out.print(player.getHp());
		if (player.getDef()>0) {
			System.out.print("("+player.getDef()+")");
		}
		System.out.print(" / "+player.getMaxHp()+"\t\t\t");
		System.out.print(enemy.getHp());
		if (enemy.getDef()>0) {
			System.out.print("("+enemy.getDef()+")");
		}
		System.out.println(" / "+enemy.getMaxHp());
		if (player.getCondition(0)>0) {
			System.out.print(Color.RED+"발화:"+player.getCondition(0)+"  "+Color.RESET);
		}
		if (player.getCondition(1)>0) {
			System.out.print(Color.CYAN+"빙결:"+player.getCondition(1)+"  "+Color.RESET);
		}
		if (player.getCondition(2)>0) {
			System.out.print(Color.PURPLE+"마비:"+player.getCondition(2)+"  "+Color.RESET);
		}	
	}
	
	public void selectDice(MyTurn turnInfo) {
		System.out.println();
		for (int i = 0; i < turnInfo.getDice().length; i++) {
			System.out.print("("+(i+1)+")"+turnInfo.getDice(i)+"  ");
		}
		System.out.println();
		System.out.println(Color.YELLOW+"주사위를 선택하세요 (0:턴종료, 9:적의 패 보기)"+Color.RESET);
	}
	
	public void selectDice(TurnInfo turnInfo) {
		System.out.println();
		for (int i = 0; i < turnInfo.getDice().length; i++) {
			System.out.print("("+(i+1)+")"+turnInfo.getDice(i)+"  ");
		}
		System.out.println();
	}
	
	public void selectTurnEnd() {
			System.out.println("---------------------------------");
			System.out.println(" - 턴 종료 -");						
			System.out.println("---------------------------------");
	}
	
	public void printItem(MyTurn turnInfo) {
		for (int i = 0; i < turnInfo.getItem().length; i++) {
			if (turnInfo.getItem(i).getName().equals(Store.ITEMLIST[0].getName())) {
				System.out.print(Color.BLACK);
			}
			System.out.print(i+1+") "+turnInfo.getItem(i).getName()+" : "+turnInfo.getItem(i).getDescription());
			if (turnInfo.getTimes(i) > 1) {
				System.out.print(" 남은횟수:"+turnInfo.getTimes(i));
			}
			else if(turnInfo.getItem(i).getCount()>0) {
				System.out.print(" 카운트:"+turnInfo.getItem(i).getCount());
			}
			System.out.println(Color.RESET);
		}		
		System.out.println(Color.YELLOW+"장비를 선택하세요 (0:돌아가기)"+Color.RESET);
	}
	
	public void printItem(TurnInfo turnInfo) {
		for (int i = 0; i < turnInfo.getItem().length; i++) {
			if (turnInfo.getItem(i).getName().equals(Store.ITEMLIST[0].getName())) {
				System.out.print(Color.BLACK);
			}
			System.out.print(i+1+") "+turnInfo.getItem(i).getName()+" : "+turnInfo.getItem(i).getDescription());
			if (turnInfo.getTimes(i) > 1) {
				System.out.print(" 남은횟수:"+turnInfo.getTimes(i));
			}
			else if(turnInfo.getItem(i).getCount()>0) {
				System.out.print(" 카운트:"+turnInfo.getItem(i).getCount());
			}
			System.out.println(Color.RESET);
		}		
	}	
	
	public void enemyInfo(TurnInfo turnInfo, Enemy enemy) {
		System.out.println();
		System.out.println(" - "+enemy.getName()+"("+enemy.getGrade()+") -");
		System.out.println("설명: "+enemy.getDescription());
		System.out.println("---------------------------------");
		printItem(turnInfo);
		System.out.println("---------------------------------");
		System.out.println();
	}
	
	public void printPlayerInfo(Player player) {
		System.out.println();
		System.out.println("-------------- 스탯 ---------------");
			System.out.println("Lv: "+player.getLevel()+"  [EXP: "+player.getExp()+"/"+player.getExpTable(player.getLevel()-1)+"]");
			System.out.println("주사위:"+player.getDiceQuantity());
			System.out.print("Hp: "+player.getHp());
			System.out.println("/"+player.getMaxHp());
	}

}
