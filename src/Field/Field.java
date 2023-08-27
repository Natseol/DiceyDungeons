package Field;

import java.util.Scanner;

import Main.Color;

public class Field {
	
	Store store = new Store();
	int storeCount = 1;
	int healCount = 2;
	
	public int move(int floor) {
		Scanner input = new Scanner(System.in); 
		System.out.println();
		System.out.println("------------ 지하 "+floor+"층 -------------");
		System.out.println("1. 다음 전투로");
		System.out.println("2. 상점 방문하기");
		System.out.println("3. 회복의 샘으로 가기");
		System.out.println("4. 다음 층으로 내려가기");
		System.out.println("0. 내 정보 확인하기");
		System.out.println(Color.YELLOW+"어디로 이동하시겠습니까?"+Color.RESET);
		return input.nextInt();
	}
	
	public int getHealCount() {
		return healCount;
	}	
	public void setHealCount(int num) {
		healCount = num;
	}
	
	public int getStoreCount() {
		return storeCount;
	}	
	public void setStoreCount(int num) {
		storeCount = num;
	}
	
	public Store getStore() {
		return store;
	}

}


