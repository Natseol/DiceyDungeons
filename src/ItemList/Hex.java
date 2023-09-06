package ItemList;

import Battle.*;
import Character.*;
import Item.Item;

public class Hex extends Item{

	public Hex()	{
		name = "헥스";
		description = "발화+1 빙결+1 마비+1";
		count=7;
		times=1;
	}	
	
	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		if (count-dice>0) {
			my.setTurnCount(idx, my.getTurnCount(idx)-dice);
			my.setTurnTimes(idx, 1);
		}
		else {
			printFire(1);
			printIced(1);
			printShock(1);
			enemy.setCondition(0,enemy.getCondition(0)+2);
			enemy.setCondition(1,enemy.getCondition(1)+2);
			enemy.setCondition(2,enemy.getCondition(2)+2);
			my.setTurnTimes(idx, 0);
			my.setTurnCount(idx, 7);
		}
	}
}