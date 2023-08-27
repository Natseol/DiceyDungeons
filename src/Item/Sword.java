package Item;

import Battle.MyTurn;
import Character.Enemy;
import Character.Player;

public class Sword extends Item{

	public Sword()	{
		name = "검";
		description = "ㅁ 만큼 피해를 줍니다";
		times=1;
	}	
	
	@Override
	public void action(Player player, Enemy enemy, int dice, MyTurn my) {
		enemy.subtractHp(dice);
		damage(dice);
		times=0;
	}
}
//검 : 눈금만큼 피해를 준다
