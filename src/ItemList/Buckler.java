package ItemList;

import Battle.*;
import Character.*;
import Item.Item;

public class Buckler extends Item{

	public Buckler()	{
		name = "버클러";
		description = "[4] 의 방어력을 얻습니다";
		defence=4;
		count=7;
	}	
	
//	@Override
//	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
//		if (my.getTurnCount(idx)-dice>0) {
//			my.setTurnCount(idx, my.getTurnCount(idx)-dice);
//			my.setTurnTimes(idx, 1);
//		}
//		else {
//			player.setDef(player.getDef()+4);
//			printGainDefence(4);
//			my.setTurnCount(idx, 7);
//			my.setTurnTimes(idx, 0);
//		}
//	}
}