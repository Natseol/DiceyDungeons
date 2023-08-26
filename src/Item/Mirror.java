package Item;

import Battle.MyTurn;
import Character.Enemy;
import Character.Player;

public class Mirror extends Item{

	public Mirror()	{
		name = "거울";
		description = "이 전투에서 주사위 갯수 +1 (눈금 6만 가능)";
		times=1;
	}
	
	@Override
	public void action(Player player, Enemy enemy, int dice, MyTurn my) {
		player.setDiceQuantity(player.getDiceQuantity()+1);
		times=0;		
	}
	
	@Override
	public boolean checkDice(int dice) {
		if (dice!=6) {
			checkPrint();
			check=true;
		}
		return check;
	}
}
//거울 : 이 전투에서 주사위 갯수 +1 (눈금6만 가능)
