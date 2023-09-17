package Item;

import Battle.TurnInfo;

public class Count extends Damage {
	protected int count;
	
	public void setCount(int count) {
		this.count = count;
	}
	
	public int getCount() {return count;}
	
	void actionCount(int dice, TurnInfo my, int idx) {
		if (my.getTurnCount(idx)-dice>0) {
			my.setTurnCount(idx, my.getTurnCount(idx)-dice);
		}
		else {
			my.setTurnCount(idx, count);
		}		
	};
}
