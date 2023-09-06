package ItemList;

import Battle.MyTurn;
import Battle.TurnInfo;
import Character.*;
import Item.Item;

public class Crossbow extends Item{
	
	public Crossbow()	{
		name = "석궁";
		count=13;
		description="[13-마지막 눈금] 의 피해를 줍니다 (2이하: 화염피해 추가)";
		times=1;		
	}	
	
	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		if (my.getTurnCount(idx)-dice>0) {
			my.setTurnCount(idx, my.getTurnCount(idx)-dice);
			my.setTurnTimes(idx, 1);
		}
		else {
			enemy.subtractHp(12-dice);
			if (dice<=2) {
				printDamageFire(12-dice);
				enemy.setCondition(0,enemy.getCondition(0)+1);
			}
			else {
				printDamage(12-dice);
			}
			my.setTurnTimes(idx, 0);
			my.setTurnCount(idx, 13);
		}
	}
}
