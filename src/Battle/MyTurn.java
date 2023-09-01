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
		turnItem= player.getInventory().clone();		
		dice=new int[diceQ];		
		for (int i = 0; i < dice.length; i++) {
			dice[i]=Roll.roll6();
		}
		resetTimes(turnItem);
		resetCount(player);
	} 
}
