package Battle;

import Character.*;
import Dice.Roll;
import Field.*;
import Item.Item;
import ItemList.*;
import Main.Color;

public class TurnInfo extends BattleSetting{
	
	int diceQ;
	int[] dice;	
	Item[] turnItem;
	int[] other;
	
	public TurnInfo() {}
 	public TurnInfo(Status status) {
		diceQ = status.getDiceQuantity();		
		turnItem=new Item[6];
		for (int i = 0 ; i<status.getInventory().length;i++) {
			setItem(0, status.getInventory(i));
		}		
		dice=new int[diceQ];
		for (int i = 0; i < dice.length; i++) {
			dice[i]=Roll.roll6();			
		}
	}
	
	public int[] getDice() {
		return dice;
	}	
	public int getDice(int diceIdx) {
		return dice[diceIdx];
	}
	public void setDice(int diceIdx,int changeNum) {
		dice[diceIdx]=changeNum;		
	}
	
	public int getTurnTimes(int idx) {
		return turnItem[idx].getTimes();
	}
	public void setTurnTimes(int idx, int num) {
		turnItem[idx].setTimes(num);
	}

	public int[] getOther() {
		return other;
	}
	public void setOther(int idx, int num) {
		other[idx] = num;
	}
	public void setOther(int num) {
		other = new int[num];
	}
	
	public Item[] getItem() {
		return turnItem;
	}
	public Item getItem(int idx) {
		return turnItem[idx];
	}
	public void setItem(int idx, Item item) {
		turnItem[idx] = item;
	}
	
	public void setBattle(Status status) { 
		for (int i=0;i<status.getInventory().length;i++) {
			if (status.getInventory(i).getDescription()==new UsedGreat().getDescription()) {
				setItem(i, new UsedGreat());
			}
			if (status.getInventory(i).getDescription()==new Reroll().getDescription()) {
				setItem(i, new Reroll());
			}
			if (status.getInventory(i).getDescription()==new LockPick().getDescription()) {
				setItem(i, new LockPick());
			}
			getItem(i).setCount(status.getInventory(i).getCount());			
		}
	}
		
//	public void setItem(int idx, Nothing nothing) {
//		turnItem[idx] = new Nothing();
//	}	
//	
//	public void setItem(int idx, Sword sword) {
//		turnItem[idx] = new Sword();
//	}
//	
//	public void setItem(int idx, Axe axe) {
//		turnItem[idx] = new Axe();
//	}
//	
//	public void setItem(int idx, Dagger dagger) {
//		turnItem[idx] = new Dagger();
//	}
//	
//	public void setItem(int idx, GreatSword greatsword) {
//		turnItem[idx] = new GreatSword();
//	}
//	
//	public void setItem(int idx, Boomerang boomerang) {
//		turnItem[idx] = new Boomerang();
//	}
//	
//	public void setItem(int idx, SpikeShield spikeshield) {
//		turnItem[idx] = new SpikeShield();
//	}
//	
//	public void setItem(int idx, Spear spear) {
//		turnItem[idx] = new Spear();
//	}
//	
//	public void setItem(int idx, Fist fist) {
//		turnItem[idx] = new Fist();
//	}
//	
//	public void setItem(int idx, Staff staff) {
//		turnItem[idx] = new Staff();
//	}
//	
//	public void setItem(int idx, Cannon cannon) {
//		turnItem[idx] = new Cannon();
//	}
//	
//	public void setItem(int idx, Unknown unknown) {
//		turnItem[idx] = new Unknown();
//	}
//	
//	public void setItem(int idx, Wand wand) {
//		turnItem[idx] = new Wand();
//	}
//	
//	public void setItem(int idx, IceShards iceShards) {
//		turnItem[idx] = new IceShards();
//	}
//	
//	public void setItem(int idx, Glove glove) {
//		turnItem[idx] = new Glove();
//	}
//	
//	public void setItem(int idx, Bow bow) {
//		turnItem[idx] = new Bow();
//	}
//	
//	public void setItem(int idx, UsedGreat usedGreat) {
//		turnItem[idx] = new UsedGreat();
//	}
//	
//	
//	public void setItem(int idx, Rising rising) {
//		turnItem[idx] = new Rising();
//	}
//	
//	public void setItem(int idx, Drop drop) {
//		turnItem[idx] = new Drop();
//	}
//	
//	public void setItem(int idx, LockPick lockPick) {
//		turnItem[idx] = new LockPick();
//	}
//	
//	public void setItem(int idx, Saw saw) {
//		turnItem[idx] = new Saw();
//	}
//	
//	public void setItem(int idx, Talisman talisman) {
//		turnItem[idx] = new Talisman();
//	}
//	
//	public void setItem(int idx, Mirror mirror) {
//		turnItem[idx] = new Mirror();
//	}
//	
//	public void setItem(int idx, Spare spare) {
//		turnItem[idx] = new Spare();
//	}
//	
//	public void setItem(int idx, MedicKit medicKit) {
//		turnItem[idx] = new MedicKit();
//	}
//	
//	public void setItem(int idx, Bandage bandage) {
//		turnItem[idx] = new Bandage();
//	}
//	
//	public void setItem(int idx, Heal heal) {
//		turnItem[idx] = new Heal();
//	}
//	
//	public void setItem(int idx, Shield shield) {
//		turnItem[idx] = new Shield();
//	}
//		
//	public void setItem(int idx, Reroll reroll) {
//		turnItem[idx] = new Reroll();
//	}
//	
//	public void setItem(int idx, Clone clone) {
//		turnItem[idx] = new Clone();
//	}
	
	public void rebuildDice() {
		int count=0;
		for (int i = 0; i < dice.length; i++) {
			if (dice[i]==0) {
				count++;
			}
		}
		
		if (other!=null) {
			int[] newDice = new int[dice.length+other.length-count];
			int check=0;			
			for (int i = dice.length-count; i < dice.length+other.length-count; i++) {
				newDice[i]=other[check];
				check++;
			}
			other=null;
			check=0;		
			for (int i = 0; i < dice.length; i++) {
				if (dice[i] !=0) {
					newDice[check]=dice[i];
					check++;
				}				
			}
			dice=newDice;
		}
		else {
			int [] newDice = new int[dice.length-count];
			int check=0;		
			for (int i = 0; i < dice.length; i++) {
				if (dice[i] !=0) {
					newDice[check]=dice[i];
					check++;
				}				
			}
			dice=newDice;
		}
	}//end of method rebulidDice
	
}

