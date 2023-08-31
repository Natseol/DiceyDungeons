package Character;

import Battle.*;
import Item.*;
import ItemList.*;
import Main.*;

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
	public void printInventoryAll() {
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
	
//	public void setInventory(int idx, Sword sword) {
//		inventory[idx] = new Sword();
//	} 
		
	int condition[]=new int[3];
	
//	상태이상
//	0. 발화 : 주사위를 사용하려면 체력 2 소모
//	1. 빙결 : 가장 큰 주사위 눈금이 1로 바뀐다
//	2. 석화 : 해당 장비를 사용하려면 주사위 1개를 소모해야함
	
	public int[] getCondition() {
		return condition;
	}
	public int getCondition(int idx) {
		return condition[idx];
	}
	public void setCondition(int idx,int changeNum) {
		condition[idx]=changeNum;		
	}

	public void damagedFire() {
		if (Math.random()>0.5) {
			subtractHp(2);
		setCondition(0,getCondition(0)-1);
		System.out.println(Color.RED+" * 주사위를 건들다 [2]의 피해를 입습니다 * "+Color.RESET);		
		}
	}
	
	
	public void damagedIce(TurnInfo turninfo) {
		setCondition(1,getCondition(1)-1);
		int max = turninfo.getDice(0);
        int maxIndex = 0;				 
        for (int i = 0; i < turninfo.getDice().length; i++) {
            if (turninfo.getDice(i) > max) {
                max = turninfo.getDice(i);
                maxIndex = i;
            }
        }						
        turninfo.setDice(maxIndex,1);		
	}

	public void damagedParalysis(TurnInfo turninfo, int idxDice) {
		if (Math.random()>0.5) {
		setCondition(2,getCondition(2)-1);
		turninfo.setDice(idxDice-1, 0);
		System.out.println(Color.PURPLE+" * 몸이 굳습니다. 주사위를 놓칩니다 * "+Color.RESET);
		}
	}
	
}
