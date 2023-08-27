package Item;

import Battle.*;
import Character.*;

public class Scythe extends Item{

	public Scythe()	{
		name = "낫";
		description = "ㅁ 의 피해를 줍니다. 5 이상일 경우 2 의 체력을 회복합니다";
		times=1;
	}	
	
	@Override
	public void action(Player player, Enemy enemy, int dice, MyTurn my) {
		enemy.subtractHp(dice);
		damage(dice);
		if (dice>=5) {
			player.addHp(2);
		}
		recovery(2);
		times=0;
	}

	@Override
	public void action(Enemy enemy, Player player, int dice, EnemyTurn enemyTurn) {
		player.subtractHp(dice);		
		damage(dice);
		if (dice>=5) {
			enemy.addHp(2);
			recovery(2);
		}		
		times=0;
	}
}
//검 : 눈금만큼 피해를 준다
