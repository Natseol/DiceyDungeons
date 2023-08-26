package Item;

import Battle.MyTurn;
import Character.Enemy;
import Character.Player;

public class Drop extends Item{

	public Drop()	{
		name = "하락";
		description = "주사위 눈금을 1올린다 (최소 2의 눈금)";
		times=1;
	}	
	
	public void action(Player player, Enemy enemy, int dice, MyTurn my) {
		changeDice=dice--;
		times=0;		
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
//하락 : 주사위눈금을 1하락시킨다(최소2의 눈금)
