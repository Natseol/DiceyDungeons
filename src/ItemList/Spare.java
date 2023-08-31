package ItemList;

import Battle.MyTurn;
import Battle.TurnInfo;
import Character.Enemy;
import Character.Player;
import Character.Status;
import Item.Item;

public class Spare extends Item{

	public Spare()	{
		name = "예비";
		description = "눈금 4 주사위를 획득한다";
		times=1;
	}	
	
	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		changeDice=4;
		my.setTurnTimes(idx, 0);		
	}
}

//예비 : 눈금4 주사위를 획득한다