package Battle;

import java.util.Arrays;

import Character.*;
import Dice.Roll;
import Main.Color;
import Field.*;
import Item.Item;
import ItemList.*;

public class MyTurn extends TurnInfo{
	
	int[] other;
	
 	public MyTurn(Player player) {
 		super(player);		
		diceQ = player.getDiceQuantity();
		
//		turnItem=new Item[6];
//		for (int i = 0 ; i<player.getInventory().length;i++) {
//			setItem(i,player.getInventory(i));
//		}		
//		turnItem= player.getInventory().clone();
		
		setTurnItem(player);
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
	
	private void setTurnItem(Player player) {
		turnItem = new Item[player.getInventory().length];
		switch (player.getJob()) {
		case "전사":
			turnItem = new Item[6];			
			setItem(0, new Sword());     
			setItem(1, new Axe());       
			setItem(2, new GreatSword());
			setItem(3, new Nothing());   
			setItem(4, new Rising());    
			setItem(5, new Reroll());    
			break;
		case "도적":
			turnItem = new Item[6];
			setItem(0, new Dagger());   
			setItem(1, new Bow());      
			setItem(2, new Nothing());  
			setItem(3, new Nothing());  
			setItem(4, new LockPick()); 
			setItem(5, new Reroll());   
			break;                      
		}
	}
}
