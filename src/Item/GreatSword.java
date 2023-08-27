package Item;

import Battle.MyTurn;
import Character.Enemy;
import Character.Player;

public class GreatSword extends Item{

	public GreatSword()	{
		name = "대검";
		description = "ㅁx3 만큼 피해를 줍니다 (전투당 1번 사용가능)";
		times=1;
	}	
	
	@Override
	public void action(Player player, Enemy enemy, int dice, MyTurn my) {
		enemy.subtractHp(3*dice);
		damage(dice);
		damage(dice,1);
		damage(dice,1,2);
		times=0;
	}
}
//대검 : 눈금x3의 피해를 준다 (전투당 1번만 사용가능)
//미완성
