package ItemList;

import Battle.MyTurn;
import Character.Enemy;
import Character.Player;
import Item.Item;

public class MedicKit extends Item{
	
	public MedicKit()	{
		name = "구급상자";
		count=16;
		description="8 의 체력을 회복합니다 (카운트 16)";
		times=1;		
	}	
	
	@Override
	public void action(Player player, Enemy enemy, int dice, MyTurn my) {
		if (count-dice>0) {
			count-=dice;
			times=1;
		}
		else {
			player.addHp(8);
			printRecovery(8);
			count=16;
			times=0;
		}
	}
}
//구급상자 : 8만큼 체력을 회복한다 (카운트16)