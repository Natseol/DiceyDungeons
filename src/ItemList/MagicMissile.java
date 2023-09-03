package ItemList;

import Battle.MyTurn;
import Battle.TurnInfo;
import Character.Enemy;
import Character.Player;
import Character.Status;
import Item.Item;

public class MagicMissile extends Item{

	public MagicMissile()	{
		name = "매직미사일";		
		description="[5] 의 피해를 줍니다 (짝수)";
		times=1;
	}	
	
	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		if (dice%2!=0) {
			printIncorrectDice();
			return;
		}
		enemy.subtractHp(5);
		printDamage(5);
		my.setTurnTimes(idx, 0);
	}
	
	@Override
	public boolean checkDice(int dice) {
		if (dice%2!=0) {
			check=true;
		}
		return check;
	}

}