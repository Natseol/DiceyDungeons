package ItemList;

import Battle.*;
import Character.*;
import Item.Item;

public class FireSword extends Item{

	public FireSword()	{
		name = "불의 검";
		description = "ㅁ 의 피해를 줍니다 5 이상일 경우 화염피해를 줍니다";
		times=1;
	}	
	
	@Override
	public void action(Status player, Status enemy, int dice, MyTurn my) {
		enemy.subtractHp(dice);
		printDamage(dice);
		times=0;
	}

	@Override
	public void action(Enemy enemy, Player player, int dice, EnemyTurn enemyTurn) {
		player.subtractHp(dice);
		if (dice>4) {
			printTakeFire(dice);
			player.setCondition(0,player.getCondition(0)+1);
		}
		else {
			printDamage(dice);
		}
		times=0;
	}
}
//검 : 눈금만큼 피해를 준다
