package Item;

import Battle.MyTurn;
import Character.Enemy;
import Character.Player;

public class Dagger extends Item{

	public Dagger()	{
		name = "단검";
		description = "ㅁ 만큼 피해를 줍니다 (최대 3) (재사용 가능)";
		times=-1;
	}
	
	@Override
	public void action(Player player, Enemy enemy, int dice, MyTurn my) {
		enemy.setHp(enemy.getHp()-dice);
		damage(dice);
	}
	
	@Override
	public boolean checkDice(int dice) {
		if (dice>3) {
			checkPrint();
			check=true;
		}
		return check;
	}	
}
//단검 : 눈금만큼 피해를 준다 (최대3의 눈금만 사용가능) (재사용가능)
