package Battle;

import Character.*;
import Dice.Roll;
import Field.*;
import Item.Item;
import ItemList.*;
import Main.Color;

public class TurnInfo extends BattleSetting{
	
	int diceQ;
	int[] dice;	
	Item[] turnItem;
	
	public TurnInfo() {}
 	public TurnInfo(Status status) {
		diceQ = status.getDiceQuantity();		
		turnItem=new Item[6];
		for (int i = 0 ; i<status.getInventory().length;i++) {
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
	
	public void setBattle(Status status) {
		for (int i=0;i<6;i++) {
			if (status.getInventory(i).getDescription()==new UsedGreat().getDescription()) {
				setItem(i, new UsedGreat());
			}
			getItem(i).setCount(status.getInventory(i).getCount());			
		}
	}
}

