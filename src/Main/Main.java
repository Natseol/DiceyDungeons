package Main;

import Item.Cannon;

public class Main {

	public static void main(String[] args) {
		
		Cannon swrd = new Cannon();
		
		System.out.println(swrd.getDescription());
		swrd.action();
		System.out.println();
		
	}
}
