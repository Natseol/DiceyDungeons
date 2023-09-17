package ItemList;

import Battle.*;
import Character.*;
import Item.Item;
import Item.ItemScript;

public class Scythe extends Item{

	public Scythe()	{
		name = "낫";
		description = "ㅁ 의 피해를 줍니다. 5 이상일 경우 [2] 만큼 회복합니다";
		attack=-1;
		recovery=2;
	}
	
	@Override
	public void actionRecovery(Status player, int dice) {
		if (dice>=5) {
			player.addHp(getRecovery());
			ItemScript.printRecovery(getRecovery());
		}
	};
//	
//	@Override
//	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
//		enemy.subtractHp(dice);
//		printDamage(dice);
//		if (dice>=5) {
//			player.addHp(2);
//			printRecovery(2);
//		}
//		my.setTurnTimes(idx, 0);
//	}
}
