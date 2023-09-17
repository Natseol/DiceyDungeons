package Battle;

import java.util.Arrays;
import java.util.Scanner;

import Character.*;
import Dice.Roll;
import Main.*;
import Field.*;
import Item.Item;
import ItemList.*;

public class MyTurn extends TurnInfo{
	
	boolean isUseSkill;
	
 	public MyTurn(Player player) {
 		super(player);		
		turnItem= player.getInventory().clone();		
		resetDiceList(player);
		isUseSkill=false;
		resetTimes(turnItem);
		resetCount(player);
		resetNeedDice(player);
	}
 	
 	public void startTurn(Player player) {
		turnItem= player.getInventory().clone();	
 		resetDiceList(player);
 		isUseSkill=false;
 		resetTimes(turnItem);
 		resetNeedDice(player);
 	}
 	
 	public boolean getIsUseSkill() {
 		return isUseSkill;
 	}
 	public void setIsUseSkill(boolean useSkill) {
 		isUseSkill = useSkill;
 	}
 	
 	public void doMyTurnLoop(Player player, Enemy enemy, EnemyTurn enemyTurn) {
 		Scanner scanner = new Scanner(System.in);
 		setBattle(player);
		if (player.getCondition(3)>0) {
			player.damagedPoison();	
		}//상태이상	중독
		if (player.getHp()<1||enemy.getHp()<1) return;
		//죽었는지 확인
		
		resetTimes(player.getInventory());
		while (true) { //내턴시작

			script.printBattleInfo(player, enemy);					
			script.printItem(this);
			
			while (player.getCondition(1)>0) {
				if (player.getCondition(1)>0) {
					script.selectDiceList(this);	
					player.damagedIceList(this);
					script.printDamagedIce();
				}//상태이상 빙결
			}

			script.selectDiceList(this);
			int idxDice=30;
			while ((idxDice>getDiceList().size()||idxDice<0)&&idxDice!=99&&idxDice!=77&&idxDice!=88) {
				idxDice=Input.checkInput(scanner.nextLine());
			}
			
			if (idxDice==0) {
				script.selectTurnEnd();
				break; //턴종료
			}
			else if (idxDice==99) {
				script.printEnemyInfo(enemyTurn, enemy);
				scanner.nextLine();
				continue;
			}
			else if (idxDice==88) {
				script.explain();
				scanner.nextLine();
				continue;
			}
			else if (idxDice==77) {
				Skill.useSkill(player, enemy, this);
				continue;
			}
			
			if (player.getCondition(0)>0) {
				player.damagedFire();	
			}//상태이상	발화					
			if (player.getHp()<1||enemy.getHp()<1) break;
			//죽었는지 확인

			int numDice=getDiceList(idxDice-1);
			script.printSelectedDice(numDice);
			script.printSelectItem(this);

			int idxInven=30;
			while ((idxInven>getItem().length-1||idxInven<-1)) {
				idxInven=Input.checkInput(scanner.nextLine())-1;
			}					
			
			if (idxInven==-1) {
				script.startMyTurn();
				continue;
			}//주사위 다시 선택
			System.out.println();

			if (player.getCondition(0)>0) {
				player.damagedFire();	
			}//상태이상	발화
			if (player.getHp()<1||enemy.getHp()<1) break;
			//죽었는지 확인

			if (player.getCondition(2)>0) {
				if (player.damagedParalysisList(this, idxDice)) {
//				rebuildDice();
				continue;
				}
			}//상태이상 마비

			getItem(idxInven).setCheck(false);//조건 초기화
			getItem(idxInven).setChangeDice(0);//조건 초기화
			if (getItem(idxInven).checkDice(numDice)==true) {
				script.printCheckTrue();
				continue;
			}//장비 조건 확인
			
			getDiceList().remove(idxDice-1);
			if (getIsUseSkill()) {
			getItem(idxInven).action(player, enemy, numDice, this, idxInven);
			System.out.println(Color.CYAN+" * 한번 더 발동합니다 *\n"+Color.RESET);					
			setIsUseSkill(false);
			}
			getItem(idxInven).action(player, enemy, numDice, this, idxInven);
			//장비 발동
			if (player.getHp()<1||enemy.getHp()<1) break;
			//죽었는지 확인
			
//			player.getInventory(idxInven).setCount(getTurnCount(idxInven));
//			//카운트 동기화
//			setDice(idxDice-1, getItem(idxInven).getChangeDice());
			//사용한 주사위 눈금 변경
			

			if (getItem(idxInven).getName()==new GreatSword().getName()&&getTurnTimes(idxInven)==0) {
				setItem(idxInven, new UsedGreat());
				player.setInventory(idxInven, new UsedGreat());						
			}
			else if (getTurnTimes(idxInven)==0) {
				setItem(idxInven, new Nothing());
			}//횟수0 아이템은 빈슬롯으로 변경
			
//			rebuildDice();//주사위 정리

		}//end of while : 내 턴
 	}
 	
}
