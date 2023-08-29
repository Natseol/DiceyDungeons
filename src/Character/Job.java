package Character;

import Item.Item;
import ItemList.*;

public class Job extends Status {

    protected String job;    

	public String getJob() {
		return job;
	}
	
	public void setJobWarrior() {
		maxHp=26;
		hp=maxHp;
		job = "전사";
		diceQuantity = 2;
		inventory = new Item[6];
		setInventory(0, new Sword());
		setInventory(1, new Axe());
		setInventory(2, new Nothing());
		setInventory(3, new Nothing());
		setInventory(4, new Rising());
		setInventory(5, new Reroll());
	}
	
	public void setJobThief() {
		maxHp=22;
		hp=maxHp;
		job = "도적";
		diceQuantity = 3;
		inventory = new Item[6];
		setInventory(0, new Dagger());
		setInventory(1, new Bow());
		setInventory(2, new Nothing());
		setInventory(3, new Nothing());
		setInventory(4, new LockPick());
		setInventory(5, new Clone());
	}
}
