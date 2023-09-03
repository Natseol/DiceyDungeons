package ItemList;

import Battle.*;
import Character.*;
import Item.Item;

public class EnhancedBlood extends Item{

	public EnhancedBlood()	{
		name = "흡혈(강화)";
		description = "눈금의 반만큼 피해를 주고 +1만큼 더해서 체력을 흡수합니다.";
		times=1;
	}	
	
	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		enemy.subtractHp((dice+1)/2);
		printDamage((dice+1)/2);
		player.addHp(((dice+1)/2)+1);
		printRecovery(((dice+1)/2)+1);
		my.setTurnTimes(idx, 0);
	}
}
