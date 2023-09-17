package ItemList;

import Battle.*;
import Character.*;
import Item.Item;

public class IcePillar extends Item{

	public IcePillar()	{
		name = "얼음기둥";
		description = "[두번째 눈금+3] 의 얼음 피해를 줍니다 (홀수 주사위 2개 필요)";
		limit="-1";
		attack=1;
		iceStack=1;
		needDice=1;
		times=1;
	}
	
	@Override
	public void actionAttack(Status player, Status enemy, int dice) {
		enemy.subtractHp(dice+3);
		printDamage(dice+3);
	}
}