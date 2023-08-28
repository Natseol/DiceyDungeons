package Battle;

import Character.*;
import Dice.Roll;
import Item.*;

public class EnemyTurn extends TurnInfo{
	
	public EnemyTurn(Status enemy) {
		super(enemy);
		
		diceQ = enemy.getDiceQuantity();		
		turnItem=new Item[enemy.getInventory().length];		
		for (int i = 0; i < turnItem.length; i++) {
			turnItem[i]=enemy.getInventory(i);
		}		
		dice=new int[diceQ];
		for (int i = 0; i < dice.length; i++) {
			dice[i]=Roll.roll6();			
		}
	}
}
