package ItemList;

import Battle.*;
import Character.*;
import Item.Item;

public class Charge extends Item{

	public Charge()	{
		name = "격돌";
		description = "[1+방어력] 의 피해를 줍니다";
		times=1;
	}	
	
	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		enemy.subtractHp(1+player.getDef());
		printDamage(1+player.getDef());
		my.setTurnTimes(idx, 0);
	}
}