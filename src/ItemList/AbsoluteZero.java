package ItemList;

import Battle.*;
import Character.*;
import Item.Item;

public class AbsoluteZero extends Item{

	public AbsoluteZero()	{
		name = "절대영점";
		description = "[25] 의 냉기피해를 줍니다 빙결+3";
		count=24;
		times=1;
	}	
	
	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		if (count-dice>0) {
			my.setTurnCount(idx, my.getTurnCount(idx)-dice);
			my.setTurnTimes(idx, 1);
		}
		else {
			printDamageIce(25);
			enemy.subtractHp(25);
			enemy.setCondition(1,enemy.getCondition(1)+3);
			my.setTurnTimes(idx, 0);
			my.setTurnCount(idx, 24);
		}
	}
}