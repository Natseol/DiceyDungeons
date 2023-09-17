package Item;

import Battle.*;
import Character.*;
import ItemList.*;
import Main.Color;

public class Item extends ItemScript implements IItem, IAttack, ICount, IDefence, ILimit, ITimes,
	IElecStack, IFireStack, IIceStack, IPoisonStack, INeedDice, INewDice, IRecovery, IDamage{
	
	protected String name;
	protected String description;
	
	protected int attack;	
	protected int count;
	protected String limit="";
	protected boolean check; // 확인필요
	protected int times=1;
	
	protected int fireStack;
	protected int iceStack;
	protected int elecStack;
	protected int poisonStack;
	
	protected int recovery;
	protected int defence;
	protected int damage;
	protected String newDice="";
	protected int needDice;
	
	protected int accDamage;//누적으로 변경해야함
	
	@Override
	public void setAttack(int attack) {this.attack=attack;}	
	@Override
	public int getAttack() {return attack;}
	
	@Override
	public void setCount(int count) {this.count=count;}	
	@Override
	public int getCount() {return count;}
	
	@Override
	public void setDefence(int defence) {this.defence=defence;}	
	@Override
	public int getDefence() {return defence;}
	
	@Override
	public void setLimit(String limit) {this.limit=limit;}
	@Override
	public String getLimit() {return limit;}
	
	@Override
	public void setTimes(int times) {this.times=times;}
	@Override
	public int getTimes() {return times;}
	
	@Override
	public void setElecStack(int num) {this.elecStack=num;}
	@Override
	public int getElecStack() {return elecStack;}
	
	@Override
	public void setFireStack(int num) {this.fireStack=num;}
	@Override
	public int getFireStack() {return fireStack;}
	
	@Override
	public void setIceStack(int num) {this.iceStack=num;}
	@Override
	public int getIceStack() {return iceStack;}
	
	@Override
	public void setPoisonStack(int num) {this.poisonStack=num;}
	@Override
	public int getPoisonStack() {return poisonStack;}
	
	@Override
	public void setNeedDice(int needDice) {this.needDice=needDice;}
	@Override
	public int getNeedDice() {return needDice;}
	
	@Override
	public void setNewDice(String newDice) {this.newDice=newDice;}
	@Override
	public String getNewDice() {return newDice;}
	
	@Override
	public void setRecovery(int recovery) {this.recovery=recovery;}
	@Override
	public int getRecovery() {return recovery;}
	
	@Override
	public void setDamage(int damage) {this.damage=damage;}
	@Override
	public int getDamage() {return damage;}	
	
	@Override
	public String getName() {return name;}
	@Override
	public String getDescription() {return description;}
	
	public boolean checkDice(int dice) {
		return !actionLimit(dice);
	}
	
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		if (getCount()!=0) {
			if (actionCount(dice, my, idx)) return;
		}
		if (getNeedDice()!=0) {
			if (actionNeedDice(my, idx)) return;
		}
		if (getAttack()!=0) {actionAttack(player, enemy, dice);}
		if (getTimes()!=0) {actionTimes(my, idx);}
		if (getFireStack()!=0) {actionFireStack(enemy, dice);}
		if (getIceStack()!=0) {actionIceStack(enemy, dice);}
		if (getElecStack()!=0) {actionElecStack(enemy, dice);}
		if (getPoisonStack()!=0) {actionPoisonStack(enemy, dice);}
		if (getNewDice()!="") {actionNewDice(my, dice);}
		if (getRecovery()!=0) {actionRecovery(player, dice);}
		if (getDefence()!=0) {actionDefence(player, dice);}
		if (getDamage()!=0) {actionDamage(player, dice);}		
	}
	
	
//	
//	
//	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {}
//	
//	public boolean checkDice(int dice) {
//		return check=false;
//	}
//	
//	public String getName() {
//		return name;
//	}
//	
//	public String getDescription() {
//		return description;
//	}
//	
//	public void setTimes(int num) {
//		times = num;
//	}
//	
//	public void setCount(int num) {
//		count = num;
//	}
//	
//	public int getTimes() {
//		return times;
//	}
//	
//	public int getCount() {
//		return count;
//	}
//	
//	public boolean getCheck() {
//		return check;
//	}
//	
	public void setCheck(boolean b) {
		check = b;
	}
//	
//	public int getChangeDice() {
//		return changeDice;
//	}
//	
//	public void setChangeDice(int dice) {
//		changeDice = dice;
//	}	
//	
	public int getAccDamage() {
		return accDamage;
	}
	public void setAccDamage(int num) {
		accDamage=num;
	}
	
}
