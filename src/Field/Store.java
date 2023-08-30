package Field;

import Character.*;
import Item.Item;
import ItemList.*;

public class Store{
	
	Item[] storeList = new Item[3];
	
	public Store() {//랜덤 아이템3개 생성
		for (int i = 0; i < storeList.length; i++) {
			storeList[i]=ITEMLIST[(int)(Math.random()*(ITEMLIST.length-3))+1];
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
	
	public void printStore() {
		System.out.println("---------------------------------");
		System.out.println("상점에 방문했습니다");
		System.out.println("상품이 중복으로 보이는건 기분 탓입니다");
		System.out.println("(한번만 교환가능합니다)");
		System.out.println("---------------------------------");
		System.out.println();
	}
	
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
			
			new Bow(),

			new Reroll(),//26                    
			new Clone()//27
	};
	
	public void changeItem(Player player, int inven, Item item) {	
		player.setInventory(inven, item);
	}	
}
