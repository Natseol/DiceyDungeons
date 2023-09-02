package ItemList;

import Battle.EnemyTurn;
import Battle.MyTurn;
import Battle.TurnInfo;
import Character.*;
import Item.Item;

public class Cannon extends Item{
	
	public Cannon()	{
		name = "캐논";
		count=15;
		description="[10] 의 피해를 줍니다 (카운트 15)";
		times=1;		
	}	
	
	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		if (my.getTurnCount(idx)-dice>0) {
			my.setTurnCount(idx, my.getTurnCount(idx)-dice);
			my.setTurnTimes(idx, 1);
		}
		else {
			enemy.subtractHp(10);
			printDamage(10);
			my.setTurnCount(idx, 15);
			my.setTurnTimes(idx, 0);
		}
	}
}
//캐논 : 적에게 10만큼의 피해를 준다 (카운트다운15)