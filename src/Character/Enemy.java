package Character;

import Battle.EnemyTurn;
import Item.Item;
import ItemList.*;
import Monster.*;

public class Enemy extends Status{
	protected String name;
	protected String description;
	protected String grade;
	
	public Enemy() {}
	
	public static Enemy setEnemy(int num) {		
		switch (num) {		
		case 0 : return new Marine();//1층			
		case 1 : return new Caster();
		case 2 : return new Frog();
		case 3 : return new Quartz();//2층
		case 4 : return new Scholar();
		case 5 : return new Pirate();
		case 6 : return new Gatekeeper();//3층   
		case 7 : return new Onepun();         
		case 8 : return new Fighter();     
		case 9 : return new SnowMan();
		case 10 : return new Vampire();//4층        
		case 11 : return new Bear();           
		case 12 : return new Wolf();
		case 13 : return new Meteorologist();
		case 14 : return new GatekeeperElite();//5층
		case 15 : return new SwordMan();       
		case 16 : return new Mimic();          
		case 17 : return new Witch();
		case 18 : return new VampireElite();//6층		
		}
		return new Marine();
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public String getGrade() {
		return grade;
	}
	
	public void action(EnemyTurn EnemyTurn) {}
	
}
