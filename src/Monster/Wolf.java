package Monster;

import Character.*;
import Item.Item;
import ItemList.*;

public class Wolf extends Enemy{

	public Wolf() {
		name = "늑대";
		description = "발톱을 숨기고 있습니다";
		grade = "보통";
		maxHp = 46;	
		hp = maxHp;
		diceQuantity = 3;
		inventory = new Item[] {new Claw(), new Claw(), new Infection()};		
	}
}