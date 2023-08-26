package Item;

import Battle.MyTurn;
import Character.Enemy;
import Character.Player;

public class Item{
	
	String name;
	String description;	
	int times;
	int count;
	int changeDice=0;
	boolean check=false;
	
	public void action(Player player, Enemy enemy, int dice, MyTurn my) {}
	
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
		System.out.println(dice+" 만큼 피해를 줬습니다!!");
	}
	
	public void damage(int dice, int num) {
		System.out.println(dice+" 만큼 피해를 줬습니다!!!!");
	}
	
	public void damage(int dice, int num1, int num2) {
		System.out.println(dice+" 만큼 피해를 줬습니다!!!!!!");
	}
	
	public void takeDamage(int dice) {
		System.out.println(dice+" 만큼 피해를 받았습니다!!");
	}
	
	public void gainDefence(int dice) {
		System.out.println(dice+" 만큼 방어력을 얻었습니다!!");
	}	

	public void recovery(int num) {
		System.out.println(num+" 만큼 체력을 회복했습니다");
	}
	
	public void printCount(int count) {
		this.description="10 피해를 줍니다 (카운트 15) 현재 : "+count;
	}
	
	public void printWand(int count) {
		this.description="6 화염 피해를 줍니다 (카운트 8) 현재 : "+count;
	}
	
	public void printShard() {
		this.description="ㅁ 만큼 얼음 피해를 줍니다 (홀수만 가능)";
	}
	
	public void printGlove() {
		this.description="ㅁ 만큼 마비 피해를 줍니다 (2~5 만 가능)";
	}	
	
	public void recoveryM(int num, int count) {
		this.description=num+" 만큼 체력을 회복합니다 (카운트 16) 현재 : "+count;
	}
	
	public void recoveryB() {
		this.description="2 만큼 체력을 회복합니다 (재사용 가능)";
	}
	
	public void recoveryH() {
		this.description="ㅁ 만큼 체력을 회복합니다 (최대 3)";
	}
}
