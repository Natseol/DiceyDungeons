package Character;

import Item.*;

public class Player extends Status {
	int exp;
	int level;
	protected Item[] inventory = new Item[6];
	
	public Player() {}
	
	public Player (int hp, int maxHp, int diceQuantity, int level) {
		super(hp,maxHp,diceQuantity);
		this.hp = hp;
		this.maxHp=maxHp;
		this.diceQuantity = diceQuantity;
		this.level = level;
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
