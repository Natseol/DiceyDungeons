package Monster;

import Battle.*;
import Character.*;
import Item.Item;
import ItemList.*;

public class SnowMan extends Enemy{

	public SnowMan() {
		name = "눈사람";
		description = "눈.사.람";
		grade = "일반";
		maxHp = 40;	
		hp = maxHp;
		diceQuantity = 3;
		inventory = new Item[] {new IceShards(), new IceShards(), new IceShards()};		
	}
}