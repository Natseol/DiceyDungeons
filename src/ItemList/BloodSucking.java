package ItemList;

import Battle.*;
import Character.*;
import Item.Item;

public class BloodSucking extends Item{

	public BloodSucking()	{
		name = "흡혈";
		description = "눈금의 반만큼 피를 흡수합니다.";
		times=1;
	}	
	
	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		enemy.subtractHp((dice+1)/2);
		printDamage((dice+1)/2);
		player.addHp((dice+1)/2);
		printRecovery((dice+1)/2);
		my.setTurnTimes(idx, 0);
	}
}
