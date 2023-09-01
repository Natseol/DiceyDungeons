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
		inventory[0]= new Sword();
		inventory[1]= new Axe();
		inventory[2]= new Nothing();
		inventory[3]= new Nothing();
		inventory[4]= new Reroll();
	}
	
	public void setJobThief() {
		maxHp=22;
		hp=maxHp;
		job = "도적";
		diceQuantity = 2;
		setItemThief();
	}
	
	public void setItemThief() {
		inventory[0]= new Dagger();  
		inventory[1]= new Knife();     
		inventory[2]= new Nothing(); 
		inventory[3]= new Nothing();
		inventory[4]= new LockPick(); 
	}
	
	public void setJobArcher() {
		maxHp=24;
		hp=maxHp;
		job = "궁수";
		diceQuantity = 2;
		setItemArcher();
	}
	
	public void setItemArcher() {
		inventory[0]= new Bow();  
		inventory[1]= new Crossbow(); //덫:카운트    
		inventory[2]= new Nothing(); 
		inventory[3]= new Nothing(); 
		inventory[4]= new Clone();
	}
	
	
	public void setJobMagician() {
		maxHp=22;
		hp=maxHp;
		job = "마법사";
		diceQuantity = 2;
		setItemMagician();
	}
	
	public void setItemMagician() {
		inventory[0]= new Wand();  
		inventory[1]= new IceShards();     
		inventory[2]= new Nothing(); 
		inventory[3]= new Nothing(); 
		inventory[4]= new Heal();
	}
	
	public void setJobKnight() {
		maxHp=28;
		hp=maxHp;
		job = "기사";
		diceQuantity = 2;
		setItemKnight();
	}
	
	public void setItemKnight() {
		inventory[0]= new SpikeShield();  
		inventory[1]= new Charge();     
		inventory[2]= new Nothing(); 
		inventory[3]= new Nothing(); 
		inventory[4]= new Shield();
	}
}
