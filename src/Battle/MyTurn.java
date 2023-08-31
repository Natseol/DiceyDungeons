package Battle;

import java.util.Arrays;

import Character.*;
import Dice.Roll;
import Main.Color;
import Field.*;
import Item.Item;
import ItemList.*;

public class MyTurn extends TurnInfo{
	
 	public MyTurn(Player player) {
 		super(player);		
		diceQ = player.getDiceQuantity();
		
		turnItem=new Item[6];
		for (int i = 0 ; i<6;i++) {
			setItem(i,player.getInventory(i));
		}		
//		turnItem= player.getInventory().clone();		
//		setTurnItem(player);
		dice=new int[diceQ];		
		for (int i = 0; i < dice.length; i++) {
			dice[i]=Roll.roll6();
		}
		resetTimes(turnItem);
		resetCount(player);
	}
 	
//	public void resetTimes() {
//		for (int i=0;i<6;i++) {
//			this.itemState[i][0]=getItem(i).getTimes();
//		}
//		this.itemState[0][0]=getItem(0).getTimes();
//		this.itemState[1][0]=getItem(1).getTimes();
//		this.itemState[2][0]=getItem(2).getTimes();
//		this.itemState[3][0]=getItem(3).getTimes();
//		this.itemState[4][0]=getItem(4).getTimes();
//		this.itemState[5][0]=getItem(5).getTimes();
//	}


	
//	private void setTurnItem(Player player) {
//		turnItem = new Item[player.getInventory().length];
//		switch (player.getJob()) {
//		case "전사":
//			turnItem = new Item[6];			
//			setItem(0, Item.copyItem(player.getInventory(0)));     
//			setItem(1, Item.copyItem(player.getInventory(1)));       
//			setItem(2, Item.copyItem(player.getInventory(2)));  
//			setItem(3, Item.copyItem(player.getInventory(3)));   
//			setItem(4, Item.copyItem(player.getInventory(4)));    
//			setItem(5, Item.copyItem(player.getInventory(5)));    
//			break;
//		case "도적":
//			turnItem = new Item[6];
//			setItem(0, new Dagger());   
//			setItem(1, new Bow());      
//			setItem(2, new Nothing());  
//			setItem(3, new Nothing());  
//			setItem(4, new LockPick()); 
//			setItem(5, new Reroll());   
//			break;                      
//		}
//	}
}
