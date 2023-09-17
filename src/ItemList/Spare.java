package ItemList;

import Battle.TurnInfo;
import Character.Status;
import Item.Item;

public class Spare extends Item{

	public Spare()	{
		name = "예비4";
		description = "눈금 4 주사위를 획득합니다";
		newDice="4";
	}	
	
//	@Override
//	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
//		my.setTurnTimes(idx, 0);		
//	}
}

//예비 : 눈금4 주사위를 획득한다