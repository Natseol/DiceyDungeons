package Monster;

import Battle.*;
import Character.*;
import Item.Item;
import ItemList.*;

public class Fighter extends Enemy{

	public Fighter() {
		name = "투사";
		description = "전사가 아닙니다";
		grade = "보통";
		maxHp = 26;	
		hp = maxHp;
		diceQuantity = 2;
		inventory = new Item[] {new Glove(), new Glove()};		
	}
}
