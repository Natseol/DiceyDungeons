package ItemList;

import Battle.*;
import Character.*;
import Item.Item;

public class Meteor extends Item{

	public Meteor()	{
		name = "운석";
		description = "[20] 의 화염피해를 줍니다 발화+3";
		count=20;
		times=1;
	}	
	
	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		if (count-dice>0) {
			my.setTurnCount(idx, my.getTurnCount(idx)-dice);
			my.setTurnTimes(idx, 1);
		}
		else {
			printDamageFire(20);
			enemy.subtractHp(20);
			enemy.setCondition(0,enemy.getCondition(0)+3);
			my.setTurnTimes(idx, 0);
			my.setTurnCount(idx, 20);
		}
	}
}