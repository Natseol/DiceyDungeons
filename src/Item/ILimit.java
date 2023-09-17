package Item;

import java.util.ArrayList;
import java.util.List;

public interface ILimit {
	public void setLimit(String limit);
	public String getLimit();

	default boolean actionLimit(int dice) {//""이면 true, 숫자 포함되어있으면 true
		if (getLimit().equals("")) return true;
		
		String[] limitStr = getLimit().split(" ");
		int[] limitInt = new int[limitStr.length];
		for (int i = 0; i < limitInt.length; i++) {
			limitInt[i]=Integer.parseInt(limitStr[i]);
		}
		
		List<Integer> limitList = new ArrayList<>();
		for (int i : limitInt) {
			limitList.add(i);			
		}		
		return limitList.contains(dice);		
	};
}