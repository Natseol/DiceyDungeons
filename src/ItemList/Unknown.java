package ItemList;

import Battle.TurnInfo;
import Character.Status;
import Dice.Roll;
import Item.Item;

public class Unknown extends Item{
	
	public Unknown()	{
		name = "알수없음";
		description = "(알 수 없음)";
		times=1;
	}	
	
	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		int effect = Roll.random(4)-1;
		my.setTurnTimes(idx, 0);
		switch (effect) {
		case 0:
			printFire(1);
			enemy.setCondition(0,enemy.getCondition(0)+1);
			break;
		case 1:
			printIced(1);
			enemy.setCondition(1,enemy.getCondition(1)+1);
			break;
		case 2:
			printShock(1);
			enemy.setCondition(2,enemy.getCondition(2)+1);
			break;
		case 3:
			printPoisoned(1);
			enemy.setCondition(3,enemy.getCondition(3)+1);
			break;
		}
	}
}