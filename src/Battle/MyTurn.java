package Battle;

import Character.*;
import Dice.Roll;
import Main.Color;
import Field.*;
import Item.Item;
import ItemList.*;

public class MyTurn extends TurnInfo{
	
	int[] other;
	
 	public MyTurn(Status player) {
 		super(player);
		
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
