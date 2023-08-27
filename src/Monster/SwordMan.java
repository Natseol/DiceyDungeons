package Monster;

import Battle.*;
import Character.*;
import Item.*;

public class SwordMan extends Enemy{

	public SwordMan() {
		name = "검의 달인";
		description = "전사가 아닙니다";
		grade = "일반";
		hp = 20;
		maxHp = 20;	
		diceQuantity = 2;
		inventory = new Item[] {new Sword(), new Sword()};		
	}
	
	public void action (Player player, EnemyTurn turn, int num) {		
		inventory[num].action(this, player, turn.getDice(num), turn );
	}
}
