package Item;

import Battle.MyTurn;
import Character.Enemy;
import Character.Player;

public class Saw extends Item{	
	public Saw() {
		name = "쇠톱";
		description = "주사위를 셋으로 나눈다";
		times=1;
	}
	
	@Override
	public void action(Player player, Enemy enemy, int dice, MyTurn my) {
		times--;		
		switch (dice) {
		case 6:
			dice = 2;
			my.setOther(0,2);
			my.setOther(1,2);
			break;
		case 5:
			dice = 2;
			my.setOther(0,2);
			my.setOther(1,1);
			break;
		case 4:
			dice = 2;
			my.setOther(0,1);
			my.setOther(1,1);
			break;
		case 3:
			dice = 1;
			my.setOther(0,1);
			my.setOther(1,1);
			break;	
		}
	}
	
	@Override
	public boolean checkDice(int dice) {
		if (dice<3) {
			checkPrint();
			check=true;
		}
		return check;
	}
}
//쇠톱 : 주사위를 셋으로 나눈다
