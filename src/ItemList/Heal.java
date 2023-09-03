package ItemList;

import Battle.MyTurn;
import Battle.TurnInfo;
import Character.Enemy;
import Character.Player;
import Character.Status;
import Item.Item;

public class Heal extends Item{

	public Heal()	{
		name = "치유";
		description="ㅁ 의 체력을 회복합니다 (최대 3)";
		times=1;
	}	
	
	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		if (dice>3) {
			printIncorrectDice();
			return;
		}
		player.addHp(dice);
		printRecovery(dice);
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
//치유 : 눈금만큼체력을 회복한다 (최대 눈금3)