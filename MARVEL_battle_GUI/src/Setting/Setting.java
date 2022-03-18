package Setting;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import Player.Player;
import Player.블랙위도우;
import Player.스파이더맨;
import Player.아이언맨;
import Player.토르;
import Player.헐크;

public class Setting {
	static Scanner input= new Scanner(System.in);
	private static Player_team <Player> 팀1 = new Player_team <Player>();
	private static Player_team <Player> 팀2 = new Player_team <Player>();
	static Player_team <Integer> 플레이어 = new Player_team <Integer>();
	
	 public static int 팀원결정하기(int num) {
//	    	System.out.println("플레이어 선택: 1.아이언맨, 2.스파이더맨, 3.헐크, 4.토르, 5.블랙위도우");
//	    	System.out.println("플레이어 4명을 선택하세요. 처음 선택한 2명의 플레이어가 팀1을, 나머지가 팀2를 이룹니다.");
//	    	for (int i = 1; i<5;i++) {
//	    		int num=0;
//	    		while(true) {
//	        		System.out.print(i+"번째 플레이어: ");
//	        		try {
//	        			num = input.nextInt();
//	        			System.out.println();
//	        			
//	        			if (num>5 || num<1) {
//	        				throw new NumberFormatException();
//	        			}
//	        			if (플레이어.ar.contains(num)) {
//	        				throw new Exception();
//	        			}
//	        			
//	        			break;
//	        		}
//	        		catch(InputMismatchException e) {
//	        			System.out.println("정수의 포맷이 아닙니다. 다시 입력하세요");
//	        			input.nextLine();
//	        			continue;
//	        		}
//	        		catch(NumberFormatException e) {
//	        			System.out.println(num+"번 캐릭터는 존재하지 않습니다.");
//	        			input.nextLine();
//	        			continue;
//	        		}
//	        		catch(Exception e) {
//	        			System.out.println("이미 팀에 소속되어 있습니다.");
//	        			input.nextLine();
//	        			continue;
//	        		}
//	        	}
//				switch(num) {
//					case 1: 팀배치하기(new 아이언맨("아이언맨")); 플레이어.add(num); break;
//					case 2: 팀배치하기(new 스파이더맨("스파이더맨")); 플레이어.add(num); break;
//					case 3: 팀배치하기(new 헐크("헐크")); 플레이어.add(num); break;
//					case 4: 팀배치하기(new 토르("토르")); 플레이어.add(num); break;
//					case 5: 팀배치하기(new 블랙위도우("블랙위도우")); 플레이어.add(num); break;
//	    		}
//	        }
		 	switch(num) {
		 		case 1: 팀배치하기(new 아이언맨("아이언맨")); 플레이어.add(num); break;
		 		case 2: 팀배치하기(new 스파이더맨("스파이더맨")); 플레이어.add(num); break;
		 		case 3: 팀배치하기(new 헐크("헐크")); 플레이어.add(num); break;
		 		case 4: 팀배치하기(new 토르("토르")); 플레이어.add(num); break;
		 		case 5: 팀배치하기(new 블랙위도우("블랙위도우")); 플레이어.add(num); break;
		 	}
		 	if (플레이어.size()==4) {
		 		System.out.println("팀 배치 완료!");
		    	System.out.println("<팀1>");
		    	for (int i=0; i<get팀1().size(); i++)
		    		System.out.println(get팀1().get(i).name);
		    	System.out.println("<팀2>");
		    	for (int i=0; i<get팀2().size(); i++)
		    		System.out.println(get팀2().get(i).name);
		    	System.out.println();
		 		return 1;
		 	}
		 	else
		 		return 0;
	    	
	    }
	 
	 public static void 팀배치하기(Player player) {
		 if (get팀1().size()<2)
			 get팀1().add(player);
		 else
			 get팀2().add(player);
	 }
	 
//	 public static void 공격자및타겟선정(Player_team<Player> teamname1, Player_team<Player> teamname2) {
//		 Random random1 = new Random();
//		 Random random2 = new Random();
//		 int ran1 = random1.nextInt(teamname1.size());
//		 int ran2 = random1.nextInt(teamname2.size());
//		 Player 공격자 = teamname1.get(ran1);
//		 Player 타겟 = teamname2.get(ran2);
//		 공격자.attack(타겟);
//		 생사확인(타겟, teamname2);
//	 }
//	 
//	    public static void 생사확인(Player player, Player_team<Player> teamname) {
//	    	if (player.getHp() <= 0) {
//	    		teamname.remove(player);
//	    		System.out.println("▶▷▶▷▶▷▶▷"+player.name+"(이)가 죽었습니다!!◁◀◁◀◁◀◁◀");
//	    		if (팀1.size()==0) {
//	    			System.out.println("★☆★☆★☆★☆★☆팀2가 승리했습니다. 게임을 종료합니다.★☆★☆★☆★☆★☆");
//	    			System.out.print("살아남은 자: ");
//	    	    	for (int i=0; i<팀2.size(); i++)
//	    	    		System.out.print(팀2.get(i).name+"   ");
//	    		}
//	    		if (팀2.size()==0) {
//	    		System.out.println("★☆★☆★☆★☆★☆팀1이 승리했습니다. 게임을 종료합니다.★☆★☆★☆★☆★☆");
//	    		System.out.print("살아남은 자: ");
//	        	for (int i=0; i<팀1.size(); i++)
//	        		System.out.print(팀1.get(i).name+"   ");
//	    		}
//	    	}
//	    	else 
//	    		System.out.println("▶▷"+player.name+"의 hp: "+player.getHp());
//	    	System.out.println();
//	    }

		public static Player_team <Player> get팀2() {
			return 팀2;
		}

		public static void set팀2(Player_team <Player> 팀2) {
			Setting.팀2 = 팀2;
		}

		public static Player_team <Player> get팀1() {
			return 팀1;
		}

		public static void set팀1(Player_team <Player> 팀1) {
			Setting.팀1 = 팀1;
		}

	
	
	
	

}
