package Field;

import java.util.Scanner;

import Character.*;
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
	
	public void inStore(Player player) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println();
			getStore().printStore();
			getStore().showList();

			System.out.println(Color.YELLOW+"상점의 장비를 선택하세요 (나가기 : 0)"+Color.RESET);
			int storeIdx = scanner.nextInt()-1;
			if (storeIdx+1 == 0) {
				break;
			}
			System.out.println();
			player.printInventoryAll();
			System.out.println(Color.YELLOW+"당신의 장비를 선택하세요 (다시선택 : 0)"+Color.RESET);
			int invenIdx = scanner.nextInt()-1;
			if (invenIdx+1 == 0) {
				continue;
			}
			else if (invenIdx+1 == 5) {
				System.out.println("");
				System.out.println("고유장비는 변경할 수 없습니다");
				continue;
			}
			else {
				player.setInventory(invenIdx,getStore().getStoreList(storeIdx));
				player.printInventoryAll();
				setStoreCount(0);
				break;
			}
		}//end of while 상점
	}
	
	public void visitWell(Player player) {
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("회복의 샘에 왔습니다");
		System.out.println("---------------------------------");
		System.out.println("체력을 8 회복합니다  남은 횟수 : "+getHealCount());
		System.out.println(Color.YELLOW+"(예:1 아니오:0)"+Color.RESET);				
		if (scanner.nextInt()==1) {
			player.setHp(player.getHp()+8);
			if (player.getHp()>player.getMaxHp()) {
				player.setHp(player.getMaxHp());
			}
			setHealCount(getHealCount()-1);
		}
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


