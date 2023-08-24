package Item;

import Dice.Roll;

public class Item {
	int hp;
	int enemyHp;
	int def;
	int diceQuantity;
	
	public void sword(int dice) {
		this.enemyHp-=dice;
	}	
//	검 : 눈금만큼 피해를 준다
	
	public void dagger(int dice) {
		this.enemyHp-=dice;
	}	
//	단검 : 눈금만큼 피해를 준다 (최대3의 눈금만 사용가능) (재사용가능)
	
	public void axe(int dice) {
		this.enemyHp-=2*dice;
	}
//	도끼 : 눈금x2의 피해를 준다 (최대4의 눈금만 사용가능)
	
	public void greatSword(int dice) {
		this.enemyHp-=3*dice;
	}
//	대검 : 눈금x3의 피해를 준다 (전투당 1번만 사용가능)
	
	public void boomerang(int dice) {
		this.enemyHp-=2*dice;
		this.hp-=dice;
	}
//	부메랑 : 눈금의 2배만큼 피해를 준다. 주사위 눈금만큼 피해를 받는다.
	
	public void spike(int dice) {
		if (dice%2==0) {
		this.enemyHp-=dice;
		}
		else
		{
		this.def+=dice;
		}
		
	}
//	가시방패:  홀수일 때  눈금만큼 방어력을 얻는다. 짝수일 때 눈금만큼 피해를 준다(최대5의 눈금만 사용가능)
	
	public void spear(int dice) {
		this.enemyHp-=10;
	}
//	창 :  10만큼의 피해를 준다(6의 눈금만 사용가능)
	
	public void fist(int dice) {
		this.enemyHp-=2;
	}
//	주먹 : 2의 피해를 준다 (재사용가능)
	
	public void staff(int dice) {
		this.enemyHp-=dice;
	}
//	스태프 : 눈금만큼의 피해를 준다(눈금이 4일경우 주사위를 돌려받는다)(짝수주사위만 사용가능)
	
	public void cannon(int dice) {
		this.enemyHp-=10;
	}
//	캐논 : 적에게 10만큼의 피해를 준다 (카운트다운15)
	
	public void unknown(int dice) {
		this.enemyHp-=Roll.rollDice(0);
	}
//	알수없음 : 1~6까지의 랜덤한 피해를 준다
	
	public void wand(int dice) {
		this.enemyHp-=6;
	}
//	지팡이 : 6의 피해를 주고 발화효과부여(카운트8)
	
	public void iceShards(int dice) {
		this.enemyHp-=dice;
	}
//	얼음파편:눈금만큼 피해를 주고 냉기효과부여(홀수만 가능)
	
	public void glove(int dice) {
		this.enemyHp-=dice;
	}
//	글러브:눈금만큼 피해를 주고 마비효과부여(최대5의눈금)

	public void rising(int dice) {
		dice++;
	}
//	상승 : 주사위 눈금을 1올린다(6을 넣으면 1주사위가 생김)
	
	public void drop(int dice) {
		dice--;
	}
//	하락 : 주사위눈금을 1하락시킨다(최소2의 눈금)
	
	public void lockPick(int dice) {
		this.enemyHp-=dice;
	}
//	락픽 : 주사위를 둘로 나눈다(재사용1회 가능)
	
	public void saw(int dice) {
		this.enemyHp-=dice;
	}
//	쇠톱 : 주사위를 셋으로 나눈다
	
	public void talisman(int dice, int count) {
		count -= dice;
		if (count<=0)
		{
		}
	}
//	부적 : 6주사위 2개를 얻는다(카운트 10)
	
	public void mirror(int dice) {
		diceQuantity++;
	}
//	거울 : 이 전투에서 주사위 갯수 +1 (눈금6만 가능)
	
	public void spare(int dice) {
		dice=4;
	}
//	예비 : 눈금4 주사위를 획득한다
//
	public void medicKit(int dice) {
		hp+=8;
	}
//	구급상자 : 8만큼 체력을 회복한다 (카운트16)
	
	public void bandage(int dice) {
		hp+=2;
	}
//	붕대 : 2만큼 체력을 회복한다 (재사용가능)
	
	public void heal(int dice) {
		hp+=dice;
	}
//	치유 : 눈금만큼체력을 회복한다 (최대 눈금3)
	
	public void shield(int dice) {
		def+=3;
	}
//	쉴드 : 3의 방어력을 얻는다 (홀수만 가능)
//
//
//	특수능력
	public void change(int dice) {
		dice = Roll.rollDice(0);
	}
//	변경 : 주사위를 다시 굴린다(한턴당3번만 가능)(전사)
	
	public void clone(int dice) {
		this.enemyHp-=dice;
	}
//	위조 : 주사위를 복제한다(도적)
//
//
//	상태이상
//	발화 : 주사위를 사용하려면 체력2 소모
//	마비 : 해당 장비를 사용하려면 주사위1개를 소모해야함
//	빙결 : 가장 큰 주사위 눈금이 1로 바뀐다


}
