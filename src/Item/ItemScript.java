package Item;

import Main.Color;

public class ItemScript {

	public void printDamage(int dice) {
		System.out.println(" "+Color.B_RED+" "+dice+" "+Color.RESET+" 의 피해를 줬습니다!!");
		System.out.println();
	}
	
	public void printDamage2(int dice) {
		System.out.println(" "+Color.B_RED+" "+dice+" "+Color.RESET+" 의 피해를 줬습니다!!");
		System.out.println(" "+Color.B_RED+" "+dice+" "+Color.RESET+" 의 피해를 줬습니다!!!!");		
		System.out.println();
	}
	
	public void printDamage3(int dice) {
		System.out.println(" "+Color.B_RED+" "+dice+" "+Color.RESET+" 의 피해를 줬습니다!!");
		System.out.println(" "+Color.B_RED+" "+dice+" "+Color.RESET+" 의 피해를 줬습니다!!!!");		
		System.out.println(" "+Color.B_RED+" "+dice+" "+Color.RESET+" 의 피해를 줬습니다!!!!!!");
		System.out.println();
	}
	
	public void printTakeDamage(int dice) {
		System.out.println(" =="+Color.B_RED+" "+dice+" "+Color.RESET+"의 피해를 받았습니다!! ==");
		System.out.println();
	}
	
	public void printTakeFire(int dice) {
		System.out.println(Color.B_RED+" == "+dice+" 의 화염 피해를 줬습니다!! == "+Color.RESET);
		System.out.println();
	}
	
	public void printTakeIce(int dice) {
		System.out.println(Color.B_RED+" == "+dice+" 의 냉기 피해를 줬습니다!! == "+Color.RESET);
		System.out.println();
	}
	
	public void printTakeParalysis(int dice) {
		System.out.println(Color.B_RED+" == "+dice+" 의 마비 피해를 받았습니다!! == "+Color.RESET);
		System.out.println();
	}
	
	public void printGainDefence(int dice) {
		System.out.println(Color.B_YELLOW+" "+dice+" "+Color.RESET+" 의 방어력을 얻었습니다!!");
		System.out.println();
	}	

	public void printRecovery(int dice) {
		System.out.println(Color.B_GREEN+" "+dice+" "+Color.RESET+" 의 체력을 회복했습니다");
		System.out.println();
	}
	
}
