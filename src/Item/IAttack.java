package Item;

import Character.Status;

public interface IAttack {
	public void setAttack(int attack);	
	public int getAttack();	
	
	default void actionAttack(Status player, Status enemy, int dice) {//음수면 dice값으로 계산
		if (getAttack() < 0) {
			switch (getAttack()) {
			case -2:
				ItemScript.printDamage2((dice*getAttack()*-1)/2);
				break;
			case -3:
				ItemScript.printDamage3((dice*getAttack()*-1)/3);
				break;
			default:
				ItemScript.printDamage(dice*getAttack()*-1);
				break;
			}
			enemy.subtractHp(dice*getAttack()*-1);
		}
		else if (getAttack() > 0) {
			enemy.subtractHp(getAttack());
			ItemScript.printDamage(getAttack());
		}	
	}	
}
