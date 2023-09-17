package Item;

import Character.Status;

public interface IConditionStack {
	
	public void setFireStack(int num);
	public int getFireStack();
	
	public void setIceStack(int num);
	public int getIceStack();
	
	public void setElecStack(int num);
	public int getElecStack();
	
	public void setPoisonStack(int num);
	public int getPoisonStack();
	
	default void actionConditionStack(Status enemy) {
		if (getFireStack() > 0) {
			enemy.setCondition(0,enemy.getCondition(0)+getFireStack());
			ItemScript.printFire(getFireStack());
		}
		if (getIceStack() > 0) {
			enemy.setCondition(1,enemy.getCondition(1)+getIceStack());
			ItemScript.printIced(getIceStack());
		}
		if (getElecStack() > 0) {
			enemy.setCondition(2,enemy.getCondition(2)+getElecStack());
			ItemScript.printShock(getElecStack());
		}
		if (getPoisonStack() > 0) {
			enemy.setCondition(3,enemy.getCondition(3)+getPoisonStack());
			ItemScript.printPoisoned(getPoisonStack());
		}				
	}
}
