package ItemList;

import Battle.*;
import Character.*;
import Item.Item;

public class Parrying extends Item{

	public Parrying()	{
		name = "패링";
		description = "ㅁ 의 피해를 줍니다. 방어력이 있으면 +3 의 피해 (최대 3)";
		limit="1 2 3";
		attack=-1;
	}

	@Override
	public void actionAttack(Status player, Status enemy, int dice) {
		if (player.getDef()>0) {
			enemy.subtractHp(dice+3);
			printDamage(dice+3);
		} else {
			enemy.subtractHp(dice);
			printDamage(dice);
		}
			
	}
}