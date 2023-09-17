package ItemList;

import Battle.*;
import Character.*;
import Item.Item;

public class IcePillar extends Item{

	public IcePillar()	{
		name = "얼음기둥";
		description = "[두번째 눈금+3] 의 얼음 피해를 줍니다 (홀수 주사위 2개 필요)";
		limit="1 3 5";
		attack=1;
		iceStack=1;
		needDice=1;
		times=1;
	}
	
	@Override
	public void actionAttack(Status player, Status enemy, int dice) {
		enemy.subtractHp(dice+3);
		printDamage(dice+3);
	}
	
//	@Override
//	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
//		if (dice%2==0) {
//			printIncorrectDice();
//			return;
//		}
//		
//		if (my.getNeedDIce(idx)>0) {
//			enemy.subtractHp(dice+3);			
//			printDamageIce(dice+3);
//			enemy.setCondition(1,enemy.getCondition(1)+1);
//			accDamage=0;
//			my.setTurnTimes(idx, 0);
//			my.setNeedDIce(idx, 0);
//		}
//		else {
//			accDamage += dice;
//			my.setNeedDIce(idx, 1);
//			my.setTurnTimes(idx, 1);
//		}	
//		
//	}
//	
//	@Override
//	public boolean checkDice(int dice) {
//		if (dice%2==0) {
//			check=true;
//		}
//		return check;
//	}
}