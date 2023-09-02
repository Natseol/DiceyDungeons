//package Main;
//
//import java.util.Scanner;
//
//import Battle.*;
//import Character.*;
//import Dice.*;
//import Field.*;
//import ItemList.*;
//import Monster.*;
//
//public class MainCopy extends Script {
//	
//	public static void main(String[] args) {
//
//		Scanner scanner = new Scanner(System.in);
//		Script script = new Script();		
//
//		script.chooseJob();
//		int inputNum=0;
//		while (inputNum>5||inputNum<1) {
//		inputNum=Input.checkInput(scanner.nextLine());
//		}
//		Player player = new Player(inputNum);
//
////		player.setCondition(0,3);
////		player.setCondition(1,2);
////		player.setCondition(2,2);
////		player.setCondition(3,2);
//		
//		player.setSp(14);
//
//		int floor=1;		
//		int eNum=0;
//
//		Field field = new Field();
//
//		while (true) {//스테이지 진입
//
//			Enemy[] enemy = new Enemy[]{
//					new Marine(),
//					new Frog(),
//					new Gatekeeper(),
//					new Fighter(),
//					new Mimic(),
//					new GatekeeperElite(),
//					new SnowMan(),
//					new Onepun(),
//					new Vampire(),
//					new SwordMan(),
//					new Bear(),
//					new Witch(),
//					new VampireElite()
//			};
//			
////			enemy[eNum].setCondition(0,3);
////			enemy[eNum].setCondition(1,2);
////			enemy[eNum].setCondition(2,2);
////			enemy[eNum].setCondition(3,2);
//			
//			MyTurn myturn = new MyTurn(player);//주사위 초기화
//			script.startBattle();			
//			while (true) {//전투시작
//
//				myturn = new MyTurn(player);//주사위 초기화
//				EnemyTurn enemyTurn = new EnemyTurn(enemy[eNum]);
//				
//				myturn.doMyTurnLoop(player, enemy[eNum], enemyTurn);
//				
////				myturn.setBattle(player);
////				if (player.getCondition(3)>0) {
////					player.damagedPoison();	
////				}//상태이상	중독
////				if (player.getHp()<1||enemy[eNum].getHp()<1) break;
////				//죽었는지 확인
////				
////				while (true) { //내턴시작
////
////					script.printBattleInfo(player, enemy[eNum]);					
////					script.printItem(myturn);
////					
////					while (player.getCondition(1)>0) {
////						if (player.getCondition(1)>0) {
////							script.selectDice(myturn);	
////							player.damagedIce(myturn);
////							script.printDamagedIce();
////						}//상태이상 빙결
////					}
////
////					script.selectDice(myturn);
////					int idxDice=30;
////					while ((idxDice>myturn.getDice().length||idxDice<0)&&idxDice!=99&&idxDice!=77) {
////						idxDice=Input.checkInput(scanner.nextLine());
////					}
////					
////					if (idxDice==0) {
////						script.selectTurnEnd();
////						break; //턴종료
////					}
////					else if (idxDice==99) {
////						script.printEnemyInfo(enemyTurn, enemy[eNum]);
////						scanner.nextLine();
////						continue;
////					}
////					else if (idxDice==77) {
////						Skill.useSkill(player, enemy[eNum], myturn);
////						continue;
////					}
////					
////					if (player.getCondition(0)>0) {
////						player.damagedFire();	
////					}//상태이상	발화					
////					if (player.getHp()<1||enemy[eNum].getHp()<1) break;
////					//죽었는지 확인
////
////					int numDice=myturn.getDice(idxDice-1);
////					script.printSelectedDice(numDice);
////					script.printSelectItem(myturn);
////
////					int idxInven=30;
////					while ((idxInven>myturn.getItem().length-1||idxInven<-1)) {
////						idxInven=Input.checkInput(scanner.nextLine())-1;
////					}					
////					
////					if (idxInven==-1) {
////						script.startMyTurn();
////						continue;
////					}
////					System.out.println();
////
////					if (player.getCondition(0)>0) {
////						player.damagedFire();	
////					}//상태이상	발화
////					if (player.getHp()<1||enemy[eNum].getHp()<1) break;
////					//죽었는지 확인
////
////					if (player.getCondition(2)>0) {
////						if (player.damagedParalysis(myturn, idxDice)) {
////						myturn.rebuildDice();
////						continue;
////						}
////					}//상태이상 마비
////
////					myturn.getItem(idxInven).setCheck(false);//조건 초기화
////					myturn.getItem(idxInven).setChangeDice(0);//조건 초기화
////					if (myturn.getItem(idxInven).checkDice(numDice)==true) {
////						script.printCheckTrue();
////						continue;
////					}//장비 조건 확인
////					
//////					System.out.println("횟수 : "+player.getInventory(invenIdx).getTimes());
//////					System.out.println("횟수 : "+myturn.getTurnTimes(invenIdx));
////					
////					for (int i=0;i<5;i++) {
////						System.out.print(player.getInventory(i).getCount()+"  ");
////					}
////					System.out.println();
////					for (int i=0;i<5;i++) {
////						System.out.print(myturn.getItem(i).getCount()+"  ");
////					}
////					System.out.println();
////					
////					if (myturn.getIsUseSkill()) {
////					myturn.getItem(idxInven).action(player, enemy[eNum], numDice, myturn, idxInven);
////					System.out.println(CYAN+" * 한번 더 발동합니다 *\n"+RESET);					
////					myturn.setIsUseSkill(false);
////					}
////					myturn.getItem(idxInven).action(player, enemy[eNum], numDice, myturn, idxInven);
////					//장비 발동
////					if (player.getHp()<1||enemy[eNum].getHp()<1) break;
////					//죽었는지 확인
////					
//////					System.out.println("횟수 : "+player.getInventory(invenIdx).getTimes());
//////					System.out.println("횟수 : "+myturn.getTurnTimes(invenIdx));
//////
//////					for (int i=0;i<6;i++) {
//////						System.out.print(myturn.getTurnCount(invenIdx)+"  ");
//////					}
//////					System.out.println();
////					
////					player.getInventory(idxInven).setCount(myturn.getTurnCount(idxInven));
//////					//카운트 동기화
////
//////					for (int i=0;i<6;i++) {
//////						System.out.print(player.getInventory(i).getCount()+"  ");
//////					}
//////					System.out.println();
////					
////					myturn.setDice(idxDice-1, myturn.getItem(idxInven).getChangeDice());
////					//사용한 주사위 눈금 변경
////
////					if (myturn.getItem(idxInven).getName()==new GreatSword().getName()&&myturn.getTurnTimes(idxInven)==0) {
////						myturn.setItem(idxInven, new UsedGreat());
////						player.setInventory(idxInven, new UsedGreat());						
////					}
////					else if (myturn.getTurnTimes(idxInven)==0) {
////						myturn.setItem(idxInven, new Nothing());
////					}//횟수0 아이템은 빈슬롯으로 변경
////					
//////					System.out.println("횟수 : "+player.getInventory(invenIdx).getTimes());
//////					System.out.println("횟수 : "+myturn.getTurnTimes(invenIdx));
////					
////					myturn.rebuildDice();//주사위 정리
////
////				}//end of while : 내 턴
//
//				if (player.getHp()<1||enemy[eNum].getHp()<1) break;
//
//				//*****************
//				// 전투 탈출
//				//*****************
//
//				System.out.println();
//				System.out.println("---------------------------------");
//				System.out.println("종료 = 1");
//				if (scanner.nextLine().equals("1")) {					
//					break;
//				}
//
//				System.out.println();
//				enemyTurn.doEnemyTurnLoop(player, enemy[eNum], myturn);
//				
////				if (enemy[eNum].getCondition(3)>0) {
////					enemy[eNum].damagedPoison();	
////				}//상태이상	중독
////				if (player.getHp()<1||enemy[eNum].getHp()<1) break;
////				//죽었는지 확인
////				
////				script.printBattleInfo(player, enemy[eNum]);
////				script.printItem(enemyTurn);
////				script.selectDice(enemyTurn);
////				
////				
////				while (enemy[eNum].getCondition(1)>0) {
////					if (enemy[eNum].getCondition(1)>0) {
////						enemy[eNum].damagedIce(enemyTurn);
////						script.selectDice(enemyTurn);	
////						script.printDamagedIce();
////					}//상태이상 빙결
////				}
////
////				int enemyItemNum=0;
////				for (int i =0; i<enemyTurn.getDice().length;i++) {
////					scanner.nextLine();
////					enemyTurn.rebuildDice();
////					
////					if (enemy[eNum].getCondition(0)>0) {
////						enemy[eNum].damagedFire();	
////					}//상태이상	발화
////					if (player.getHp()<1||enemy[eNum].getHp()<1) break;
////					//죽었는지 확인
////					
////					script.printSelectedDice(enemyTurn.getDice(i));
////					script.printSelectedDiceUse(enemyItemNum, enemy[eNum]);
////					if (enemy[eNum].getCondition(2)>0) {
////						if (enemy[eNum].damagedParalysis(enemyTurn, i)) {
////							enemyTurn.rebuildDice();							
////							i--;
////							continue;
////						}
////					}//상태이상 마비
////					
////					if (enemy[eNum].getCondition(0)>0) {
////						enemy[eNum].damagedFire();	
////					}//상태이상	발화
////					if (player.getHp()<1||enemy[eNum].getHp()<1) break;
////					//죽었는지 확인
////					
////
//////					for (int j=0;j<enemy[eNum].getInventory().length;j++) {
//////						System.out.print(enemy[eNum].getInventory(j).getCount()+"  ");
//////					}
//////					System.out.println();
//////					for (int j=0;j<enemy[eNum].getInventory().length;j++) {
//////						System.out.print(enemyTurn.getItem(j).getCount()+"  ");
//////					}
//////					System.out.println();
////					
//////					if (enemyTurn.getItem(enemyItemNum).getName()==new Nothing().getName()) enemyItemNum--;//확인해야함
////					enemyTurn.getItem(enemyItemNum).action
////					(enemy[eNum], player, enemyTurn.getDice(i), enemyTurn, enemyItemNum);
////					
////					enemy[eNum].getInventory(enemyItemNum).setCount(enemyTurn.getTurnCount(enemyItemNum));
////					//카운트 동기화
////					
//////					for (int j=0;j<enemy[eNum].getInventory().length;j++) {
//////						System.out.print(enemy[eNum].getInventory(j).getCount()+"  ");
//////					}
//////					System.out.println();
//////					for (int j=0;j<enemy[eNum].getInventory().length;j++) {
//////						System.out.print(enemyTurn.getItem(j).getCount()+"  ");
//////					}
////					System.out.println();
////
////					if (enemyTurn.getItem(enemyItemNum).getTimes()==0) {
////						enemyTurn.setItem(enemyItemNum, new Nothing());
////					}//횟수0 아이템은 빈슬롯으로 변경
////
////					script.printBattleInfo(player,enemy[eNum]);
////					script.printItem(enemyTurn);
////					if (enemy[eNum].getInventory(enemyItemNum).getTimes()>0) {
////						enemyItemNum--;
////					}
////					enemyItemNum++;
////					if (player.getHp()<1||enemy[eNum].getHp()<1) {
////						break;
////					}
////				}
////				scanner.nextLine();
////
////				for (int i=0; i<enemy[eNum].getInventory().length;i++) {
////					enemy[eNum].getInventory(i).setTimes(1);
////				}
//				
//				if (player.getHp()<1||enemy[eNum].getHp()<1) break;
//				
//				script.startMyTurn();
//
//			}//end of while Battle
//
//			if (player.getHp()<1) {
//				script.printBattleInfo(player, enemy[eNum]);
//				System.out.println();
//				System.out.println(RED+" YOU DIED"+RESET);
//				break;
//			}//졌을 때
//			if (enemy[eNum].getHp()<1) {
//				System.out.println();
//				System.out.println(B_CYAN+enemy[eNum].getName()+"을(를) 물리쳤습니다!!"+RESET);
//				eNum++;
//				player.levelUp();
//			}//이겼을 때
//
//			player.resetPlayer();//플레이어 정보 초기화
//
//			while (true) {//필드진입
//				
//				script.chooseInField(floor);
//				int chooseInField=Input.checkInput(scanner.nextLine());
//				
////				int chooseInField = field.move(floor);
//				if (chooseInField == 1) {//1.전투
//					if(eNum == 2||eNum == 5||eNum == 8||eNum == 12 ) {
//						System.out.println();
//						System.out.println("이 층에는 더이상 적이 없습니다");
//						continue;
//					}
//					System.out.println();
//					break;
//				}
//				else if (chooseInField == 2) {//2.상점
//					if (field.getStoreCount()==1) {
//						field.inStore(player);
//					}
//					else {
//						script.changeAlready();
//					}
//
//				}
//				else if (chooseInField == 3) {//3.회복샘
//					if (field.getHealCount()>0) {
//						field.visitWell(player);
//					}
//					else {
//						script.useAlready();
//					}
//				}
//				else if (chooseInField == 4) {//4.다음층
//					if (eNum>=8&&eNum<=11) eNum=12;
//					if (eNum>=5&&eNum<=7) eNum=8;
//					if (eNum>=2&&eNum<=4) eNum=5;
//					if (eNum>=0&&eNum<=1) eNum=2;
//					floor++;
//					field = new Field();
//					System.out.println();
//					System.out.println();
//					System.out.println("\t*** 한 층 더 아래로 내려갑니다 ***");
//					System.out.println();
//					System.out.println();
//					break;
//				}
//				else {//아무키. 정보					
//					script.printPlayerInfo(player);
//					script.printInventoryAll(player);
//					continue;
//				}
//			}//end of while Field
//		}//end of while stage
//		scanner.close();
//	}//end of main
//}
//
