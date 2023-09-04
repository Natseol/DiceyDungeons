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
		maxHp = 38;	
		hp = maxHp;
		diceQuantity = 3;
		inventory = new Item[] {new Guard(), new Charge(), new Shield()};		
	}
}
