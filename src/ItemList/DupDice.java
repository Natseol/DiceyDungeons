package ItemList;

import Battle.TurnInfo;
import Character.Status;
import Item.Item;

public class DupDice extends Item{

	public DupDice()	{
		name = "두사위";
		description = "눈금을 2배로 만듭니다 (최대 3)";
		times=1;
	}	
	
	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		if (dice>3) {
			printIncorrectDice();
			return;
		}
		changeDice=dice*2;
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
