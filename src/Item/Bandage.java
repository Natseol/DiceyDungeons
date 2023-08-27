package Item;

import Battle.MyTurn;
import Character.*;

public class Bandage extends Item {

	public Bandage()	{
		name = "붕대";
		recoveryB();
		times=-1;		
	}	

	@Override
	public void action(Player player, Enemy enemy, int dice, MyTurn my) {
		player.addHp(2);
		recovery(2);
	}
}
//붕대 : 2만큼 체력을 회복한다 (재사용가능)
