package Character;

import Item.*;

public class Enemy extends Status{
	String name="적";
	String description;
	Item[] inventory;
	
	public Enemy() {}
	
	public Enemy (int hp, int maxHp, int diceQuantity) {
		super(hp,maxHp,diceQuantity);
		this.hp = hp;
		this.maxHp=maxHp;
		this.diceQuantity = diceQuantity;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}		
}
