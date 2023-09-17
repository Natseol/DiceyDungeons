package ItemList;

import Battle.*;
import Character.*;
import Item.Item;
import Item.ItemScript;

public class FireSword extends Item{

	public FireSword()	{
		name = "불의 검";
		description = "ㅁ 의 피해를 줍니다 5 이상일 경우 화염피해를 줍니다";
		attack=-1;
		fireStack=1;
	}
	@Override
	public void actionFireStack(Status enemy, int dice) {
		if (dice>=5) {
		enemy.setCondition(0,enemy.getCondition(0)+getFireStack());
		ItemScript.printFire(getFireStack());
		}
	};
	
//	@Override
//	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
//		enemy.subtractHp(dice);
//		if (dice>4) {
//			printDamageFire(dice);
//			enemy.setCondition(0,enemy.getCondition(0)+1);
//		}
//		else {
//			printDamage(dice);
//		}
//		my.setTurnTimes(idx, 0);
//	}
}
//검 : 눈금만큼 피해를 준다
