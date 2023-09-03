package ItemList;

import Battle.MyTurn;
import Battle.TurnInfo;
import Character.Enemy;
import Character.Player;
import Character.Status;
import Item.Item;

public class IceSword extends Item{

	public IceSword()	{
		name = "냉기의 검";		
		description="4 의 얼음 피해를 줍니다 (3 or 5만 가능)";
		times=1;
	}	
	
	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		if (dice!=3||dice!=5) {
			printIncorrectDice();
			return;
		}
		enemy.subtractHp(4);
		printDamageIce(4);
		my.setTurnTimes(idx, 0);
		enemy.setCondition(1,enemy.getCondition(1)+1);
	}
	
	@Override
	public boolean checkDice(int dice) {
		if (dice!=3||dice!=5) {
			check=true;
		}
		return check;
	}
}