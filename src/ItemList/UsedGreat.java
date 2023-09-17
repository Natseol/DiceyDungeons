package ItemList;

import Battle.MyTurn;
import Battle.TurnInfo;
import Character.Enemy;
import Character.Player;
import Character.Status;
import Item.Item;

public class UsedGreat extends Item{

	public UsedGreat()	{
		name = "빈슬롯";
		description = "사용한 대검";
		limit=" ";
	}
	
	@Override
	public boolean checkDice(int dice) {
		return true;
	}
	
	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
	}
}
