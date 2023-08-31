package ItemList;

import Battle.MyTurn;
import Character.Enemy;
import Character.Player;
import Character.Status;
import Item.Item;

public class Nothing extends Item{

	public Nothing()	{
		name = "빈슬롯";
		description = "장비가 없습니다";
		times=0;
	}
	
	@Override
	public void action(Status player, Status enemy, int dice, MyTurn my) {
		changeDice = dice;
	}
}
