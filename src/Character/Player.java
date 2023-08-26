package Character;

import Item.*;

public class Player extends Status {
	protected int exp=0;
	protected int level=1;
	protected Item[] inventory = new Item[6];
    protected String job;
	
	public Player() {}
	
	public Player(int num) {
		this();
		switch (num) {
		case 1 :
			hp=30;
			maxHp=30;
			job = "전사";
			diceQuantity = 2;
			this.setInventory(0, new Sword());
			this.setInventory(1, new Axe());
			this.setInventory(2, new Rising());
			this.setInventory(3, new Nothing());
			this.setInventory(4, new Nothing());
			this.setInventory(5, new Reroll());
		break;
		case 2 :
			hp=24;
			maxHp=24;
			job = "도적";
			diceQuantity = 3;
			this.setInventory(0, new Dagger());
			this.setInventory(1, new Bow());
			this.setInventory(2, new LockPick());
			this.setInventory(3, new Nothing());
			this.setInventory(4, new Nothing());
			this.setInventory(5, new Clone());
		}
		
	}
	
	public Player (int hp, int maxHp, int diceQuantity) {
		super(hp,maxHp,diceQuantity);
		this.hp = hp;
		this.maxHp=maxHp;
		this.diceQuantity = diceQuantity;
	}

	public int getExp() {
		return exp;
	}
	
	public void setExp(int exp) {
		this.exp = exp;
	}
	
	public int getLevel() {
		return level;
	}
	
	public void setlevel(int level) {
		this.level = level;
	}
	
	public Item getInventory(int idx) {
		return inventory[idx];
	}
	
	public String getInventoryName(int idx) {					
		return inventory[idx].getName();
	}
	
	public String getInventoryDescription(int idx) {					
		return inventory[idx].getDescription();
	}
	
	public void getInventoryAll() {
		System.out.println();
		for (int i=0;i<inventory.length;i++) {
			System.out.println((i+1)+") "+inventory[i].getName()+" : "+inventory[i].getDescription());			
		}
	}	
	
//	public void setInventory(int idx, IndexItem item, int itemIndex) {
//		inventory[idx] = item.num[itemIndex] ;
//	}
	
	public void setInventory(int idx, Item item) {
		inventory[idx] = item;
	}
	
	public void setInventory(int idx, Axe item) {
		inventory[idx] = item;
	}
	
	public void setInventory(int idx, Bandage item) {
		inventory[idx] = item;
	}
	
	public void setInventory(int idx, Boomerang item) {
		inventory[idx] = item;
	}
	
	public void setInventory(int idx, Cannon item) {
		inventory[idx] = item;
	}
	
	public void setInventory(int idx, Clone item) {
		inventory[idx] = item;
	}
	
	public void setInventory(int idx, Dagger item) {
		inventory[idx] = item;
	}
	
	public void setInventory(int idx, Drop item) {
		inventory[idx] = item;
	}
	
	public void setInventory(int idx, Fist item) {
		inventory[idx] = item;
	}
	
	public void setInventory(int idx, Glove item) {
		inventory[idx] = item;
	}
	
	public void setInventory(int idx, GreatSword item) {
		inventory[idx] = item;
	}
	
	public void setInventory(int idx, Heal item) {
		inventory[idx] = item;
	}
	
	public void setInventory(int idx, IceShards item) {
		inventory[idx] = item;
	}
	
	public void setInventory(int idx, LockPick item) {
		inventory[idx] = item;
	}
	
	public void setInventory(int idx, MedicKit item) {
		inventory[idx] = item;
	}
	
	public void setInventory(int idx, Mirror item) {
		inventory[idx] = item;
	}
	
	public void setInventory(int idx, Reroll item) {
		inventory[idx] = item;
	}
	
	public void setInventory(int idx, Rising item) {
		inventory[idx] = item;		
	}
	
	public void setInventory(int idx, Saw item) {
		inventory[idx] = item;
	}
	
	public void setInventory(int idx, Shield item) {
		inventory[idx] = item;
	}	
	
	public void setInventory(int idx, Spare item) {
		inventory[idx] = item;
	}	
	
	public void setInventory(int idx, Spear item) {
		inventory[idx] = item;
	}	
	
	public void setInventory(int idx, SpikeShield item) {
		inventory[idx] = item;
	}
	
	public void setInventory(int idx, Staff item) {
		inventory[idx] = item;
	}
	
	public void setInventory(int idx, Sword item) {
		inventory[idx] = item;
	}
	
	public void setInventory(int idx, Talisman item) {
		inventory[idx] = item;
	}
	
	public void setInventory(int idx, Unknown item) {
		inventory[idx] = item;
	}
	
	public void setInventory(int idx, Wand item) {
		inventory[idx] = item;
	}
	
	
	
	
}
