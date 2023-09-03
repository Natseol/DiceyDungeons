package ItemList;

import Battle.*;
import Character.*;
import Item.Item;

public class Infection extends Item{

	public Infection()	{
		name = "전염";
		description = "독을 2배로 늘립니다";
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
			printPoisoned(enemy.getCondition(3));
			enemy.setCondition(3,enemy.getCondition(3)*2);
			my.setTurnTimes(idx, 0);
			my.setTurnCount(idx, 24);
		}
	}
}