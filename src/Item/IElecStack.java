package Item;

import Battle.TurnInfo;
import Character.Status;

public interface IElecStack {
	
	public void setElecStack(int num);
	public int getElecStack();
	
	default void actionElecStack(Status enemy) {
		enemy.setCondition(2,enemy.getCondition(2)+getElecStack());
	};
}
