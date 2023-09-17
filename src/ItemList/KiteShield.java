package ItemList;

import Battle.*;
import Character.*;
import Item.Item;

public class KiteShield extends Item{

	public KiteShield()	{
		name = "카이트쉴드";
		description = "[8] 의 방어력을 얻습니다";
		defence=8;
		count=14;
	}	
	
//	@Override
//	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
//		if (my.getTurnCount(idx)-dice>0) {
//			my.setTurnCount(idx, my.getTurnCount(idx)-dice);
//			my.setTurnTimes(idx, 1);
//		}
//		else {
//			player.setDef(player.getDef()+8);
//			printGainDefence(8);
//			my.setTurnCount(idx, 14);
//			my.setTurnTimes(idx, 0);
//		}
//	}
}