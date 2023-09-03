//		player.setCondition(0,3);
//		player.setCondition(1,2);
//		player.setCondition(2,2);
//		player.setCondition(3,2);
//		
//		player.setSp(14);
//		
//			enemy[eNum].setCondition(0,3);
//			enemy[eNum].setCondition(1,2);
//			enemy[eNum].setCondition(2,2);
//			enemy[eNum].setCondition(3,2);
//			

//				for (int i = 0; i < 5; i++) {
//				System.out.print(player.getInventory(i).getTimes()+" ");
//				}
//				System.out.println();
//				for (int i = 0; i < 5; i++) {
//				System.out.print(myturn.getTurnTimes(i)+" ");
//				}
//				System.out.println();
				
//
//					for (int i=0;i<6;i++) {
//						System.out.print(myturn.getTurnCount(invenIdx)+"  ");
//					}
//					System.out.println();
//
//					for (int i=0;i<6;i++) {
//						System.out.print(player.getInventory(i).getCount()+"  ");
//					}
//					System.out.println();
//					
//					System.out.println("횟수 : "+player.getInventory(invenIdx).getTimes());
//					System.out.println("횟수 : "+myturn.getTurnTimes(invenIdx));
//					
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
