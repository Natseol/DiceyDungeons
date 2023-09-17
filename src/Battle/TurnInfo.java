package Battle;

import java.util.Scanner;

import Character.*;
import Dice.Roll;
import Field.*;
import Item.Item;
import ItemList.*;
import Main.Color;
import Main.Script;

public class TurnInfo extends BattleSetting{
	
	Scanner scanner = new Scanner(System.in);
	int diceQ;
	int[] dice;	
	Item[] turnItem;
	int[] other;
	Script script = new Script();
	
	public TurnInfo() {}
	
 	public TurnInfo(Status status) {
		turnItem= status.getInventory().clone();	
		resetDice(status);
	}
 	
 	public void resetDice(Status status) {
 		diceQ = status.getDiceQuantity();	
 		dice=new int[diceQ];
		for (int i = 0; i < dice.length; i++) {
			dice[i]=Roll.roll6();			
		}
 	}
	
	public int[] getDice() {
		return dice;
	}	
	public int getDice(int diceIdx) {
		return dice[diceIdx];
	}
	public void setDice(int diceIdx,int changeNum) {
		dice[diceIdx]=changeNum;		
	}
	
//	public int getTurnTimes(int idx) {
//		return turnItem[idx].getTimes();
//	}
//	public void setTurnTimes(int idx, int num) {
//		turnItem[idx].setTimes(num);
//	}

	public int[] getOther() {
		return other;
	}
	public void setOther(int idx, int num) {
		other[idx] = num;
	}
	public void setOther(int num) {
		other = new int[num];
	}
	
	public Item[] getItem() {
		return turnItem;
	}
	public Item getItem(int idx) {
		return turnItem[idx];
	}
	public void setItem(int idx, Item item) {
		turnItem[idx] = item;
	}
	
	public void setBattle(Status status) { 
		for (int i=0;i<status.getInventory().length;i++) {
			if (status.getInventory(i).getDescription()==new UsedGreat().getDescription()) {
				setItem(i, new UsedGreat());
			}
//			if (status.getInventory(i).getDescription()==new Reroll().getDescription()) {
//				setItem(i, new Reroll());
//			}
//			if (status.getInventory(i).getDescription()==new LockPick().getDescription()) {
//				setItem(i, new LockPick());
//			}
//			getItem(i).setCount(status.getInventory(i).getCount());			
		}
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

