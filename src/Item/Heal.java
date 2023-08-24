package Item;

public class Heal extends Item{

	public Heal()	{
		this.name = "치유";
		recoveryH();
		this.times=1;
	}	
	
	@Override
	public void action() {
		if (super.dice>3) {
			checkDice();
		}			
		else {
			super.hp+=super.dice;
			if (super.hp>super.maxHp) {				
				super.hp=super.maxHp;
			}
			recovery(super.dice);
			super.times=0;
			super.dice=0;
		}
	}
}
//치유 : 눈금만큼체력을 회복한다 (최대 눈금3)