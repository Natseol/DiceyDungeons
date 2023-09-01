package Character;

import Battle.EnemyTurn;
import Item.Item;
import ItemList.*;

public class Enemy extends Status{
	protected String name="적";
	protected String description;
	protected String grade;
	
	public Enemy() {}
//	
//	public Enemy (int hp, int maxHp, int diceQuantity) {
//		super(hp,maxHp,diceQuantity);
//		this.hp = hp;
//		this.maxHp=maxHp;
//		this.diceQuantity = diceQuantity;
//		inventory = new Item[2];
//	}
	
	public void setEnemy(int num) {
		
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public String getGrade() {
		return grade;
	}
	
	public void action(EnemyTurn EnemyTurn) {}
	
}
