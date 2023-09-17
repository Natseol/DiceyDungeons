package ItemList;

import Battle.*;
import Character.*;
import Item.Item;

public class Storm extends Item{

	public Storm()	{
		name = "폭풍";
		description = "[18] 의 전기피해를 줍니다 충격+3";
		attack=18;
		elecStack=3;
		count=24;
	}	
	
//	@Override
//	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
//		if (count-dice>0) {
//			my.setTurnCount(idx, my.getTurnCount(idx)-dice);
//			my.setTurnTimes(idx, 1);
//		}
//		else {
//			printDamageIce(18);
//			enemy.subtractHp(18);
//			enemy.setCondition(2,enemy.getCondition(2)+3);
//			my.setTurnTimes(idx, 0);
//			my.setTurnCount(idx, 24);
//		}
//	}
}