package Item;

import Battle.MyTurn;
import Character.Enemy;
import Character.Player;

public class Heal extends Item{

	public Heal()	{
		name = "치유";
		recoveryH();
		times=1;
	}	
	
	@Override
	public void action(Player player, Enemy enemy, int dice, MyTurn my) {
		player.addHp(dice);
		recovery(dice);
	}
	@Override
	public boolean checkDice(int dice) {
		if (dice>3) {
			checkPrint();
			check=true;
		}
		return check;
	}
}
//치유 : 눈금만큼체력을 회복한다 (최대 눈금3)