package Item;

import Character.Enemy;
import Character.Player;

public class Clone extends Item{
	
	int[] ohter= new int[2];
	
	public Clone()	{
		name = "위조";
		description = "주사위를 복제한다";
		times=1;
	}
	
	@Override
	public void action(Player player, Enemy enemy, int dice) {
		times=0;		
	}
}
//위조 : 주사위를 복제한다(도적)