package Item;

import Battle.MyTurn;
import Character.Enemy;
import Character.Player;

public class UsedGreat extends Item{

	public UsedGreat()	{
		name = "빈슬롯";
		description = "사용한 대검";
		times=0;
	}
	
	@Override
	public void action(Player player, Enemy enemy, int dice, MyTurn my) {
		changeDice = dice;
	}
}
