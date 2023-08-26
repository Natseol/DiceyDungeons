package Item;

import Battle.MyTurn;
import Character.Enemy;
import Character.Player;

public class Rising extends Item{

	public Rising()	{
		name = "상승";
		description = "주사위 눈금을 1올린다 (최대 5의 눈금)";
		times=1;
	}
	
	@Override
	public void action(Player player, Enemy enemy, int dice, MyTurn my) {
		changeDice=dice+1;
		times=0;		
	}
	
	@Override
	public boolean checkDice(int dice) {
		if (dice>5) {
			checkPrint();
			check=true;
		}
		return check;
	}
}
//상승 : 주사위 눈금을 1올린다(최대5의 눈금)
