package Monster;

import Battle.*;
import Character.*;
import Item.Item;
import ItemList.*;

public class Witch extends Enemy {

	public Witch() {
		name = "마녀";
		description = " ";
		grade = "어려움";
		maxHp = 54;	
		hp = maxHp;
		diceQuantity = 4;
		inventory = new Item[] {new SpareWitch(), new Wand(), new Meteor()};		
	}
}