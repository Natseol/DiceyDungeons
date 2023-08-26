package Item;

import Battle.MyTurn;
import Character.Enemy;
import Character.Player;

public class Shield extends Item{

	public Shield()	{
		name = "방패";
		description = "3의 방어력을 얻는다 (홀수만 가능)";
		times=1;
	}	
	
	@Override
	public void action(Player player, Enemy enemy, int dice, MyTurn my) {
		player.setDef(player.getDef()+3);
		gainDefence(3);
		times=0;
	}
	
	@Override
	public boolean checkDice(int dice) {
		if (dice%2==0) {
			checkPrint();
			check=true;
		}
		return check;
	}	
}
