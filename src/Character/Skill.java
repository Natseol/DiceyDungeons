package Character;

import java.util.Scanner;

import Battle.MyTurn;
import Dice.Roll;
import Main.Color;
import Main.Input;

public class Skill {

	public static void useSkill(Player player,Enemy enemy, MyTurn myturn) {
		Scanner scanner = new Scanner(System.in);
		if (player.getSp()>11) {
			switch (player.getJob()) {
			case "전사":
				System.out.println(Color.CYAN+" [분노] 스킬을 사용합니다");
				System.out.println("  다음 장비를 반복해서 사용합니다\n"+Color.RESET);
				myturn.setIsUseSkill(true);			
			break;
			case "도적":
				System.out.println(Color.CYAN+" [속임수] 스킬을 사용합니다");
				System.out.println("  추가 주사위를 생성합니다\n"+Color.RESET);
				myturn.setOther(4);
				myturn.setOther(0,1);
				myturn.setOther(1,1);
				myturn.setOther(2,1);
				myturn.setOther(3,1);						
				myturn.rebuildDice();
				break;			
			case "궁수":
				System.out.println(Color.CYAN+" [빠른 손놀림] 스킬을 사용합니다");
				System.out.println("  모든 장비의 카운트 -4\n"+Color.RESET);
				for (int i=0;i<myturn.getItem().length;i++) {
					if (myturn.getTurnCount(i)>0) {
						myturn.setTurnCount(i, myturn.getTurnCount(i)-4);
					}
				}
				break;				
			case "마법사":
				myturn.setOther(1);
				System.out.println(Color.CYAN+" [창조] 스킬을 사용합니다"+Color.RESET);
				System.out.println(Color.YELLOW+"  생성하고 싶은 주사위의 눈금을 적으세요"+Color.RESET);
				int dice = Input.checkInput(scanner.nextLine());
				if (dice < 7&&0<dice) {
					myturn.setOther(0,dice);
					System.out.println(Color.CYAN+" 눈금 ["+dice+"] 주사위를 생성합니다"+Color.RESET);
					System.out.println();
				}
				else {
					System.out.println(" 원하는 눈금 창조에 실패했습니다\n");
					myturn.setOther(0,Roll.roll6());
				}
				myturn.rebuildDice();
				break;
			case "기사":
				System.out.println(Color.CYAN+" [신의은총] 스킬을 사용합니다");
				System.out.println("  방어력+5, 적 모든상태이상+1\n"+Color.RESET);
				for (int i=0;i<enemy.getCondition().length;i++)
					enemy.setCondition(i, enemy.getCondition(i)+1);
				player.setDef(player.getDef()+5);
				break;
			}
			player.setSp(0);
		}
	}
}
