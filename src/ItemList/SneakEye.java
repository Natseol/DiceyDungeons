package ItemList;

import Battle.MyTurn;
import Battle.TurnInfo;
import Character.Enemy;
import Character.Player;
import Character.Status;
import Item.Item;

public class SneakEye extends Item{
	
	public SneakEye()	{
		name = "뱀의눈";
		count=5;
		description = "1 주사위를 2개 얻습니다";
		times=1;		
	}	

	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		if (count-dice>0) {
			my.setTurnCount(idx, my.getTurnCount(idx)-dice);					
		}
		else {
			my.setOther(1);
			changeDice=1;
			my.setOther(0,1);
			my.setTurnTimes(idx, 0);
			my.setTurnCount(idx, 5);
		}
	}
}