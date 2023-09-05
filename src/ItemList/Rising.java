package ItemList;

import Battle.MyTurn;
import Battle.TurnInfo;
import Character.Enemy;
import Character.Player;
import Character.Status;
import Item.Item;

public class Rising extends Item{

	public Rising()	{
		name = "상승";
		description = "주사위 눈금을 1 올립니다";
		times=1;
	}
	
	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		if (dice == 6) {
			changeDice = 6;
			my.setOther(1);
			my.setOther(0,1);
		}
		else {
		changeDice=dice+1;
		}
		my.setTurnTimes(idx, 0);
	}
}
//상승 : 주사위 눈금을 1올린다(최대5의 눈금)
