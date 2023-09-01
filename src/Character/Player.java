package Character;

import Item.Item;
import ItemList.*;
import Main.Color;

public class Player extends Job {
	protected int exp;
	protected int[] expTable= {4,6,8,10};
	protected int level=1;	
	
    public Player() {}
	public Player(int num) {//1.전사 2.도적
		inventory = new Item[6];
		switch (num) {
		case 1 : setJobWarrior(); break;
		case 2 : setJobThief(); break;
		}		
	}
	
//	public Player (int hp, int maxHp, int diceQuantity) {
//		super(hp,maxHp,diceQuantity);
//		this.hp = hp;
//		this.maxHp=maxHp;
//		this.diceQuantity = diceQuantity;
//	}

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
	
    public int getExpTable(int idx) {
    	return expTable[idx];
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
		for (int i =0;i<inventory.length;i++) {//대검 돌려주기
			if (inventory[i].getDescription()==new UsedGreat().getDescription()) {
				setInventory(i, new GreatSword());
			}
		}
		for (int i=0;i<condition.length;i++) {
			condition[i]=0;
		}
		def = 0;	
//		if (job=="전사") {//주사위 초기화
			switch (level) {
			case 1 : diceQuantity = 2; break;
			case 2 : diceQuantity = 3; break;
			case 3 : diceQuantity = 3; break;
			case 4 : diceQuantity = 4; break;
			case 5 : diceQuantity = 5; break;
			}
//		}
//		else if (job=="도적") {
//			switch (level) {
//			case 1 : diceQuantity = 3; break;
//			case 2 : diceQuantity = 4; break;
//			case 3 : diceQuantity = 4; break;
//			case 4 : diceQuantity = 5; break;
//			}
//		}		
	}
}
