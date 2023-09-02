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
	
	public void printTakedDamage(int dice) {
		System.out.println(" =="+Color.B_RED+" "+dice+" "+Color.RESET+"의 피해를 받았습니다!! ==");
		System.out.println();
	}
	
	public void printTakeFire(int dice) {
		System.out.println(Color.B_RED+" == "+dice+" 의 화염 피해를 줬습니다!! == "+Color.RESET);
		System.out.println();
	}
	
	public void printTakeIce(int dice) {
		System.out.println(Color.B_BBLUE+" == "+dice+" 의 냉기 피해를 줬습니다!! == "+Color.RESET);
		System.out.println();
	}
	
	public void printTakePoison(int num) {
		System.out.println(Color.GREEN+" == +"+num+" 중독 되었습니다!! == "+Color.RESET);
		System.out.println();
	}
	
	public void printTakeParalysis(int dice) {
		System.out.println(Color.B_BPURPLE+" == "+dice+" 의 마비 피해를 줬습니다!! == "+Color.RESET);
		System.out.println();
	}
	
	public void printGainDefence(int dice) {
		System.out.println(" "+Color.B_BYELLOW+" "+dice+" "+Color.RESET+" 의 방어력을 얻었습니다!!");
		System.out.println();
	}	

	public void printRecovery(int dice) {
		System.out.println(" "+Color.B_BGREEN+" "+dice+" "+Color.RESET+" 의 체력을 회복했습니다");
		System.out.println();
	}
	
	public void printIncorrectDice() {
		System.out.println(" * 눈금이 맞지않아 발동되지 않았습니다 *");
		System.out.println();
	}	
	
}
