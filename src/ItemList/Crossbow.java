package ItemList;

import Battle.MyTurn;
import Battle.TurnInfo;
import Character.*;
import Item.Item;

public class Crossbow extends Item{
	
	public Crossbow()	{
		name = "석궁";
		count=15;
		description="[9] 의 피해를 주고 적을 마비시킵니다 (카운트 15)";
		times=1;		
	}	
	
	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		if (my.getTurnCount(idx)-dice>0) {
			my.setTurnCount(idx, my.getTurnCount(idx)-dice);
			my.setTurnTimes(idx, 1);
		}
		else {
			enemy.subtractHp(9);
			printTakeParalysis(9);
			enemy.setCondition(2,enemy.getCondition(2)+1);
			my.setTurnTimes(idx, 0);
			my.setTurnCount(idx, 15);
		}
	}
}
