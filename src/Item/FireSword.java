package Item;

import Battle.*;
import Character.*;

public class FireSword extends Item{

	public FireSword()	{
		name = "불의 검";
		description = "ㅁ 의 피해를 줍니다 5 이상일 경우 화염피해를 줍니다";
		times=1;
	}	
	
	@Override
	public void action(Player player, Enemy enemy, int dice, MyTurn my) {
		enemy.subtractHp(dice);
		damage(dice);
		times=0;
	}

	@Override
	public void action(Enemy enemy, Player player, int dice, EnemyTurn enemyTurn) {
		player.subtractHp(dice);
		player.setCondition(0,player.getCondition(0)+1);//차후구현
		takeFire(dice);
		times=0;
	}
}
//검 : 눈금만큼 피해를 준다
