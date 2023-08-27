package Character;

import Item.Item;

public class Status {
	protected int hp;
	protected int maxHp;
	protected int def;
	protected int diceQuantity;
	protected Item[] inventory;
	
	public Status() {}
	
	public Status(int hp, int maxHp, int diceQuantity) {
		this.hp = hp;
		this.maxHp=maxHp;
		this.diceQuantity = diceQuantity;		
	}
	
	public int getHp() {
		return hp;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public void addHp(int num) {
		hp += num;
		if (hp > maxHp) {
			hp=maxHp;
		}
	}
	
	public void subtractHp(int num) {
		if (def>=num) {
			def-=num;
		}
		else if (def>0&&def-num<0) {
			hp=hp+(def-num);
			def=0;
		}
		else {
		hp -= num;
		}
	}
	
	public int getMaxHp() {
		return maxHp;
	}
	
	public void setMaxHp(int maxHp) {
		this.maxHp = hp;
	}
	
	public int getDef() {
		return def;
	}
	
	public void setDef(int def) {
		this.def = def;
	}		
	
	public int getDiceQuantity() {
		return diceQuantity;
	}
	
	public void setDiceQuantity(int diceQuantity) {
		this.diceQuantity = diceQuantity;
	}
	
	public Item[] getInventory() {
		return inventory;
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
		System.out.println("-------------- 장비 ---------------");
		for (int i=0;i<inventory.length;i++) {
			System.out.print((i+1)+") "+inventory[i].getName()+" : "+inventory[i].getDescription());
			if (i==inventory.length-1) {
				System.out.println(" -고유-");
			}
			else {
				System.out.println();
			}
				
		}
		System.out.println("---------------------------------");
	}	
	
	public void setInventory(int idx, Item item) {
		inventory[idx] = item;
	}
	
//  차후구현
	
	int condition[];

//	상태이상
//	발화 : 주사위를 사용하려면 체력2 소모
//	마비 : 해당 장비를 사용하려면 주사위 1개를 소모해야함
//	빙결 : 가장 큰 주사위 눈금이 1로 바뀐다


}
