package ItemList;

import Battle.MyTurn;
import Character.Enemy;
import Character.Player;
import Item.Item;

public class Fist extends Item{

	public Fist() {
		name = "주먹";
		description = "[2] 의 피해를 줍니다 (재사용 가능)";
		times=-1;
	}	
	
	@Override
	public void action(Player player, Enemy enemy, int dice, MyTurn my) {
		enemy.subtractHp(2);
		printDamage(dice);
	}

}
//주먹 : 2의 피해를 준다 (재사용가능)