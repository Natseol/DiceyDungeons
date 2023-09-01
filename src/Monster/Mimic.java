package Monster;

import Battle.*;
import Character.*;
import Item.Item;
import ItemList.*;

public class Mimic extends Enemy{

	public Mimic() {
		name = "미믹";
		description = "알 수 없음";
		grade = "일반";
		maxHp = 28;	
		hp = maxHp;
		diceQuantity = 2;
		inventory = new Item[] {new Unknown(), new Unknown()};		
	}
}