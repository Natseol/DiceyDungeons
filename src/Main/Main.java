package Main;

import java.util.Scanner;

import Battle.*;
import Character.*;
import Dice.*;
import Item.*;

public class Main {
		
	public static int[] rollADice(int idx) {			
		int dice[]=new int[idx];
		for (int i = 0; i < dice.length; i++) {
			dice[i]=Roll.roll6();			
		}
		return dice;
	}
	
	public int selectDice(int[] dice, int idx) {
		return dice[idx];	 
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
						
		Player player = new Player();
		
		player.setInventory(0, 1);
		player.setInventory(1, 2);
		player.setInventory(2, 41);
		player.setInventory(3, 0);
		player.setInventory(4, 0);
		player.setInventory(5, 81);
		
		for (int i = 0; i < 6; i++) {
			System.out.print(i+1+") "+player.getInventoryName(i));
			System.out.print(" : ");
			System.out.println(player.getInventoryDescription(i));			
		}		
		
		int[] dice = rollADice(player.getDiceQuantity());
		
		for (int i = 0; i < dice.length; i++) {
			System.out.print(dice[i]+"\t");
		}
		System.out.println("주사위를 선택하세요");
		int num = input.nextInt();
		player.setSelectDice(num);
		
		System.out.println("장비를 선택하세요");
		num = input.nextInt();
		Item selectItem = player.getIventory(num);
		selectItem.action();
		
		
		
	}
}
