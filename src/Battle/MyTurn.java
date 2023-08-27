package Battle;

import Character.*;
import Dice.Roll;
import Item.*;
import Main.Color;
import Field.*;

public class MyTurn extends TurnInfo{
	
	int[] other;
	
	public MyTurn(Player player) {
		
		diceQ = player.getDiceQuantity();
		
		turnItem=new Item[player.getInventory().length];		
		for (int i = 0; i < turnItem.length; i++) {
			turnItem[i]=player.getInventory(i);
		}		
		
		dice=new int[diceQ];
		for (int i = 0; i < dice.length; i++) {
			dice[i]=Roll.roll6();			
		}
	}
		
	public int[] getOther() {
		return other;
	}
	
	public void setOther(int idx, int num) {
		other[idx] = num;
	}
	public void setOther(int num) {
		other = new int[num];
	}
	
	@Override
	public void printDice(Status status) {
		for (int i = 0; i < dice.length; i++) {
			System.out.print("("+(i+1)+")"+dice[i]+"  ");
		}
		System.out.println();
		System.out.println(Color.YELLOW+"주사위를 선택하세요 (0:턴종료, 9:적의 패 보기)"+Color.RESET);
	}
	
	public void printInfo(Player player, Enemy enemy) {
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
		System.out.println();
		
	}
	
	public void printItem() {
		for (int i = 0; i < 6; i++) {
			if (this.getItem(i).getName().equals(Store.ITEMLIST[0].getName())) {
				System.out.print(Color.BLACK);
			}
			System.out.print(i+1+") "+this.getItem(i).getName()+" : "+this.getItem(i).getDescription());
			if (this.getTimes(i) > 1) {
				System.out.print(" 남은횟수:"+this.getTimes(i));
			}
			else if(this.getItem(i).getCount()>0) {
				System.out.print(" 카운트:"+this.getItem(i).getCount());
			}
			if (i==5)
			{
				System.out.print(" -고유-");
			}
			System.out.println(Color.RESET);
		}
		
		System.out.println(Color.YELLOW+"장비를 선택하세요 (0 : 주사위 다시선택)"+Color.RESET);
	}
	
	public void rebuildDice() {
		int count=0;
		for (int i = 0; i < dice.length; i++) {
			if (dice[i]==0) {
				count++;
			}
		}
		
		if (other!=null) {
			int[] newDice = new int[dice.length+other.length-count];
			int check=0;			
			for (int i = dice.length-count; i < dice.length+other.length-count; i++) {
				newDice[i]=other[check];
				check++;
			}
			other=null;
			check=0;		
			for (int i = 0; i < dice.length; i++) {
				if (dice[i] !=0) {
					newDice[check]=dice[i];
					check++;
				}				
			}
			dice=newDice;
		}
		else {
			int [] newDice = new int[dice.length-count];
			int check=0;		
			for (int i = 0; i < dice.length; i++) {
				if (dice[i] !=0) {
					newDice[check]=dice[i];
					check++;
				}				
			}
			dice=newDice;
		}		
	}//end of method rebulidDice	
}
