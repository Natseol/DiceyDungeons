package Item;

import Battle.TurnInfo;

public interface INeedDice {
	public void setNeedDice(int needDice);	
	public int getNeedDice();	
	
	default void actionNeedDice(TurnInfo my, int idx) {//음수면 dice값으로 계산
		my.setNeedDIce(idx, 1);
	}	
}