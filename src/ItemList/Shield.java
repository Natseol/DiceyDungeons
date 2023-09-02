package ItemList;

import Battle.MyTurn;
import Battle.TurnInfo;
import Character.Enemy;
import Character.Player;
import Character.Status;
import Item.Item;

public class Shield extends Item{

	public Shield()	{
		name = "방패";
		description = "[2] 의 방어력을 얻습니다 (홀수) (재사용 가능)";
		times=-1;
	}	
	
	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		if (dice%2==0) {
			printIncorrectDice();
			return;
		}
		player.setDef(player.getDef()+3);
		printGainDefence(3);
	}
	
	@Override
	public boolean checkDice(int dice) {
		if (dice%2==0) {
			check=true;
		}
		return check;
	}	
}
