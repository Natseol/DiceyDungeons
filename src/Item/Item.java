package Item;

import Battle.*;
import Character.*;
import Main.Color;

public class Item{
	
	String name;
	String description;	
	int times;
	int count;
	int changeDice;
	boolean check;
	
	public void action(Player player, Enemy enemy, int dice, MyTurn my) {}
	
	public void action(Enemy enemy, Player player, int dice, EnemyTurn enemyTurn) {}
	
	public boolean checkDice(int dice) {
		return check=false;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setTimes(int num) {
		times = num;
	}
	
	public void setCount(int num) {
		count = num;
	}
	
	public int getTimes() {
		return times;
	}
	
	public int getCount() {
		return count;
	}
	
	public boolean getCheck() {
		return check;
	}
	
	public void setCheck(boolean b) {
		check = b;
	}
	
	public int getChangeDice() {
		return changeDice;
	}
	
	public void setChangeDice(int dice) {
		changeDice = dice;
	}
	
	public void checkPrint() {
		System.out.println("********** 주사위 눈을 확인하세요 **********");
	}
	
	public void damage(int dice) {
		System.out.println(Color.B_RED+dice+" 의 피해를 줬습니다!!"+Color.RESET);
	}
	
	public void damage(int dice, int num) {
		System.out.println(Color.B_RED+dice+" 의 피해를 줬습니다!!!!"+Color.RESET);
	}
	
	public void damage(int dice, int num1, int num2) {
		System.out.println(Color.B_RED+dice+" 의 피해를 줬습니다!!!!!!"+Color.RESET);
	}
	
	public void takeDamage(int dice) {
		System.out.println(" == "+dice+" 의 피해를 받았습니다!! ==");
	}
	
	public void gainDefence(int dice) {
		System.out.println(Color.B_YELLOW+dice+" 의 방어력을 얻었습니다!!"+Color.RESET);
	}	

	public void recovery(int num) {
		System.out.println(Color.B_GREEN+num+" 의 체력을 회복했습니다"+Color.RESET);
	}
	
	public void printCount(int count) {
		this.description="[10] 의 피해를 줍니다 (카운트 15)";
	}
	
	public void printWand(int count) {
		this.description="[6] 의 화염 피해를 줍니다 (카운트 8)";
	}
	
	public void printShard() {
		this.description="ㅁ 의 얼음 피해를 줍니다 (홀수만 가능)";
	}
	
	public void printGlove() {
		this.description="ㅁ 의 마비 피해를 줍니다 (2~5 만 가능)";
	}	
	
	public void recoveryM(int num) {
		this.description=num+" 의 체력을 회복합니다 (카운트 16)";
	}
	
	public void recoveryB() {
		this.description="[2] 의 체력을 회복합니다 (재사용 가능)";
	}
	
	public void recoveryH() {
		this.description="ㅁ 의 체력을 회복합니다 (최대 3 이하)";
	}
}
