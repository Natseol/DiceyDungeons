package ItemList;

import Battle.MyTurn;
import Battle.TurnInfo;
import Character.Enemy;
import Character.Player;
import Character.Status;
import Item.Item;

public class SpareWitch extends Item{

	public SpareWitch()	{
		name = "계략";
		description = "눈금 6 주사위를 획득한다";
		newDice="6";
	}	
	
//	@Override
//	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
//		my.setTurnTimes(idx, 0);		
//	}
}