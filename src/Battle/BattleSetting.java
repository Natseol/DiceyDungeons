package Battle;

import Character.*;
import Item.*;

public class BattleSetting {
	
	int[][] itemState=new int[6][3];//0:times 1:count 2:대검
	int addDice;
	
	public int getTurnTimes(int idx) {
		return itemState[0][idx];
	}
	public void setTurnTimes(int idx, int num) {
		itemState[idx][0]=num;
	}
	
	public int getTurnCount(int idx) {
		return itemState[idx][1];
	}
	public void setTurnCount(int idx, int num) {
		itemState[idx][1]=num;
	}
	
	public int getAddDice() {
		return addDice;
	}
	public void setAddDice(int num) {
		addDice=num;
	}
	
	public void resetTimes(Item[] item) {
		for (int i=0;i<item.length;i++) {
			this.itemState[i][0]=item[i].getTimes();
		}
	}
	
	public void resetCount(Status status) {
		for (int i=0;i<status.getInventory().length;i++) {
			this.itemState[i][1]=status.getInventory(i).getCount();
		}
	}
}
