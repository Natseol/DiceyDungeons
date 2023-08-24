package Item;

public class Bandage extends Item {

	public Bandage()	{
		this.name = "붕대";
		recoveryB();
		this.times=1;		
	}	
	
	@Override
	public void action() {
		super.hp+=2;
		if (super.hp>super.maxHp) {				
			super.hp=super.maxHp;
		}
		recovery(2);
		super.dice=0;
	}
}
//붕대 : 2만큼 체력을 회복한다 (재사용가능)
