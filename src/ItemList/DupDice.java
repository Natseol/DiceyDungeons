package ItemList;

import Battle.TurnInfo;
import Character.Status;
import Dice.Roll;
import Item.Item;

public class DupDice extends Item{

	public DupDice()	{
		name = "두사위";
		description = "눈금을 2배로 만듭니다 (최대 3)";
		limit="1 2 3";
		newDice=" ";
	}
	
	@Override
	public void actionNewDice(TurnInfo my, int dice) {
		my.getDiceList().add(dice*2);
	}	
}
