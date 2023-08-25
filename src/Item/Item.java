package Item;

import Character.Status;

public class Item extends Status {
	
	String name;
	String description;
	int enemyHp;
	int times;
	int count;
	int dice;
	int condition[];
	
	public void action() {}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void checkDice() {
		System.out.println("주사위 눈을 확인하세요");
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
		System.out.println(num+" 만큼 체력을 회복합니다");
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

//	상태이상
//	발화 : 주사위를 사용하려면 체력2 소모
//	마비 : 해당 장비를 사용하려면 주사위1개를 소모해야함
//	빙결 : 가장 큰 주사위 눈금이 1로 바뀐다


}
