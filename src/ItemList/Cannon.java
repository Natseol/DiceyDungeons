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
	public void action(Status player, Status enemy, int dice, MyTurn my) {
		if (count-dice>0) {
			count=count-dice;
			times=1;
		}
		else {
			enemy.subtractHp(10);
			printDamage(10);
			count=15;
			times=0;
		}
	}
	
	@Override
	public void action(Enemy enemy, Player player, int dice, EnemyTurn enemyTurn) {
		if (count-dice>0) {
			count=count-dice;
			times=1;
		}
		else {
			player.subtractHp(10);
			printTakeDamage(10);
			count=15;
			times=1;
		}
	}
}
//캐논 : 적에게 10만큼의 피해를 준다 (카운트다운15)