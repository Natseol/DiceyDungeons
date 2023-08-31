package ItemList;

import Battle.MyTurn;
import Battle.TurnInfo;
import Character.Enemy;
import Character.Player;
import Character.Status;
import Item.Item;

public class Talisman extends Item{

	int otherDice = 0;
	
	public Talisman()	{
		name = "부적";
		count=10;
		description = "6 주사위를 2개 얻습니다 (카운트 10)";
		times=1;		
	}	

	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		if (count-dice>0) {
			count-=dice;					
		}
		else {
			my.setOther(1);
			changeDice=6;
			my.setOther(0,6);
			my.setTurnTimes(idx, 0);
			count=10;
		}
	}
}
//부적 : 6주사위 2개를 얻는다(카운트 10)
