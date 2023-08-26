package Item;

import Battle.MyTurn;
import Character.Enemy;
import Character.Player;

public class Fist extends Item{

	public Fist() {
		name = "주먹";
		description = "2만큼 피해를 줍니다 (재사용 가능)";
		times=-1;
	}	
	
	@Override
	public void action(Player player, Enemy enemy, int dice, MyTurn my) {
		enemy.setHp(enemy.getHp()-2);
		damage(dice);
	}

}
//주먹 : 2의 피해를 준다 (재사용가능)