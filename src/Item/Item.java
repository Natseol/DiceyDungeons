package Item;

import Battle.*;
import Character.*;
import ItemList.*;
import Main.Color;

public class Item extends ItemScript implements IAttack, ICount, IDefence, ILimit, ITimes,
	IElecStack, IFireStack, IIceStack, IPoisonStack, INeedDice, INewDice, IRecovery, IItem{
	
	protected String name = "아이템";
	protected String description;
	
	protected int attack;	
	protected int count;
	protected boolean check;
	protected int times;
	
	protected int fireStack;
	protected int iceStack;
	protected int electronicStack;
	protected int poisonStack;
	
	protected int heal;
	
	protected int changeDice;//삭제예정
	
	protected int[] newDice;
	protected int newDiceLength;
	
	protected int accDamage;//누적으로 변경해야함
	
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {}
	
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
