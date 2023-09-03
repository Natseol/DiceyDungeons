package Field;

import Character.*;
import Item.Item;
import ItemList.*;

public class Store{
	
	Item[] storeList = new Item[3];
	
	public Store() {//랜덤 아이템3개 생성
		for (int i = 0; i < storeList.length; i++) {
			storeList[i]=ITEMLIST[(int)(Math.random()*(ITEMLIST.length-3))+3];
		}
	}
	
	public Item getStoreList(int num) {
		return storeList[num];
	}		
			
	public void showList() {
		for (int i =0; i<storeList.length;i++) {			
			System.out.println((i+1)+") "+storeList[i].getName()+" : "+storeList[i].getDescription());
		}
	}
	
	public static final Item[] ITEMLIST = {
			new Nothing(),
			new UsedGreat(),
			//F:5, I:5, E:6, P:5, D:4+2, H:4+1
			new Sword(),
			new Dagger(),
			new Axe(),
			new GreatSword(),
			new Boomerang(),
			new SpikeShield(),//D           
			new Spear(),                     
			new Fist(),                       
			new Staff(), //E                     
			new Cannon(),                     
			new Box(),                   
			new Wand(),//F                      
			new IceShards(),//I                 
			new Glove(),//E                     
			new Bow(),
			new BroadSword(),
			new Charge(),
			new Crossbow(),//F
			new FireSword(),//F
			new IceSword(),//I
			new HolySword(),//H
			new Overwhelming(),
			new PoisonGas(),//P
			new PoisonKnife(),//P
			new Revolver(),
			new Trap(),//E, P
			new Bash(),//D
			new ShortSword(),
			new MagicMissile(),
			new Capacitor(),//E
			new Claw(),//P
			new Icicle(),//I
			new Shovel(),//E
			new TwoHandedSword(),
			new Infection(),//P
			new Meteor(),//F
			new IceAge(),//I
			new Storm(),//E
			new IcePillar(),//I
			new Burn(),//F

			new MedicKit(),//H                  
			new Bandage(),//H                   
			new Heal(),//H                      
			new Shield(),//D
			new Buckler(),//D
			
			new Saw(),             
			new Sacrifice(),
			new Talisman(),
			new SneakEye(),

			new Reroll(),                   
			new Rising(),               
			new LockPick(),            
			new Drop(), 
			new Precisoin(),          
			new Clone(),
			new Mirror(),          
			new Spare(),          
			new Guard(),//D
			new MagicShield(),//D,H
			new Scythe(),
			new SpareWitch(),
			new BloodSucking()
	};
	
	public void changeItem(Player player, int inven, Item item) {	
		player.setInventory(inven, item);
	}	
}
