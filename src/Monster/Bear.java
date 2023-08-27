package Monster;

import Battle.*;
import Character.*;
import Item.*;

public class Bear extends Enemy{

	public Bear() {
		name = "곰";
		description = "야생 그 자체";
		grade = "어려움";
		maxHp = 40;
		hp = maxHp;
		diceQuantity = 2;
		inventory = new Item[] {new Overwhelming(), new Overwhelming()};		
	}
	
	public void action (Player player, EnemyTurn turn, int num) {		
		inventory[num].action(this, player, turn.getDice(num), turn );
	}
}
