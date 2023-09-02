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
	protected int condition[]=new int[4];
	protected boolean isEffect;
//	protected int countCondi;
	protected int sp;
		
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
			hp=(hp+def)-num;
			def=0;
			sp = sp + num - def;
		}
		else {
		hp -= num;
		sp += num;
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
	
	public void setInventory(int idx, Item item) {
		inventory[idx] = item;
	}
		
	public boolean getIsEffect() {
		return isEffect;
	}	
	public void setIsEffect(boolean effect) {
		isEffect = effect;
	}	
	
	public int getSp() {
		return sp;
	}	
	public void setSp(int sp) {
		this.sp = sp;
	}
		
	
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
	
//	public int getCountCondi() {
//		return countCondi;
//	}
//	public int countCondition() {
//		int countCondi=0;
//		for (int i=0;i<condition.length;i++) {
//			if (condition[i]>0) {
//				countCondi++;
//			}
//		}
//		return countCondi;
//	}

	public void damagedFire() {
		if (Math.random()<(0.25*getCondition(0))) {
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

	public boolean damagedParalysis(TurnInfo turninfo, int idxDice) {
		if (Math.random()<0.15*turninfo.getDice(idxDice-1)) {
		setCondition(2,getCondition(2)-1);
		turninfo.setDice(idxDice-1, 0);
		System.out.println(Color.BPURPLE+" * 몸이 굳습니다. 주사위를 놓칩니다 * "+Color.RESET);
		setIsEffect(true);
		return true;
		}
		return false;
	}
	
	public boolean damagedParalysis(EnemyTurn turninfo, int idxDice) {
		if (Math.random()>0.5) {
		setCondition(2,getCondition(2)-1);
		turninfo.setDice(idxDice, 0);
		System.out.println(Color.BPURPLE+" * 몸이 굳습니다. 주사위를 놓칩니다 * "+Color.RESET);
		setIsEffect(true);
		return true;
		}
		return false;
	}

	
	public void damagedPoison() {
		subtractHp(getCondition(3));
		System.out.println();
		System.out.println(Color.BCYAN+" * 중독됐습니다. ["+getCondition(3)+"]의 피해를 입습니다 * "+Color.RESET);
		System.out.println();
		setCondition(3,getCondition(3)-1);
	}
}
