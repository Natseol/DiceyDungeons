package Character;

import Field.Store;
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
		setItemWarrior();
	}
	
	public void setItemWarrior() {
		inventory = new Item[6];
		inventory[0]= new Sword();
		inventory[1]= new Axe();
		inventory[2]= new IceShards();
		inventory[3]= new Nothing();
		inventory[4]= new Rising();
		inventory[5]= new Reroll();
	}
	
	public void setJobThief() {
		maxHp=22;
		hp=maxHp;
		job = "도적";
		diceQuantity = 3;
		setItemThief();
	}
	
	public void setItemThief() {
		inventory = new Item[6];
		inventory[0]= new Dagger();  
		inventory[1]= new Bow();     
		inventory[2]= new Nothing(); 
		inventory[3]= new Nothing(); 
		inventory[4]= new LockPick();
		inventory[5]= new Clone(); 
	}
}
