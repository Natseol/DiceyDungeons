package Item;

import Character.Status;

public interface IDamage {
	public void setDamage(int damage);	
	public int getDamage();	
	
	default void actionDamage(Status player, int dice) {//음수면 dice값으로 계산
		if (getDamage() < 0) {
			player.subtractHp(dice*getDamage()*-1);			
		}
		else if (getDamage() > 0) {
			player.subtractHp(getDamage());
		}	
	}	
}
