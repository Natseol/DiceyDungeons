package Item;

import Battle.TurnInfo;

public class Times extends Limit {
	protected int times;
	
	public void setTimes(int times) {
		this.times = times;
	}
	
	public int getTimes() {return times;}
	
	void actionTimes(TurnInfo my, int idx) {
		my.setTurnTimes(idx, my.getTurnTimes(idx)-1);
	};
}
