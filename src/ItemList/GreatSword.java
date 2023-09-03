package ItemList;

import Battle.*;
import Character.*;
import Item.Item;

public class GreatSword extends Item{

	public GreatSword()	{
		name = "대검";
		description = "ㅁx3 만큼 피해를 줍니다 (최대 5) (전투당 1번)";
		times=1;
	}	
	
	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		if (dice>5) {
			printIncorrectDice();
			return;
		}
		enemy.subtractHp(3*dice);
		printDamage3(dice);
		my.setTurnTimes(idx, 0);
	}
	
	@Override
	public boolean checkDice(int dice) {
		if (dice>5) {
			check=true;
		}
		return check;
	}
}
//대검 : 눈금x3의 피해를 준다 (전투당 1번만 사용가능)

