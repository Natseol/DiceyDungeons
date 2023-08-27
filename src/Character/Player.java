package Character;

import Item.*;
import Main.Color;

public class Player extends Status {
	protected int exp;
	protected int[] expTable= {4,6,8,10};
	protected int level=1;	
    protected String job;    
	
	public Player() {}
	
	public Player(int num) {
		this();
		inventory = new Item[6];
		switch (num) {
		case 1 :
			maxHp=26;
			hp=maxHp;
			job = "전사";
			diceQuantity = 2;
			this.setInventory(0, new Sword());
			this.setInventory(1, new Axe());
			this.setInventory(2, new Nothing());
			this.setInventory(3, new Nothing());
			this.setInventory(4, new Rising());
			this.setInventory(5, new Reroll());
			
		break;
		case 2 :
			maxHp=22;
			hp=maxHp;
			job = "도적";
			diceQuantity = 3;
			this.setInventory(0, new Dagger());
			this.setInventory(1, new Bow());
			this.setInventory(2, new Nothing());
			this.setInventory(3, new Nothing());
			this.setInventory(4, new LockPick());
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
	public void setLevel(int level) {
		this.level = level;
	}
	
	public void levelUp() {
		exp += 2;
		if (exp == expTable[level-1]) {
			level++;
			exp=0;
			maxHp+=4;
			hp = maxHp;
			diceQuantity=(int)(2+level*0.5);
			System.out.println();
			System.out.println(Color.B_BLUE+"레벨이 올랐습니다!!"+Color.RESET);
		}
	}
	
	public void resetPlayer() {
		for (int i =0;i<inventory.length;i++) {
			if (inventory[i].getName()==new UsedGreat().getName()) {
				setInventory(i, new GreatSword());
			}
		}
		
		if (job=="전사") {//주사위 초기화
			switch (level) {
			case 1 :
				diceQuantity = 2;
				break;
			case 2 :
				diceQuantity = 3;
				break;
			case 3 :
				diceQuantity = 3;
				break;
			case 4 :
				diceQuantity = 4;
				break;
			}
		}
		else if (job=="도적") {
			switch (level) {
			case 1 :
				diceQuantity = 3;
				break;
			case 2 :
				diceQuantity = 4;
				break;
			case 3 :
				diceQuantity = 4;
				break;
			case 4 :
				diceQuantity = 5;
				break;
			}
		}		
	}
	
	public void printInfo() {
		System.out.println();
		System.out.println("-------------- 스탯 ---------------");
			System.out.println("Lv: "+getLevel()+"  [EXP: "+getExp()+"/"+expTable[level-1]+"]");
			System.out.println("주사위:"+getDiceQuantity());
			System.out.print("Hp: "+getHp());
			System.out.println("/"+getMaxHp());
	}
}
