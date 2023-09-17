package ItemList;

import Battle.TurnInfo;
import Character.Status;
import Item.Item;

public class Icicle extends Item{

	public Icicle()	{
		name = "고드름";
		description = "냉기 +1 을 주고 눈금 1 주사위를 얻는다";
		attack=1;
		iceStack=1;
		newDice="1";
	}	
	
//	@Override
//	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
//		printIced(1);
//		enemy.setCondition(1,enemy.getCondition(1)+1);
//		my.setTurnTimes(idx, 0);		
//	}
}