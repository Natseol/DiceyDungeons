package ItemList;

import Battle.*;
import Character.*;
import Item.Item;

public class PoisonGas extends Item{

	public PoisonGas()	{
		name = "독가스";
		description = "[2]의 피해를 줍니다. 독+3 (카운트 12)";
		count=12;
		times=1;
	}	
	
	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		if (count-dice>0) {
			my.setTurnCount(idx, my.getTurnCount(idx)-dice);
			my.setTurnTimes(idx, 1);
		}
		else {
			enemy.subtractHp(2);
			printTakeDamage(2);
			enemy.setCondition(3,enemy.getCondition(0)+3);
			printTakePoison(3);
			my.setTurnTimes(idx, 0);
			my.setTurnCount(idx, 12);
		}
	}
}