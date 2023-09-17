package ItemList;

import Battle.*;
import Character.*;
import Item.Item;
import Item.ItemScript;

public class Shovel extends Item{

	public Shovel()	{
		name = "삽";
		description = "ㅁ 의 피해를 줍니다. (6: 전기피해를 줍니다)";
		attack=-1;
		elecStack=1;
	}
	
	@Override
	public void actionElecStack(Status enemy, int dice) {
		if (dice>=6) {
		enemy.setCondition(2,enemy.getCondition(2)+getElecStack());
		ItemScript.printShock(getElecStack());
		}
	};
	
//	@Override
//	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
//		enemy.subtractHp(dice);
//		if (dice>5) {
//			enemy.setCondition(2,enemy.getCondition(2)+1);
//			printDamageShock(dice);
//		}
//		else {
//			printDamage(dice);
//		}
//		my.setTurnTimes(idx, 0);
//	}
}
