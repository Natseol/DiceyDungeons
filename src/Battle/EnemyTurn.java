package Battle;

import java.util.Arrays;
import java.util.Scanner;

import Character.*;
import Dice.Roll;
import Item.Item;
import ItemList.*;
import Main.Script;

public class EnemyTurn extends TurnInfo{
	
	public EnemyTurn(Status enemy) {
		super(enemy);
		diceQ = enemy.getDiceQuantity();		
		turnItem= enemy.getInventory().clone();	
		dice=new int[diceQ];
		for (int i = 0; i < dice.length; i++) {
			dice[i]=Roll.roll6();			
		}
		itemState=new int[enemy.getInventory().length][3];
		resetCount(enemy);
	}
	
	public void doEnemyTurnLoop(Player player, Enemy enemy, MyTurn myturn) {
		Scanner scanner = new Scanner(System.in);
		
		if (enemy.getCondition(3)>0) {
			enemy.damagedPoison();	
		}//상태이상	중독
		if (player.getHp()<1||enemy.getHp()<1) return;
		//죽었는지 확인
		
		script.printBattleInfo(player, enemy);
		script.printItem(this);
		script.selectDice(this);
		
		
		while (enemy.getCondition(1)>0) {
			if (enemy.getCondition(1)>0) {
				enemy.damagedIce(this);
				script.selectDice(this);	
				script.printDamagedIce();
			}//상태이상 빙결
		}

		while (getDice().length>0) {
			int enemyItemNum=0;
			scanner.nextLine();

				rebuildDice();
				int maxMin = getDice(0);
				int indexDice = 0;				 
		        for (int i = 0; i < getDice().length; i++) {
		            if (getDice(i) > maxMin) {
		                maxMin = getDice(i);
		                indexDice = i;
		            }
		        }
		        if (enemy.getName().equals("마녀")) {
					maxMin = getDice(0);
					indexDice = 0;	
		        	for (int i = 0; i < getDice().length; i++) {
			            if (getDice(i) < maxMin) {
			                maxMin = getDice(i);
			                indexDice = i;
			            }
			        }	
		        }
		        	
				
				if (enemy.getCondition(0)>0) {
					enemy.damagedFire();	
				}//상태이상	발화
				if (player.getHp()<1||enemy.getHp()<1) break;
				//죽었는지 확인

				script.printSelectedDice(getDice(indexDice));
				if (enemy.getCondition(2)>0) {
					if (enemy.damagedParalysis(this, 0)) {
						rebuildDice();
						continue;
					}
				}//상태이상 마비

				if (enemy.getCondition(0)>0) {
					enemy.damagedFire();	
				}//상태이상	발화
				if (player.getHp()<1||enemy.getHp()<1) break;
				//죽었는지 확인

				for(int j=0; j<getItem().length;j++) {
					if (getItem(enemyItemNum).getName().equals(new Nothing().getName())) {
						enemyItemNum++;
						continue;
					}
					script.printSelectedDiceUse(enemyItemNum, enemy);
					getItem(j).action
					(enemy, player, getDice(indexDice), this, enemyItemNum);

					getItem(enemyItemNum).setCount(getTurnCount(enemyItemNum));
					//카운트 동기화			

					setDice(indexDice, getItem(enemyItemNum).getChangeDice());
					//사용한 주사위 눈금 변경
					if (getItem(enemyItemNum).getTimes()==0) {
						setItem(enemyItemNum, new Nothing());
					}//횟수0 아이템은 빈슬롯으로 변경
					rebuildDice();
					break;
				}
			System.out.println();
			script.printBattleInfo(player,enemy);
			script.printItem(this);
			if (player.getHp()<1||enemy.getHp()<1) break;
			script.selectDice(this);
			
			int count = 0;
			for (int i = 0 ; i < getItem().length; i++) {
				if (getItem(i).getName().equals(new Nothing().getName())) {
					count++;
				}
			}
			if (count == getItem().length) break;
		}
		scanner.nextLine();
	}
	
}



