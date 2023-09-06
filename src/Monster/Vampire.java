package Monster;

import Battle.*;
import Character.*;
import Item.Item;
import ItemList.*;

public class Vampire extends Enemy {

	public Vampire() {
		name = "뱀파이어";
		description = "당신이 알고 있는 그것 맞습니다";
		grade = "어려움";
		maxHp = 58;	
		hp = maxHp;
		diceQuantity = 4;
		inventory = new Item[] {new Scythe(), new BloodSucking(), new Sword()};		
	}
}