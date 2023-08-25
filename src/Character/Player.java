package Character;

import Item.*;

public class Player extends Status {
	Item[] inventory = new Item[6];

	int exp;
	int level;
	
	public Item getIventory(int idx) {
		return this.inventory[idx];
	}
	
	public String getInventoryName(int idx) {					
		return this.inventory[idx].getName();
	}
	
	public String getInventoryDescription(int idx) {					
		return this.inventory[idx].getDescription();
	}
	
	
//	public void setInventory(int idx, IndexItem item, int itemIndex) {
//		inventory[idx] = item.num[itemIndex] ;
//	}	
	
	public void setInventory(int invenIdx, int itemIdx) {		
		Axe axe = new Axe();
		Bandage bandage = new Bandage();
		Boomerang boomerang = new Boomerang();
		Cannon cannon = new Cannon();
		Clone clone = new Clone();
		Dagger dagger = new Dagger();
		Drop drop = new Drop();
		Fist fist = new Fist();
		Glove glove = new Glove();
		GreatSword greatSword = new GreatSword();
		Heal heal = new Heal();
		IceShards iceShards = new IceShards();
		LockPick lockPick = new LockPick();
		MedicKit medicKit = new MedicKit();
		Mirror mirror = new Mirror();
		Reroll reroll = new Reroll();
		Rising rising = new Rising();
		Saw saw = new Saw();
		Shield shield = new Shield();
		Spare spare = new Spare();
		Spear spear = new Spear();
		SpikeShield spikeShield = new SpikeShield();
		Staff staff = new Staff();
		Sword sword = new Sword();
		Talisman talisman = new Talisman();
		Unknown unknown = new Unknown();
		Wand wand = new Wand();
		
		Nothing nothing = new Nothing();
		
		Item[] num = new Item[100];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = nothing;
		}
		
		num[1] = sword;
		num[2] = axe;
		num[3] = greatSword; 
		num[4] = boomerang;
		num[5] = spikeShield;
		num[6] = spear;
		num[7] = fist;
		num[8] = staff;
		num[9] = cannon;
		num[10] = unknown;
		num[11] = wand;
		num[12] = iceShards; 
		num[13] = glove;
		num[14] = dagger;
		
		num[41] = rising;  
		num[42] = drop; 
		num[43] = lockPick; 
		num[44] = saw;
		num[45] = talisman;
		num[46] = mirror;
		num[47] = spare;
		
		num[61] = medicKit;
		num[62] = bandage;
		num[63] = heal;
		num[64] = shield;
		
		num[81] = reroll; 
		num[82] = clone;
	
		inventory[invenIdx] = num[itemIdx];		
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
