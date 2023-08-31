package ItemList;

import Battle.MyTurn;
import Character.Enemy;
import Character.Player;
import Character.Status;
import Item.Item;

public class Saw extends Item{	
	public Saw() {
		name = "쇠톱";
		description = "주사위를 셋으로 나눕니다 (최소 3 이상)";
		times=1;
	}
	
	@Override
	public void action(Status player, Status enemy, int dice, MyTurn my) {
		switch (dice) {
		case 6:
			my.setOther(2);
			changeDice = 2;
			my.setOther(0,2);
			my.setOther(1,2);
			times--;	
			break;
		case 5:
			my.setOther(2);
			changeDice = 2;
			my.setOther(0,2);
			my.setOther(1,1);
			times--;	
			break;
		case 4:
			my.setOther(2);
			changeDice = 2;
			my.setOther(0,1);
			my.setOther(1,1);
			times--;	
			break;
		case 3:
			my.setOther(2);
			changeDice = 1;
			my.setOther(0,1);
			my.setOther(1,1);
			times--;	
			break;	
		}
	}
	
	@Override
	public boolean checkDice(int dice) {
		if (dice<3) {
			check=true;
		}
		return check;
	}
}
//쇠톱 : 주사위를 셋으로 나눈다
