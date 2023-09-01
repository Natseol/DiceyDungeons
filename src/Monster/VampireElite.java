package Monster;

import Battle.*;
import Character.*;
import Item.Item;
import ItemList.*;

public class VampireElite extends Enemy {

	public VampireElite() {
		name = "되살아난 뱀파이어";
		description = "다시 살아돌아왔습니다";
		grade = "보스";
		maxHp = 52;	
		hp = maxHp;
		diceQuantity = 4;
		inventory = new Item[] {new Scythe(), new Scythe(), new Scythe(), new Scythe()};		
	}
}