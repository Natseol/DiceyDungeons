package Character;

import Item.*;

public class Enemy extends Status{
	String name;
	String description;
	Item[] inventory;
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}		
}
