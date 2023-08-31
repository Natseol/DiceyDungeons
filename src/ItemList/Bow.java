package ItemList;

import Battle.MyTurn;
import Battle.TurnInfo;
import Character.*;
import Item.Item;

public class Bow extends Item{
	
	public Bow()	{
		name = "보우";
		count=10;
		description="[6] 의 피해를 줍니다 (카운트 10)";
		times=1;		
	}	
	
	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		if (my.getTurnCount(idx)-dice>0) {
			my.setTurnCount(idx, my.getTurnCount(idx)-dice);
			my.setTurnTimes(idx, 1);
		}
		else {
			enemy.subtractHp(6);
			printDamage(6);
			my.setTurnTimes(idx, 0);
			my.setTurnCount(idx, 10);
		}
	}
}
//보우 : 적에게 6만큼의 피해를 준다 (카운트다운10)