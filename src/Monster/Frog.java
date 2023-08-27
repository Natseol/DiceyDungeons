package Monster;

import Battle.*;
import Character.*;
import Item.*;

public class Frog extends Enemy{

	public Frog() {
		name = "개구리";
		description = "그 개구리 맞습니다";
		grade = "일반";
		hp = 18;
		maxHp = 18;	
		diceQuantity = 2;
		inventory = new Item[] {new Sword(), new Sword()};		
	}
	
	public void action (Player player, EnemyTurn turn, int num) {		
		inventory[num].action(this, player, turn.getDice(num), turn );
	}
}
