package ItemList;

import Battle.*;
import Character.*;
import Item.Item;

public class EnhancedScythe extends Item{

	public EnhancedScythe()	{
		name = "낫(강화)";
		description = "ㅁ+1 의 피해를 줍니다. 5 이상일 경우 [3] 만큼 회복합니다";
		times=1;
	}	
	
	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		enemy.subtractHp(dice+1);
		printDamage(dice+1);
		if (dice>=5) {
			player.addHp(3);
			printRecovery(3);
		}
		my.setTurnTimes(idx, 0);
	}
}