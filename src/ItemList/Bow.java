package ItemList;

import Battle.MyTurn;
import Battle.TurnInfo;
import Character.*;
import Item.Item;

public class Bow extends Item{
	
	public Bow()	{
		name = "활";
		count=10;
		description="[9] 의 피해를 줍니다 (카운트 12)";
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
			printDamage(9);
			my.setTurnTimes(idx, 0);
			my.setTurnCount(idx, 12);
		}
	}
}
//보우 : 적에게 6만큼의 피해를 준다 (카운트다운10)