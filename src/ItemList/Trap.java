package ItemList;

import Battle.*;
import Character.*;
import Item.Item;

public class Trap extends Item{

	public Trap()	{
		name = "함정";
		description = "함정을 설치합니다 독+1 마비+2 (카운트 8)";
		count=8;
		times=1;
	}	
	
	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		if (count-dice>0) {
			my.setTurnCount(idx, my.getTurnCount(idx)-dice);
			my.setTurnTimes(idx, 1);
		}
		else {
			printTakeParalysis(1);
			printTakePoison(2);
			enemy.setCondition(2,enemy.getCondition(0)+1);
			enemy.setCondition(3,enemy.getCondition(0)+2);
			my.setTurnTimes(idx, 0);
			my.setTurnCount(idx, 8);
		}
	}
}