package Monster;

import Battle.EnemyTurn;
import Character.*;
import Item.*;

public class Marine extends Enemy{
	
	public Marine() {
		name = "우주 해병";
		description = "Go! Go! Go!";
		grade = "일반";
		hp = 26;
		maxHp = 26;	
		diceQuantity = 2;
		inventory = new Item[] {new Cannon(), new Cannon()};		
	}
	
	public void action (Player player, EnemyTurn turn, int num) {		
		inventory[num].action(this, player, turn.getDice(num), turn );
	}
}