package Item;

import Battle.MyTurn;
import Character.Enemy;
import Character.Player;

public class Clone extends Item{
	
	public Clone()	{
		name = "위조";
		description = "주사위를 복제합니다";
		times=1;
	}
	
	@Override
	public void action(Player player, Enemy enemy, int dice, MyTurn my) {
		my.setOther(1);
		changeDice=dice;
		my.setOther(0,dice);
		times=0;		
	}
}
//위조 : 주사위를 복제한다(도적)