package Item;

import Character.Status;

public interface IDefence {
	public void setDefence(int defence);	
	public int getDefence();	
	
	default void actionDefence(Status player, int dice) {//음수면 dice값으로 계산
		if (getDefence() < 0) {
			player.setDef(dice*getDefence()*-1);
		}
		else if (getDefence() > 0) {
			player.setDef(getDefence());
		}	
	}	
}