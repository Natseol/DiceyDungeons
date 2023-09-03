package Dice;

public class Roll {
	public static int roll6() {
		return (int)(Math.random()*6)+1;
	}
	
	public static int random(int num) {
		return (int)(Math.random()*num)+1;
	}
	
	public static int[] shuffle(int num) {
		int[] arr = new int[num];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		for (int i = 0; i < arr.length; i++) {
			int random = random(num-1);
			int temp = arr[i];
			arr[i] = arr[random];
			arr[random] = temp;			
		}		
		return arr;
	}
}
