package Item;

import Battle.*;
import Character.*;
import Main.Color;

public class Item extends ItemScript{
	
	protected String name;
	protected String description;	
	protected int times;
	protected int count;
	protected int changeDice;
	protected boolean check;
	
	public void action(Player player, Enemy enemy, int dice, MyTurn myTurn) {}
	
	public void action(Enemy enemy, Player player, int dice, EnemyTurn enemyTurn) {}
	
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

}
