package ItemList;

import Battle.*;
import Character.*;
import Item.Item;

public class PoisonKnife extends Item{

	public PoisonKnife()	{
		name = "독칼";
		description = "[1] 의 피해를 주고 +2 독을 겁니다 (1만 가능, 2개)";
		times=1;
		count=2;
	}	
	
	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		if (dice>1) {
			printIncorrectDice();
			return;
		}
		if (my.getTurnCount(idx)-dice>0) {
			my.setTurnCount(idx, my.getTurnCount(idx)-dice);
			my.setTurnTimes(idx, 1);
		}
		else {
			enemy.subtractHp(1);
			printDamage(1);
			my.setTurnCount(idx, 2);
			my.setTurnTimes(idx, 0);
		}
	}
	
	@Override
	public boolean checkDice(int dice) {
		if (dice>1) {
			check=true;
		}
		return check;
	}
}