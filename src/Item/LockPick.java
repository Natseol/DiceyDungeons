package Item;

import Battle.MyTurn;
import Character.Enemy;
import Character.Player;

public class LockPick extends Item{
		
	public LockPick()	{
		name = "락픽";
		description = "주사위를 둘로 나눈다 (2이상 가능)";
		times=2;
	}
	
	@Override
	public void action(Player player, Enemy enemy, int dice, MyTurn my) {
		switch (dice) {
		case 6:
			my.setOther(1);
			changeDice = 3;
			my.setOther(0,3);
			times--;
			break;
		case 5:
			my.setOther(1);
			changeDice = 3;
			my.setOther(0,2);
			times--;
			break;
		case 4:
			my.setOther(1);
			changeDice = 2;
			my.setOther(0,2);
			times--;
			break;
		case 3:
			my.setOther(1);
			changeDice = 2;
			my.setOther(0,1);
			times--;
			break;
		case 2:
			my.setOther(1);
			changeDice = 1;
			my.setOther(0,1);
			times--;
			break;		
		}
	}
	
	@Override
	public boolean checkDice(int dice) {
		if (dice<2) {
			checkPrint();
			check=true;
		}
		return check;
	}
}
//락픽 : 주사위를 둘로 나눈다(재사용1회 가능)
