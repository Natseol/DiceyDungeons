package ItemList;

import Battle.MyTurn;
import Character.Enemy;
import Character.Player;
import Item.Item;

public class Dagger extends Item{

	public Dagger()	{
		name = "단검";
		description = "ㅁ 의 피해를 줍니다 (최대 3 이하) (재사용 가능)";
		times=-1;
	}
	
	@Override
	public void action(Player player, Enemy enemy, int dice, MyTurn my) {
		enemy.subtractHp(dice);
		printDamage(dice);
	}
	
	@Override
	public boolean checkDice(int dice) {
		if (dice>3) {
			check=true;
		}
		return check;
	}	
}
//단검 : 눈금만큼 피해를 준다 (최대3의 눈금만 사용가능) (재사용가능)
