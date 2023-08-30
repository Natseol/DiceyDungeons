package Main;

import Battle.*;
import Character.*;
import Dice.Roll;
import Field.Store;
import ItemList.*;

public class Script implements Color {
	public void chooseJob() {		
		System.out.println("---------------------------------");
		System.out.println("     클래스를 선택하세요(1.전사 2.도적)  ");
		System.out.println("---------------------------------");
		System.out.println();
	}

	public void startBattle() {
		System.out.println();
		System.out.println("\t  전투를 시작합니다");
		System.out.println("---------------------------------");
	}
	
	public void startMyTurn() {
		System.out.println();
		System.out.println();
		System.out.println("\t   - 나의 턴 -");
		System.out.println("---------------------------------");
	}
	
	public void printBattleInfo(Player player, Enemy enemy) {		
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
			System.out.print(RED+"발화:"+player.getCondition(0)+"  \n"+RESET);
		}
		if (player.getCondition(1)>0) {
			System.out.print(CYAN+"빙결:"+player.getCondition(1)+"  \n"+RESET);
		}
		if (player.getCondition(2)>0) {
			System.out.print(PURPLE+"마비:"+player.getCondition(2)+"  \n"+RESET);
		}
	}
	
	public void selectDice(MyTurn turnInfo) {
//		System.out.println();
		System.out.println(" - 당신의 주사위 - ");
//		System.out.println();
		for (int i = 0; i < turnInfo.getDice().length; i++) {
			System.out.print("("+(i+1)+")"+turnInfo.getDice(i)+"  ");
		}
		System.out.println();
		System.out.println(YELLOW+"주사위를 선택하세요 (0:턴 종료, 9:적의 다음 패 보기)"+RESET);
	}
	
	public void selectDice(TurnInfo turnInfo) {
		System.out.println();
		for (int i = 0; i < turnInfo.getDice().length; i++) {
			System.out.print("("+(i+1)+")"+turnInfo.getDice(i)+"  ");
		}
		System.out.println();
	}
	public void printSelectedDice(int numDice) {
	System.out.println();
	System.out.println("선택된 눈금 : "+B_BLACK+" "+numDice+" "+RESET);
	}
	
	public void printSelectedDiceUse(int enemyItemNum, Enemy enemy) {
		System.out.println((enemyItemNum+1)+")["+enemy.getInventoryName(enemyItemNum)+"]을 사용합니다");
		System.out.println();
		
	}
	
	public void selectTurnEnd() {
			System.out.println();
			System.out.println(" - 턴 종료 -");						
			System.out.println("---------------------------------");
	}
	
	public void printSelectItem(TurnInfo turnInfo) {
		System.out.println(YELLOW+"장비를 선택하세요 (0:주사위 다시 선택하기)"+RESET);
	}
	
	public void printItem(TurnInfo turnInfo) {
		System.out.println("---------------------------------");
		for (int i = 0; i < turnInfo.getItem().length; i++) {
			if (turnInfo.getItem(i).getName().equals(new Nothing().getName())) {
				System.out.print(BLACK);
			}
			System.out.print(i+1+") "+turnInfo.getItem(i).getName()+" : "+turnInfo.getItem(i).getDescription());
			if (turnInfo.getTimes(i) > 1) {
				System.out.print(" 남은횟수:"+turnInfo.getTimes(i));
			}
			if(turnInfo.getItem(i).getCount()>0) {
				System.out.print(" 카운트:"+turnInfo.getItem(i).getCount());
			}
			System.out.println(RESET);
		}
		System.out.println("---------------------------------");
	}	
	
	public void printEnemyInfo(TurnInfo turnInfo, Enemy enemy) {
		System.out.println();
		System.out.println(" - "+enemy.getName()+"("+enemy.getGrade()+") -");
		System.out.println("설명: "+enemy.getDescription());
		printItem(turnInfo);
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
	
//	public void printDamagedFire() {
//		System.out.println();
//		System.out.println(RED+"발화효과로 [2]의 피해를 입습니다"+RESET);
//		System.out.println();
//		System.out.println("---------------------------------");
//	}
	
	public void printDamagedIce() {
//		System.out.println();
		System.out.println(CYAN+" * 빙결효과로 눈금이 1로 변합니다 *"+RESET);
		System.out.println();
//		System.out.println("---------------------------------");
	}
	
//	public void printDamagedParalysis() {
//		System.out.println();
//		System.out.println(PURPLE+"마비효과로 주사위를 잃습니다"+RESET);
//		System.out.println();
//		System.out.println("---------------------------------");
//	}
	
	public void printCheckTrue() {
		System.out.println();
		System.out.println(B_BLACK+" * 주사위 눈금을 확인하세요 * "+RESET);
		System.out.println();
		System.out.println("---------------------------------");
	}

}
