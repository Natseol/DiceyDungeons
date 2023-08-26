package Store;

import Character.*;
import Item.*;

public class Store{
	
	Item[] storeList = new Item[3];
	public static final Item[] ITEMLIST = {
			new Nothing(),//0
			
			new Sword(),//1
			new Dagger(),//2
			new Axe(),//3
			new GreatSword(),//4
			new Boomerang(),//5
			new SpikeShield(),//6           
			new Spear(),//7                     
			new Fist(),//8                       
			new Staff(),//9                      
			new Cannon(),//10                     
			new Unknown(),//11                   
			new Wand(),//12                      
			new IceShards(),//13                 
			new Glove(),//14                     

			new Rising(),//15                    
			new Drop(),//16                      
			new LockPick(),//17                  
			new Saw(),//18                       
			new Talisman(),//19                  
			new Mirror(),//20                    
			new Spare(),//21                    

			new MedicKit(),//22                  
			new Bandage(),//23                   
			new Heal(),//24                      
			new Shield(),//25                    

			new Reroll(),//26                    
			new Clone()//27
	};
	
	public void changeItem(Player player, int inven, int idx) {	
		player.setInventory(inven, ITEMLIST[idx]);
	}
	
	
			

}
