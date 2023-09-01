package Character;

import java.util.Scanner;

import Battle.MyTurn;
import Dice.Roll;

public class Skill {

	public void useSkillWarrior(Player player,Enemy enemy, MyTurn myturn) {
		Scanner scanner = new Scanner(System.in);
		if (player.getSp()>11) {
			myturn.setIsUseSkill(true);
			switch (player.getJob()) {
			case "도적":
				myturn.setOther(4);
				myturn.setOther(0,1);
				myturn.setOther(1,1);
				myturn.setOther(2,1);
				myturn.setOther(3,1);						
				myturn.rebuildDice();
				break;			
			case "궁수":
				for (int i=0;i<myturn.getItem().length;i++) {
					if (myturn.getItem(i).getCount()>0) {
						myturn.getItem(i).setCount(myturn.getItem(i).getCount()-3);
					}
				}				
				break;				
			case "마법사":
				myturn.setOther(1);
				System.out.println("생성하고 싶은 주사위의 눈금을 적으세요");
				int dice = scanner.nextInt();
				if (dice < 7&&0<dice) {
					myturn.setOther(0,dice);						
				}
				else {
					myturn.setOther(0,Roll.roll6());
				}
				myturn.rebuildDice();
				break;
			case "기사":
				for (int i=0;i<enemy.getCondition().length;i++)
					enemy.setCondition(i, enemy.getCondition(i)+1);
				player.setDef(player.getDef()+6);
				break;
			}
			player.setSp(0);
		}
	}
}
