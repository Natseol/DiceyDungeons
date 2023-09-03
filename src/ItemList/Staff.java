package ItemList;

import Battle.MyTurn;
import Battle.TurnInfo;
import Character.Enemy;
import Character.Player;
import Character.Status;
import Item.Item;

public class Staff extends Item{

	public Staff()	{
		name = "스태프";
		description = "ㅁ 만큼 피해를 줍니다 (짝수) (4:주사위를 돌려받습니다)";
		times=1;
	}	
	
	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		enemy.subtractHp(dice);
		if (dice==4) {
			printDamage(dice);
			changeDice = 4;
		}
//		else if(dice==2) {
//			printDamageShock(dice);
//			enemy.setCondition(2,enemy.getCondition(2)+1);
//		}
		else {
			printDamage(dice);
		}
		my.setTurnTimes(idx, 0);
	}
	
	@Override
	public boolean checkDice(int dice) {
		if (dice%2!=0) {
			check=true;
		}
		return check;
	}	
}
//스태프 : 눈금만큼의 피해를 준다(눈금이 4일경우 주사위를 돌려받는다)(짝수주사위만 사용가능)
