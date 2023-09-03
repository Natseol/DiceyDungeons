package ItemList;

import Battle.*;
import Character.*;
import Item.Item;

public class IceAge extends Item{

	public IceAge()	{
		name = "빙하기";
		description = "[15] 의 냉기피해를 줍니다 빙결+3";
		count=18;
		times=1;
	}	
	
	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		if (count-dice>0) {
			my.setTurnCount(idx, my.getTurnCount(idx)-dice);
			my.setTurnTimes(idx, 1);
		}
		else {
			printDamageIce(15);
			enemy.subtractHp(15);
			enemy.setCondition(1,enemy.getCondition(1)+3);
			my.setTurnTimes(idx, 0);
			my.setTurnCount(idx, 18);
		}
	}
}