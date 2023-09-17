package ItemList;

import Battle.TurnInfo;
import Character.Status;
import Dice.Roll;
import Item.Item;

public class Spatula extends Item{

	public Spatula()	{
		name = "주걱";
		description = "눈금을 뒤집습니다";
		newDice=" ";
	}	
	
	@Override
	public void actionNewDice(TurnInfo my, int dice) {
		my.getDiceList().add(7-dice);
	}	
}
