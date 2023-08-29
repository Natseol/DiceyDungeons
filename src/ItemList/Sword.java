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
	public void action(Player player, Enemy enemy, int dice, MyTurn my) {
		enemy.subtractHp(dice);
		printDamage(dice);
		times=0;
	}

	@Override
	public void action(Enemy enemy, Player player, int dice, EnemyTurn enemyTurn) {
		player.subtractHp(dice);
		printTakeDamage(dice);
		times=0;
	}
}
//검 : 눈금만큼 피해를 준다
