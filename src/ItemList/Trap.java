package ItemList;

import Battle.*;
import Character.*;
import Item.Item;

public class Trap extends Item{

	public Trap()	{
		name = "함정";
		description = "[1] 의 전기 피해를 줍니다 독+2";
		count=6;
		times=1;
	}	
	
	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		if (count-dice>0) {
			my.setTurnCount(idx, my.getTurnCount(idx)-dice);
			my.setTurnTimes(idx, 1);
		}
		else {
			enemy.subtractHp(1);
			printDamageShock(1);
			printPoisoned(2);
			enemy.setCondition(2,enemy.getCondition(0)+2);
			enemy.setCondition(3,enemy.getCondition(0)+2);
			my.setTurnTimes(idx, 0);
			my.setTurnCount(idx, 6);
		}
	}
}