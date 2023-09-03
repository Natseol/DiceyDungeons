package Item;

import Battle.*;
import Character.*;
import ItemList.*;
import Main.Color;

public class Item extends ItemScript{
	
	protected String name = "아이템";
	protected String description;	
	protected int times;
	protected int count;
	protected int changeDice;
	protected int accDamage;
	protected boolean check;
	
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {}
	
//	public void action(Enemy enemy, Player player, int dice, EnemyTurn enemyTurn) {}
	
//	public static Item copyItem(Item origin) {
//		Item copy = new Item();
//		copy.name = origin.name;
//		copy.description = origin.description;
//		copy.times = origin.times;
//		copy.count = origin.count;
//		copy.changeDice = origin.changeDice;
//		copy.check = origin.check;		
//		return copy;
//	}
	
//	public static Item copyItem(Sword origin) {
//		Sword copy = new Sword();
//		copy.name = origin.name;
//		copy.description = origin.description;
//		copy.times = origin.times;
//		copy.count = origin.count;
//		copy.changeDice = origin.changeDice;
//		copy.check = origin.check;		
//		return copy;
//	}
	
	
	public boolean checkDice(int dice) {
		return check=false;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setTimes(int num) {
		times = num;
	}
	
	public void setCount(int num) {
		count = num;
	}
	
	public int getTimes() {
		return times;
	}
	
	public int getCount() {
		return count;
	}
	
	public boolean getCheck() {
		return check;
	}
	
	public void setCheck(boolean b) {
		check = b;
	}
	
	public int getChangeDice() {
		return changeDice;
	}
	
	public void setChangeDice(int dice) {
		changeDice = dice;
	}	
	
	public int getAccDamage() {
		return accDamage;
	}
	public void setAccDamage(int num) {
		accDamage=num;
	}
}
