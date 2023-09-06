package ItemList;

import Battle.*;
import Character.*;
import Item.Item;

public class Freeze extends Item{

	public Freeze()	{
		name = "동결";
		description = "[2] 의 냉기피해를 줍니다";
		count=5;
		times=1;
	}	
	
	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		if (count-dice>0) {
			my.setTurnCount(idx, my.getTurnCount(idx)-dice);
			my.setTurnTimes(idx, 1);
		}
		else {
			printDamageIce(2);
			enemy.subtractHp(2);
			enemy.setCondition(1,enemy.getCondition(1)+1);
			my.setTurnTimes(idx, 0);
			my.setTurnCount(idx, 5);
		}
	}
}