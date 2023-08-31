package ItemList;

import Battle.MyTurn;
import Character.Enemy;
import Character.Player;
import Character.Status;
import Item.Item;

public class UsedGreat extends Item{

	public UsedGreat()	{
		name = "빈슬롯";
		description = "사용한 대검";
		times=0;
	}
	
	@Override
	public void action(Status player, Status enemy, int dice, MyTurn my) {
		changeDice = dice;
	}
}
