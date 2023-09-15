package ItemList;

import Battle.*;
import Character.*;
import Item.Item;

public class TwoHandedSword extends Item{

	public TwoHandedSword()	{
		name = "양손검";
		description = "눈금의 합만큼 피해를 줍니다 (주사위 2개 필요)";
		times=1;
		accDamage=0;
	}		
	
	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		if (my.getNeedDIce(idx)>0) {
			enemy.subtractHp(dice+accDamage);			
			printDamage(dice+accDamage);
			accDamage=0;
			my.setNeedDIce(idx, 0);
			my.setTurnTimes(idx, 0);
		}
		else {
			accDamage += dice;
			my.setNeedDIce(idx, 1);
			my.setTurnTimes(idx, 1);
		}			
	}
}
//검 : 눈금만큼 피해를 준다
