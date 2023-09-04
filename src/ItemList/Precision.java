package ItemList;

import Battle.MyTurn;
import Battle.TurnInfo;
import Character.Enemy;
import Character.Player;
import Character.Status;
import Item.Item;

public class Precision extends Item{

	int otherDice = 0;
	
	public Precision()	{
		name = "정밀";
		count=10;
		description = "6 주사위를 2개 얻습니다";
		times=1;		
	}	

	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		if (count-dice>0) {
			my.setTurnCount(idx, my.getTurnCount(idx)-dice);					
		}
		else {
			my.setOther(1);
			changeDice=6;
			my.setOther(0,6);
			my.setTurnTimes(idx, 0);
			my.setTurnCount(idx, 10);
		}
	}
}
//부적 : 6주사위 2개를 얻는다(카운트 10)
