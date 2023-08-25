package Character;

public class Status {
	int hp;
	int maxHp;
	int def;
	int diceQuantity;
	
	public int getHp() {
		return hp;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
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
	
//  차후구현
	
	int condition[];

//	상태이상
//	발화 : 주사위를 사용하려면 체력2 소모
//	마비 : 해당 장비를 사용하려면 주사위 1개를 소모해야함
//	빙결 : 가장 큰 주사위 눈금이 1로 바뀐다


}
