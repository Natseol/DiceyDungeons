package Item;

import Character.Status;

public class Damage {	
	protected int damage;
	
	public void setDamage(int damage) {
		this.damage = damage;
	}
	
	public int getDamage() {return damage;}
	
	void actionDamage(Status enemy, int dice) {//음수면 dice값으로 계산
		if (damage < 0) {
			enemy.subtractHp(dice*damage*-1);			
		}
		else if (damage > 0) {
			enemy.subtractHp(damage);
		}	
	}	
}
