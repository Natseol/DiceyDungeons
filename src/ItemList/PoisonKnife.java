package ItemList;

import Battle.*;
import Character.*;
import Item.Item;

public class PoisonKnife extends Item{

	public PoisonKnife()	{
		name = "독칼";
		description = "[1] 의 독 피해를 줍니다 (1눈 주사위 2개 필요)";
		times=1;
	}	
	
	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		if (dice>1) {
			printIncorrectDice();
			return;
		}

		if (my.getNeedDIce(idx)>0) {
			enemy.subtractHp(1);			
			printDamagePoison(1);
			enemy.setCondition(3,enemy.getCondition(3)+1);
			printPoisoned(1);
			accDamage=0;
			my.setTurnTimes(idx, 0);
			my.setNeedDIce(idx, 0);
		}
		else {
			accDamage += dice;
			my.setNeedDIce(idx, 1);
			my.setTurnTimes(idx, 1);
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