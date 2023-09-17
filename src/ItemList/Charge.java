package ItemList;

import Battle.*;
import Character.*;
import Item.Item;

public class Charge extends Item{

	public Charge()	{
		name = "격돌";
		description = "[1+방어력] 의 피해를 줍니다 (최소 3)";
		limit="3 4 5 6";
		attack=1;
	}	
	
	@Override
	public void actionAttack(Status player, Status enemy, int dice) {
		enemy.subtractHp(1+player.getDef());
		printDamage(1+player.getDef());
	}
}