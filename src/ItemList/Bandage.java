package ItemList;

import Battle.MyTurn;
import Character.*;
import Item.Item;

public class Bandage extends Item {

	public Bandage()	{
		name = "붕대";
		description="[2] 의 체력을 회복합니다 (재사용 가능)";
		times=-1;		
	}	

	@Override
	public void action(Player player, Enemy enemy, int dice, MyTurn my) {
		player.addHp(2);
		printRecovery(2);
	}
}
//붕대 : 2만큼 체력을 회복한다 (재사용가능)
