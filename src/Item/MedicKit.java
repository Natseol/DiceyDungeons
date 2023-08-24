package Item;

public class MedicKit extends Item{
	
	public MedicKit()	{
		this.name = "구급상자";
		this.count=16;
		recoveryM(8,this.count);
		this.times=1;		
	}	
	
	@Override
	public void action() {
		if (count>0) {
			count-=super.dice;					
		}
		else {			
			super.hp+=8;
			if (super.hp>super.maxHp) {				
				super.hp=super.maxHp;
			}
			recovery(8);
			super.times=0;
			super.count=16;
		}
		super.dice=0;
	}
}
//구급상자 : 8만큼 체력을 회복한다 (카운트16)
