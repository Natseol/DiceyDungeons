package Field;

import Character.*;
import Item.Item;
import ItemList.*;

public class Store{
	
	Item[] storeList = new Item[3];
	
	public Store() {//랜덤 아이템3개 생성
		for (int i = 0; i < storeList.length; i++) {
			storeList[i]=ITEMLIST[(int)(Math.random()*(ITEMLIST.length-2))+2];
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
			
			new Sword(),
			new Dagger(),
			new Axe(),
			new GreatSword(),
			new Boomerang(),
			new SpikeShield(),           
			new Spear(),                     
			new Fist(),                       
			new Staff(),                      
			new Cannon(),                     
			new Unknown(),                   
			new Wand(),                      
			new IceShards(),                 
			new Glove(),                     
			new Bow(),
			new BroadSword(),
			new Charge(),
			new Crossbow(),
			new FireSword(),
			new HolySword(),
			new Overwhelming(),
			new PoisonGas(),
			new PoisonKnife(),
			new Revolver(),
			new Trap(),//25
			new Bash(),//26

			new MedicKit(),                  
			new Bandage(),                   
			new Heal(),                      
			new Shield(),//30
			
			new Saw(),             
			new Sacrifice(),
			new Talisman(),//33			

			new Reroll(),                   
			new Rising(),               
			new LockPick(),            
			new Drop(), 
			new Aiming(),          
			new Clone(),
			new Mirror(),          
			new Spare(),          
			new Guard(),
			new MagicShield(),
			new SpareWitch(),
			new Scythe(),//46
			new BloodSucking()
	};
	
	public void changeItem(Player player, int inven, Item item) {	
		player.setInventory(inven, item);
	}	
}
