package Battle;

import Character.*;
import Dice.Roll;
import Item.Item;
import ItemList.*;

public class EnemyTurn extends TurnInfo{
	
	public EnemyTurn(Status enemy) {
		super(enemy);
		diceQ = enemy.getDiceQuantity();		
		turnItem=new Item[enemy.getInventory().length];
		for (int i = 0 ; i<enemy.getInventory().length;i++) {
			turnItem[i]=enemy.getInventory(i);
		}	
		dice=new int[diceQ];
		for (int i = 0; i < dice.length; i++) {
			dice[i]=Roll.roll6();			
		}
		itemState=new int[enemy.getInventory().length][3];
		resetCount(enemy);
	}
}
