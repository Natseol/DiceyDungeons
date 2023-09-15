package Item;

import Character.Player;

public interface IItem {
	String getName();
	String getDescription();
	
//	Player getPlayer();
	
	default int getDamage() {return 0;};
	default int getCount() {return 0;};
	default void actionDamage() {};
	default void actionCount() {};
	
	default void action() {
		if(getDamage() > 0) actionDamage(); 
		if(getCount() > 0) actionCount(); 
	}
}
