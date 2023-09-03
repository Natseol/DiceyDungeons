package ItemList;

import Battle.*;
import Character.*;
import Item.Item;

public class PoisonGas extends Item{

	public PoisonGas()	{
		name = "맹독";
		description = "[3]의 독 피해를 줍니다. 독+3";
		count=9;
		times=1;
	}	
	
	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		if (count-dice>0) {
			my.setTurnCount(idx, my.getTurnCount(idx)-dice);
			my.setTurnTimes(idx, 1);
		}
		else {
			enemy.subtractHp(3);
			printDamage(3);			
			enemy.setCondition(3,enemy.getCondition(3)+3);
			printPoisoned(3);
			my.setTurnTimes(idx, 0);
			my.setTurnCount(idx, 9);
		}
	}
}