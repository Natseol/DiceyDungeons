package Item;

import Battle.MyTurn;
import Character.*;

public class Boomerang extends Item{

	public Boomerang()	{
		name = "부메랑";
		description = "ㅁx2 의 피해를 주고 ㅁ 의 피해를 받습니다";
		times=1;
	}	
	
	@Override
	public void action(Player player, Enemy enemy, int dice, MyTurn my) {
		enemy.subtractHp(2*dice);
		damage(dice);
		damage(dice,1);
		System.out.println();
		player.subtractHp(dice);		
		takeDamage(dice);
		times=0;
	}	
}
//부메랑 : 눈금의 2배만큼 피해를 준다. 주사위 눈금만큼 피해를 받는다.