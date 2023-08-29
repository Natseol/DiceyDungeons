package Battle;

import Character.*;
import Dice.Roll;
import Field.*;
import Item.Item;
import ItemList.*;
import Main.Color;

public class TurnInfo {
	
	int diceQ;
	int[] dice;	
	Item[] turnItem;
	
	public TurnInfo() {}
 	public TurnInfo(Status status) {
		diceQ = status.getDiceQuantity();		
		turnItem=new Item[status.getInventory().length];		
		for (int i = 0; i < turnItem.length; i++) {
			turnItem[i]=status.getInventory(i);
		}		
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
	
	public int getTimes(int idx) {
		return turnItem[idx].getTimes();
	}
	public void setTimes(int idx, int num) {
		turnItem[idx].setTimes(num);
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
}
