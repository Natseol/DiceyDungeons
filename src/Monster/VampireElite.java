package Monster;

import Battle.*;
import Character.*;
import Item.Item;
import ItemList.*;

public class VampireElite extends Enemy {

	public VampireElite() {
		name = "부활한 뱀파이어";
		description = "다시 살아돌아왔습니다";
		grade = "보스";
		maxHp = 58;	
		hp = maxHp;
		diceQuantity = 4;
		inventory = new Item[] {new Scythe(), new BloodSucking(), new UnholySword(), new Death()};		
	}
}