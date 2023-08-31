package ItemList;

import Battle.MyTurn;
import Battle.TurnInfo;
import Character.*;
import Item.Item;

public class Axe extends Item{

	public Axe()	{
		name = "도끼";
		description = "ㅁx2 의 피해를 줍니다 (최대 4)";
		times=1;
	}	
	
	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		enemy.subtractHp(2*dice);
		printDamage2(dice);
		my.setTurnTimes(idx, 0);
	}
	
	@Override
	public boolean checkDice(int dice) {
		if (dice>4) {
			check=true;
		}
		return check;
	}
}
//도끼 : 눈금x2의 피해를 준다 (최대4의 눈금만 사용가능)
