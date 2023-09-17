package ItemList;

import Battle.TurnInfo;
import Character.*;
import Dice.Roll;
import Item.Item;

public class Crystal extends Item {

	public Crystal()	{
		name = "크리스탈";
		description="[1] 의 체력을 회복하고 새 주사위를 얻습니다";
		recovery = 1;
		newDice=" ";
	}
	
	@Override
	public void actionNewDice(TurnInfo my, int dice) {
		my.getDiceList().add(Roll.roll6());
	}	

//	@Override
//	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
//		player.addHp(1);
//		printRecovery(1);
//		my.setTurnTimes(idx, 0);		
//	}
}
