package ItemList;

import Battle.*;
import Character.*;
import Item.Item;

public class BroadSword extends Item{

	public BroadSword()	{
		name = "브로드 소드";
		description = "ㅁ+2 의 피해를 줍니다";
		times=1;
	}	
	
	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		enemy.subtractHp(dice+2);
		printDamage(dice+2);
		my.setTurnTimes(idx, 0);
	}
}