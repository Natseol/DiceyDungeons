package ItemList;

import Battle.MyTurn;
import Battle.TurnInfo;
import Character.Enemy;
import Character.Player;
import Character.Status;
import Item.Item;

public class ShortSword extends Item{

	public ShortSword() {
		name = "짧은 검";
		description = "[2] 의 피해를 줍니다 (재사용 가능)";
		times=-2;
	}	
	
	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		enemy.subtractHp(2);
		printDamage(2);
	}
}