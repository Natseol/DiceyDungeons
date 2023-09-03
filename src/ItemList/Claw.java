package ItemList;

import Battle.TurnInfo;
import Character.Status;
import Item.Item;

public class Claw extends Item{

	public Claw()	{
		name = "발톱";
		description = "ㅁ 의 독 피해를 줍니다 (최대 3)";
		times=1;
	}
	
	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		if (dice>3) {
			printIncorrectDice();
			return;
		}
		enemy.subtractHp(3);
		printDamage(3);
		enemy.setCondition(3,enemy.getCondition(0)+1);
		printPoisoned(1);
		my.setTurnTimes(idx, 0);
	}
	
	@Override
	public boolean checkDice(int dice) {
		if (dice>3) {
			check=true;
		}
		return check;
	}	
}