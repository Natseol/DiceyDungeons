package Battle;

import Character.*;
import Dice.Roll;
import Item.*;

public class EnemyTurn extends TurnInfo{
	
	public EnemyTurn(Enemy enemy) {
		
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
	
	public void enemyInfo(Enemy enemy) {
		System.out.println();
		System.out.println(" - "+enemy.getName()+"("+enemy.getGrade()+") -");
		System.out.println("설명: "+enemy.getDescription());
		System.out.println("---------------------------------");
		printItem();
		System.out.println("---------------------------------");
		System.out.println();
	}	

}
