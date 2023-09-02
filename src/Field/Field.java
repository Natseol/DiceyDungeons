package Field;

import java.util.Scanner;

import Character.*;
import Main.Color;
import Main.Input;
import Main.Script;

public class Field {
	
	Store store = new Store();
	int storeCount = 1;
	int healCount = 2;
	
//	public int move(int floor) {
//		Scanner input = new Scanner(System.in); 
//		System.out.println();
//		System.out.println("------------ 지하 "+floor+"층 -------------");
//		System.out.println("1. 다음 전투로");
//		System.out.println("2. 상점 방문하기");
//		System.out.println("3. 회복의 샘으로 가기");
//		System.out.println("4. 다음 층으로 내려가기");
//		System.out.println("0. 내 정보 확인하기");
//		System.out.println(Color.YELLOW+"어디로 이동하시겠습니까?"+Color.RESET);
//		return input.nextInt();
//	}
	
	public void inStore(Player player) {
		Scanner scanner = new Scanner(System.in);
		Script script = new Script();
		while (true) {
			System.out.println();
			script.printStore();
			getStore().showList();

			System.out.println(Color.YELLOW+"상점의 장비를 선택하세요 (나가기 : 0)"+Color.RESET);
			int storeIdx=30;
			while (storeIdx>2||storeIdx<-1) {
				storeIdx=Input.checkInput(scanner.nextLine())-1;
			}			
			if (storeIdx+1 == 0) {
				break;
			}
			
			System.out.println();
			script.printInventoryAll(player);
			System.out.println(Color.YELLOW+"당신의 장비를 선택하세요 (다시선택 : 0)"+Color.RESET);
			int invenIdx=30;
			while (invenIdx>player.getInventory().length-1||invenIdx<-1) {
				invenIdx=Input.checkInput(scanner.nextLine())-1;
			}	
			if (invenIdx+1 == 0) {
				continue;
			}
			else if (invenIdx+1 == player.getInventory().length) {
				System.out.println("");
				System.out.println(" * 고유장비는 변경할 수 없습니다 *");
				continue;
			}
			else {
				player.setInventory(invenIdx,getStore().getStoreList(storeIdx));
				script.printInventoryAll(player);
				setStoreCount(0);
				break;
			}
		}//end of while 상점
	}
	
	public void visitWell(Player player) {
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("회복의 샘에 왔습니다");
		System.out.println("------------------------------------------------");
		System.out.println("체력을 8 회복합니다  남은 횟수 : "+getHealCount());
		System.out.println(Color.YELLOW+"(예:1 아니오:0)"+Color.RESET);
		int input=30;
		while (input!=1&&input!=0) {
			input=Input.checkInput(scanner.nextLine());
		}	
		
		if (input==1) {
			player.addHp(8);
			System.out.println();
			System.out.println(" * 체력을 8 회복했습니다 *");
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


