package Item;

import Battle.TurnInfo;

public interface INeedDice {
	public void setNeedDice(int needDice);	
	public int getNeedDice();	

	default boolean actionNeedDice(TurnInfo my, int idx) {
		if (my.getNeedDIce(idx)==0) {
			my.setNeedDIce(idx, 1);
			return true;
		}
		else {
			my.setNeedDIce(idx, 0);
			return false;
		}	
	}
}