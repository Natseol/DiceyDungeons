package Monster;

import Battle.*;
import Character.*;
import Item.Item;
import ItemList.*;

public class Gatekeeper extends Enemy {

	public Gatekeeper() {
		name = "문지기";
		description = "공방일체";
		grade = "일반";
		maxHp = 26;	
		hp = maxHp;
		diceQuantity = 3;
		inventory = new Item[] {new SpikeShield(), new SpikeShield(), new SpikeShield()};		
	}
	
	public void action (Player player, EnemyTurn turn, int num) {		
		inventory[num].action(this, player, turn.getDice(num), turn);
	}
}
