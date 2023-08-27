package Battle;

import Character.*;
import Field.*;
import Item.*;
import Main.Color;

public class TurnInfo {
	
	int diceQ;
	int[] dice;	
	Item[] turnItem;
	
	public int[] getDice() {
		return dice;
	}
	
	public int getDice(int diceIdx) {
		return dice[diceIdx];
	}
	
	public void setDice(int diceIdx,int changeNum) {
		dice[diceIdx]=changeNum;		
	}
	
	public void printDice(Status status) {
		for (int i = 0; i < dice.length; i++) {
			System.out.print("("+(i+1)+")"+dice[i]+"  ");
		}
		System.out.println();		
	}
	
	public void setTimes(int idx, int num) {
		turnItem[idx].setTimes(num);
	}
	
	public int getTimes(int idx) {
		return turnItem[idx].getTimes();
	}
	
	public Item getItem(int idx) {
		return turnItem[idx];
	}
	
	public void setItem(int idx, Item item) {
		turnItem[idx] = item;
	}

	public void printItem() {
		for (int i = 0; i < turnItem.length; i++) {
			if (this.getItem(i).getName().equals(Store.ITEMLIST[0].getName())) {
				System.out.print(Color.BLACK);
			}
			System.out.print(i+1+") "+this.getItem(i).getName()+" : "+this.getItem(i).getDescription());
			if (this.getTimes(i) > 1) {
				System.out.print(" 남은횟수:"+this.getTimes(i));
			}
			else if(this.getItem(i).getCount()>0) {
				System.out.print(" 카운트:"+this.getItem(i).getCount());
			}
			System.out.println(Color.RESET);
		}		
	}
}
