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
	
	public void setTimes(int idx, int num) {
		turnItem[idx].setTimes(num);
	}
	
	public int getTimes(int idx) {
		return turnItem[idx].getTimes();
	}
	
	public Item getItem(int idx) {
		return turnItem[idx];
	}
	
	public void setItem(int idx, Item item) {
		turnItem[idx] = item;
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
	
	public void printDice() {
		for (int i = 0; i < dice.length; i++) {
			System.out.print("("+(i+1)+")"+dice[i]+"  ");
		}
		System.out.println();
		System.out.println(Color.YELLOW+"주사위를 선택하세요 (0 : 턴종료)"+Color.RESET);
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
	}
	
	public void printItem(MyTurn my) {
		for (int i = 0; i < 6; i++) {
			if (my.getItem(i).getName().equals(Store.ITEMLIST[0].getName())) {
				System.out.print(Color.BLACK);
			}
			System.out.print(i+1+") "+my.getItem(i).getName()+" : "+my.getItem(i).getDescription());
			if (my.getTimes(i) > 1) {
				System.out.print(" 남은횟수:"+my.getTimes(i));
			}
			else if(my.getItem(i).getCount()>0) {
				System.out.print(" 카운트:"+my.getItem(i).getCount());
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
