package ItemList;

import Battle.MyTurn;
import Battle.TurnInfo;
import Character.Enemy;
import Character.Player;
import Character.Status;
import Item.Item;

public class MedicKit extends Item{
	
	public MedicKit()	{
		name = "구급상자";
		count=16;
		description="8 의 체력을 회복합니다 (카운트 16)";
		times=1;		
	}	
	
	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		if (count-dice>0) {
			count-=dice;
			my.setTurnTimes(idx, 1);
		}
		else {
			player.addHp(8);
			printRecovery(8);
			count=16;
			my.setTurnTimes(idx, 0);
		}
	}
}
//구급상자 : 8만큼 체력을 회복한다 (카운트16)
