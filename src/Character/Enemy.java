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
		case 0 : return new Marine();			
		case 1 : return new Frog();
		case 2 : return new Gatekeeper();   
		case 3 : return new Fighter();     
		case 4 : return new Mimic();          
		case 5 : return new GatekeeperElite();
		case 6 : return new SnowMan();
		case 7 : return new Onepun();         
		case 8 : return new Vampire();        
		case 9 : return new SwordMan();       
		case 10 : return new Bear();           
		case 11 : return new Witch();
		case 12 : return new VampireElite();
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
