package Battle;

import Character.*;
import Dice.Roll;
import Item.*;

public class MyTurn {
	
	int diceQ;
	int[] dice;	
	int[] other;
	Item[] turnItem = new Item[6]; 
	
	public MyTurn(Player player) {
		
		diceQ = player.getDiceQuantity();
		
		for (int i = 0; i < turnItem.length; i++) {
			turnItem[i]=player.getInventory(i);
		}
		
		
		dice=new int[diceQ];
		for (int i = 0; i < dice.length; i++) {
			dice[i]=Roll.roll6();			
		}
	}

	public int getDice(int diceIdx) {
		return dice[diceIdx];
	}
	
	public void setDice(int diceIdx,int changeNum) {
		dice[diceIdx]=changeNum;		
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
	
	public int[] getOther() {
		return other;
	}
	
	public void setOther(int idx, int num) {
		other[idx] = num;
	}
	public void setOther(int num) {
		other = new int[num];
	}
	
	public void setTurnItem(int idx, Item item) {
		turnItem[idx] = item;
	}
	
	public void printDice() {
		for (int i = 0; i < dice.length; i++) {
			System.out.print("("+(i+1)+")"+dice[i]+"  ");
		}
		System.out.println();
		System.out.println("주사위를 선택하세요 (0 : 턴종료)");
	}
	
	public void printInfo(Player player, Enemy enemy) {
		System.out.println("Lv:"+player.getLevel()+" 주사위:"+player.getDiceQuantity()+"\t\t"+enemy.getName()+" 주사위:"+enemy.getDiceQuantity());
		System.out.print(player.getHp());
		if (player.getDef()>0) {
			System.out.print(" ("+player.getDef()+")");
		}
		System.out.println(" / "+player.getMaxHp()+"\t\t\t"+enemy.getHp()+" / "+enemy.getMaxHp());
		System.out.println();	
	}
	
	public void printItem(MyTurn my) {
		for (int i = 0; i < 6; i++) {
			System.out.print(i+1+") "+my.getItem(i).getName());
			System.out.print(" : ");
			if (my.getTimes(i) > 1) {
				System.out.println(my.getItem(i).getDescription()+"  남은횟수:"+my.getTimes(i));
			}
			else if(my.getItem(i).getCount()>0) {
				System.out.println(my.getItem(i).getDescription()+"  카운트:"+my.getItem(i).getCount());
			}
			else {
				System.out.println(my.getItem(i).getDescription());
			}
		}
		System.out.println("장비를 선택하세요 (0 : 주사위 다시선택)");
	}
	
	public int selectDice(int idx) {
		return dice[idx];	 
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
