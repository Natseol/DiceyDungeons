package ItemList;

import Battle.*;
import Character.*;
import Item.Item;

public class Charge extends Item{

	public Charge()	{
		name = "격돌";
		description = "[1+방어력] 의 피해를 줍니다 (최소 3)";
		times=1;
	}	
	
	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		if (dice<3) {
			printIncorrectDice();
			return;
		}
		enemy.subtractHp(1+player.getDef());
		printDamage(1+player.getDef());
		my.setTurnTimes(idx, 0);
	}
	@Override
	public boolean checkDice(int dice) {
		if (dice<3) {
			check=true;
		}
		return check;
	}	
}