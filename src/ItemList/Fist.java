package ItemList;

import Battle.MyTurn;
import Battle.TurnInfo;
import Character.Enemy;
import Character.Player;
import Character.Status;
import Item.Item;

public class Fist extends Item{

	public Fist() {
		name = "주먹질";
		description = "[3] 의 피해를 줍니다 (턴당 2번)";
		times=2;
	}	
	
	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		enemy.subtractHp(3);
		printDamage(3);
		my.setTurnTimes(idx, my.getTurnTimes(idx)-1);
	}
}
