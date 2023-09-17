package Item;

import Battle.TurnInfo;

public interface ICount {
	public void setCount(int count);
	public int getCount();
	
	default void actionCount(int dice, TurnInfo my, int idx) {
		if (my.getTurnCount(idx)-dice>0) {
			my.setTurnCount(idx, my.getTurnCount(idx)-dice);
		}
		else {
			my.setTurnCount(idx, getCount());
		}		
	};
}
