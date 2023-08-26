package Item;

import Battle.MyTurn;
import Character.Enemy;
import Character.Player;

public class LockPick extends Item{
		
	public LockPick()	{
		name = "락픽";
		description = "주사위를 둘로 나눈다 (재사용 1회 가능)";
		times=2;
	}
	
	@Override
	public void action(Player player, Enemy enemy, int dice, MyTurn my) {
		times--;		
		switch (dice) {
		case 6:
			dice = 3;
			my.setOther(0,3);
			break;
		case 5:
			dice = 3;
			my.setOther(0,2);
			break;
		case 4:
			dice = 2;
			my.setOther(0,2);
			break;
		case 3:
			dice = 2;
			my.setOther(0,1);
			break;
		case 2:
			dice = 1;
			my.setOther(0,1);
			break;
		case 1:
			checkPrint();
			check=true;
			times++;
			break;			
		}
	}
}
//락픽 : 주사위를 둘로 나눈다(재사용1회 가능)
