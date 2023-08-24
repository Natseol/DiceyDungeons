package Item;

public class Spear extends Item{

	public Spear()	{
		this.name = "창";
		this.description = "10만큼 피해를 줍니다 (6 눈금만 사용 가능)";
		this.times=1;
	}	
	
	@Override
	public void action() {
		if (super.dice==6) {
			super.enemyHp-=10;
			damage(10);			
			super.times=0;
			super.dice=0;
		}
		else {
			checkDice();
		}
	}	
}
//창 :  10만큼의 피해를 준다(6의 눈금만 사용가능)
