package ItemList;

import Battle.*;
import Character.*;
import Item.Item;

public class Sword extends Item{

	public Sword()	{
		name = "검";
		description = "ㅁ 의 피해를 줍니다";
		times=1;
	}	
	
	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		enemy.subtractHp(dice);
		printDamage(dice);
		my.setTurnTimes(idx, 0);
	}

//	@Override
//	public void action(Enemy enemy, Player player, int dice, EnemyTurn enemyTurn) {
//		player.subtractHp(dice);
//		printTakeDamage(dice);
//		times=0;
//	}
}
//검 : 눈금만큼 피해를 준다
