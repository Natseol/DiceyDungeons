package ItemList;

import Battle.MyTurn;
import Battle.TurnInfo;
import Character.Enemy;
import Character.Player;
import Character.Status;
import Item.Item;

public class Guard extends Item{

	public Guard()	{
		name = "막기";
		description = "[3] 의 방어력을 얻습니다 (홀수)";
		times=1;
	}	
	
	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		if (dice%2==0) {
			printIncorrectDice();
			return;
		}
		player.setDef(player.getDef()+3);
		printGainDefence(3);
		my.setTurnTimes(idx, 0);
	}
	
	@Override
	public boolean checkDice(int dice) {
		if (dice%2==0) {
			check=true;
		}
		return check;
	}	
}