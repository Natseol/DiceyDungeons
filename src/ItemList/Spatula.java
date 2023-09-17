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
	
//	@Override
//	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
//		my.setTurnTimes(idx, 0);		
//	}
}

//예비 : 눈금4 주사위를 획득한다