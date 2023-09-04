package ItemList;

import Battle.TurnInfo;
import Character.Status;
import Item.Item;

public class Spatula extends Item{

	public Spatula()	{
		name = "주걱";
		description = "눈금을 뒤집습니다";
		times=1;
	}	
	
	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		changeDice=7-dice;
		my.setTurnTimes(idx, 0);		
	}
}

//예비 : 눈금4 주사위를 획득한다