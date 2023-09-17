package Item;

import Character.Status;

public interface IAttack {
	public void setAttack(int attack);	
	public int getAttack();	
	
	default void actionAttack(Status enemy, int dice) {//음수면 dice값으로 계산
		if (getAttack() < 0) {
			enemy.subtractHp(dice*getAttack()*-1);			
		}
		else if (getAttack() > 0) {
			enemy.subtractHp(getAttack());
		}	
	}	
}
