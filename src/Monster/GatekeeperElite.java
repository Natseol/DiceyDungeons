package Monster;

import Battle.*;
import Character.*;
import Item.Item;
import ItemList.*;

public class GatekeeperElite extends Enemy {

	public GatekeeperElite() {
		name = "강한 문지기";
		description = "강한 공방일체";
		grade = "어려움";
		maxHp = 36;	
		hp = maxHp;
		diceQuantity = 3;
		inventory = new Item[] {new SpikeShield(), new SpikeShield(), new Charge()};		
	}
}