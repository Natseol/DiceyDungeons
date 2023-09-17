package ItemList;

import Battle.MyTurn;
import Battle.TurnInfo;
import Character.Enemy;
import Character.Player;
import Character.Status;
import Item.Item;

public class Saw extends Item{	
	public Saw() {
		name = "쇠톱";
		description = "주사위를 셋으로 나눕니다 (최소 3)";
		limit="3 4 5 6";
		newDice=" ";
	}
	
	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		switch (dice) {
		case 6:
			my.getDiceList().add(2);
			my.getDiceList().add(2);
			my.getDiceList().add(2);
			my.setTurnTimes(idx, 0);	
			break;
		case 5:
			my.getDiceList().add(2);
			my.getDiceList().add(1);
			my.getDiceList().add(2);
			my.setTurnTimes(idx, 0);	
			break;
		case 4:
			my.getDiceList().add(2);
			my.getDiceList().add(1);
			my.getDiceList().add(1);
			my.setTurnTimes(idx, 0);	
			break;
		case 3:
			my.getDiceList().add(1);
			my.getDiceList().add(1);
			my.getDiceList().add(1);
			my.setTurnTimes(idx, 0);	
			break;	
		}
	}
	
//	@Override
//	public boolean checkDice(int dice) {
//		if (dice<3) {
//			check=true;
//		}
//		return check;
//	}
}
//쇠톱 : 주사위를 셋으로 나눈다
