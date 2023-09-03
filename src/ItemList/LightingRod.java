package ItemList;

import Battle.TurnInfo;
import Character.Status;
import Item.Item;

public class LightingRod extends Item{

	public LightingRod()	{
		name = "피뢰침";
		description = "ㅁ 의 전기 피해를 줍니다 (최대 4)";
		times=1;
	}
	
	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		if (dice>4) {
			printIncorrectDice();
			return;
		}
		enemy.subtractHp(dice);
		printDamageShock(dice);
		enemy.setCondition(2,enemy.getCondition(2)+1);
		my.setTurnTimes(idx, 0);
	}
	
	@Override
	public boolean checkDice(int dice) {
		if (dice>4) {
			check=true;
		}
		return check;
	}	
}