package Main;

import java.util.Scanner;

import Store.Store;

public class Field {
	
	Store store = new Store();
	int storeCount = 1;
	int healCount = 2;
	
	public int move() {
		Scanner input = new Scanner(System.in); 
		System.out.println();
		System.out.println("어디로 이동하시겠습니까?");
		System.out.println("1. 전투");
		System.out.println("2. 상점");
		System.out.println("3. 회복");
		System.out.println("4. 다음 층");
		return input.nextInt();
	}
	
	public void setHealCount(int num) {
		healCount = num;
	}
	
	public int getHealCount() {
		return healCount;
	}
	
	public void setStoreCount(int num) {
		storeCount = num;
	}
	
	public int setStoreCount() {
		return storeCount;
	}
}


