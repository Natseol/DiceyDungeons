package Monster;

import Battle.*;
import Character.*;
import Item.Item;
import ItemList.*;

public class GatekeeperElite extends Enemy {

	public GatekeeperElite() {
		name = "정예 문지기";
		description = "정예 공방일체";
		grade = "어려움";
		maxHp = 50;	
		hp = maxHp;
		diceQuantity = 4;
		inventory = new Item[] {new SpikeShield(), new Bash(), new Charge()};		
	}
}
