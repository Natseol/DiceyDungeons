package Monster;

import Battle.*;
import Character.*;
import Item.Item;
import ItemList.*;

public class Scholar extends Enemy{

	public Scholar() {
		name = "학자";
		description = "불을 다룹니다";
		grade = "일반";
		maxHp = 24;	
		hp = maxHp;
		diceQuantity = 2;
		inventory = new Item[] {new Burn(), new Wand()};		
	}
}
