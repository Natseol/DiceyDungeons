package ItemList;

import Battle.MyTurn;
import Character.Enemy;
import Character.Player;
import Item.Item;

public class Staff extends Item{

	public Staff()	{
		name = "스태프";
		description = "ㅁ 만큼 피해를 줍니다 (짝수) (4 일경우 주사위를 돌려받습니다)";
		times=1;
	}	
	
	@Override
	public void action(Player player, Enemy enemy, int dice, MyTurn my) {
		enemy.subtractHp(dice);
		printDamage(dice);
		times=0;
		if (dice==4) {
			changeDice = 4;
		}
	}
	
	@Override
	public boolean checkDice(int dice) {
		if (dice%2!=0) {
			check=true;
		}
		return check;
	}	
}
//스태프 : 눈금만큼의 피해를 준다(눈금이 4일경우 주사위를 돌려받는다)(짝수주사위만 사용가능)
