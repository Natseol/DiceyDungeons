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
	Item[] turnItem;
	Script script = new Script();
	
	public TurnInfo() {}
	
 	public TurnInfo(Status status) {}
	
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
		}
	}		
}

