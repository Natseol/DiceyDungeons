package Character;

import ItemList.*;

public class Job extends Status {

    protected String job;    

	public String getJob() {
		return job;
	}
	
	public void setJobWarrior() {
		maxHp=26;
		hp=maxHp;
		job = "전사";
		diceQuantity = 2;
	}	

	public void setJobThief() {
		maxHp=23;
		hp=maxHp;
		job = "도적";
		diceQuantity = 3;
	}

	public void setJobArcher() {
		maxHp=25;
		hp=maxHp;
		job = "궁수";
		diceQuantity = 3;
	}	
	public void setJobMagician() {
		maxHp=22;
		hp=maxHp;
		job = "마법사";
		diceQuantity = 3;
	}
	
	public void setJobKnight() {
		maxHp=28;
		hp=maxHp;
		job = "기사";
		diceQuantity = 2;
	}
	
	public void setJobItem(String job, int num) {
		switch (job) {
		case "전사" :
			if (num == 1) {
				inventory[0]= new Sword();
				inventory[1]= new Axe();
				inventory[2]= new Nothing();
				inventory[3]= new Nothing();
				inventory[4]= new Reroll();
			}
			if (num == 2) {
				inventory[0]= new Sword();
				inventory[1]= new Boomerang();
				inventory[2]= new Nothing();
				inventory[3]= new Nothing();
				inventory[4]= new Rising();
			}
			break;
		case "도적" :
			if (num == 1) {
				inventory[0]= new PoisonGas();  
				inventory[1]= new Dagger();     
				inventory[2]= new Nothing(); 
				inventory[3]= new Nothing();
				inventory[4]= new LockPick(); 
			}
			if (num == 2) {
				inventory[0]= new PoisonGas();
				inventory[1]= new PoisonKnife();
				inventory[2]= new Nothing();
				inventory[3]= new Nothing();
				inventory[4]= new Drop();
			}
			break;
		case "궁수" :
			if (num == 1) {
				inventory[0]= new Bow();  
				inventory[1]= new Crossbow();
				inventory[2]= new Nothing(); 
				inventory[3]= new Nothing(); 
				inventory[4]= new Precisoin();
			}
			if (num == 2) {
				inventory[0]= new Bow();
				inventory[1]= new Trap();
				inventory[2]= new Nothing();
				inventory[3]= new Nothing();
				inventory[4]= new Clone();
			}
			break;
		case "마법사" :
			if (num == 1) {
				inventory[0]= new Wand();  
				inventory[1]= new IceShards();     
				inventory[2]= new Nothing(); 
				inventory[3]= new Nothing(); 
				inventory[4]= new Mirror();
			}
			if (num == 2) {
				inventory[0]= new Wand();
				inventory[1]= new Staff();
				inventory[2]= new Nothing();
				inventory[3]= new Nothing();
				inventory[4]= new Spare();
			}
			break;
		case "기사" :
			if (num == 1) {
				inventory[0]= new Charge();  
				inventory[1]= new SpikeShield();     
				inventory[2]= new Nothing(); 
				inventory[3]= new Nothing(); 
				inventory[4]= new Guard();
			}
			if (num == 2) {
				inventory[0]= new Charge();  
				inventory[1]= new HolySword();     
				inventory[2]= new Nothing(); 
				inventory[3]= new Nothing(); 
				inventory[4]= new MagicShield();
			}
			break;
		default : break;
		}
	}
}
