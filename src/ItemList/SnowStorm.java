package ItemList;

import Battle.*;
import Character.*;
import Item.Item;

public class SnowStorm extends Item{

	public SnowStorm()	{
		name = "눈폭풍";
		description = "[6] 의 냉기피해를 줍니다";
		attack=6;
		iceStack=1;
		count=8;
	}	
	
//	@Override
//	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
//		if (count-dice>0) {
//			my.setTurnCount(idx, my.getTurnCount(idx)-dice);
//			my.setTurnTimes(idx, 1);
//		}
//		else {
//			printDamageIce(6);
//			enemy.subtractHp(6);
//			enemy.setCondition(1,enemy.getCondition(1)+1);
//			my.setTurnTimes(idx, 0);
//			my.setTurnCount(idx, 8);
//		}
//	}
}