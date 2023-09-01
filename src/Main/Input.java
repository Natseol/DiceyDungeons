package Main;

public class Input {
	
	public static int checkInput(String str) {
		int num=20;
		if(str.matches("[0-9]+")) {
			num = Integer.parseInt(str);
		}
		return num;
	}
}

