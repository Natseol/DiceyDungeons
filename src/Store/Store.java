package Store;

import Character.*;
import Item.*;

public class Store{
	
	Item[] storeList = new Item[3];
	final Item[] ITEMLIST = {
			new Nothing(),//0
			
			new Sword(),//1
			new Dagger(),//2
			new Axe(),//3
			new GreatSword(),//4
			new Boomerang(),//5
			new SpikeShield(),//6           
			new Spear(),//6                     
			new Fist(),//7                       
			new Staff(),//8                      
			new Cannon(),//9                     
			new Unknown(),//10                   
			new Wand(),//11                      
			new IceShards(),//12                 
			new Glove(),//13                     

			new Rising(),//14                    
			new Drop(),//15                      
			new LockPick(),//16                  
			new Saw(),//17                       
			new Talisman(),//18                  
			new Mirror(),//19                    
			new Spare(),//20                     

			new MedicKit(),//21                  
			new Bandage(),//22                   
			new Heal(),//23                      
			new Shield(),//24                    

			new Reroll(),//25                    
			new Clone()//26
	};
	
	public void changeItem(Player player, int inven, int idx) {	
		player.setInventory(inven, ITEMLIST[idx]);
	}
	
	
			

}
