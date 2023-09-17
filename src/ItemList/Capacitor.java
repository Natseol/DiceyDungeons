package ItemList;

import Battle.TurnInfo;
import Character.Status;
import Item.Item;

public class Capacitor extends Item{

	public Capacitor()	{
		name = "축전기";
		description="[2] 의 전기 피해를 줍니다 (재사용 가능)";
		attack=2;
		count=5;
		elecStack=1;
		times=-1;
	}	
	
//	@Override
//	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
//		if (count-dice>0) {
//			my.setTurnCount(idx, my.getTurnCount(idx)-dice);
//		}
//		else {
//			enemy.subtractHp(2);		
//			printDamageShock(2);
//			enemy.setCondition(2,enemy.getCondition(2)+1);
//			my.setTurnCount(idx, 5);
//		}
//	}
}