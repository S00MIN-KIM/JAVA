package Setting;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import Player.Player;
import Player.��������;
import Player.�����̴���;
import Player.���̾��;
import Player.�丣;
import Player.��ũ;

public class Setting {
	static Scanner input= new Scanner(System.in);
	private static Player_team <Player> ��1 = new Player_team <Player>();
	private static Player_team <Player> ��2 = new Player_team <Player>();
	static Player_team <Integer> �÷��̾� = new Player_team <Integer>();
	
	 public static int ���������ϱ�(int num) {
//	    	System.out.println("�÷��̾� ����: 1.���̾��, 2.�����̴���, 3.��ũ, 4.�丣, 5.��������");
//	    	System.out.println("�÷��̾� 4���� �����ϼ���. ó�� ������ 2���� �÷��̾ ��1��, �������� ��2�� �̷�ϴ�.");
//	    	for (int i = 1; i<5;i++) {
//	    		int num=0;
//	    		while(true) {
//	        		System.out.print(i+"��° �÷��̾�: ");
//	        		try {
//	        			num = input.nextInt();
//	        			System.out.println();
//	        			
//	        			if (num>5 || num<1) {
//	        				throw new NumberFormatException();
//	        			}
//	        			if (�÷��̾�.ar.contains(num)) {
//	        				throw new Exception();
//	        			}
//	        			
//	        			break;
//	        		}
//	        		catch(InputMismatchException e) {
//	        			System.out.println("������ ������ �ƴմϴ�. �ٽ� �Է��ϼ���");
//	        			input.nextLine();
//	        			continue;
//	        		}
//	        		catch(NumberFormatException e) {
//	        			System.out.println(num+"�� ĳ���ʹ� �������� �ʽ��ϴ�.");
//	        			input.nextLine();
//	        			continue;
//	        		}
//	        		catch(Exception e) {
//	        			System.out.println("�̹� ���� �ҼӵǾ� �ֽ��ϴ�.");
//	        			input.nextLine();
//	        			continue;
//	        		}
//	        	}
//				switch(num) {
//					case 1: ����ġ�ϱ�(new ���̾��("���̾��")); �÷��̾�.add(num); break;
//					case 2: ����ġ�ϱ�(new �����̴���("�����̴���")); �÷��̾�.add(num); break;
//					case 3: ����ġ�ϱ�(new ��ũ("��ũ")); �÷��̾�.add(num); break;
//					case 4: ����ġ�ϱ�(new �丣("�丣")); �÷��̾�.add(num); break;
//					case 5: ����ġ�ϱ�(new ��������("��������")); �÷��̾�.add(num); break;
//	    		}
//	        }
		 	switch(num) {
		 		case 1: ����ġ�ϱ�(new ���̾��("���̾��")); �÷��̾�.add(num); break;
		 		case 2: ����ġ�ϱ�(new �����̴���("�����̴���")); �÷��̾�.add(num); break;
		 		case 3: ����ġ�ϱ�(new ��ũ("��ũ")); �÷��̾�.add(num); break;
		 		case 4: ����ġ�ϱ�(new �丣("�丣")); �÷��̾�.add(num); break;
		 		case 5: ����ġ�ϱ�(new ��������("��������")); �÷��̾�.add(num); break;
		 	}
		 	if (�÷��̾�.size()==4) {
		 		System.out.println("�� ��ġ �Ϸ�!");
		    	System.out.println("<��1>");
		    	for (int i=0; i<get��1().size(); i++)
		    		System.out.println(get��1().get(i).name);
		    	System.out.println("<��2>");
		    	for (int i=0; i<get��2().size(); i++)
		    		System.out.println(get��2().get(i).name);
		    	System.out.println();
		 		return 1;
		 	}
		 	else
		 		return 0;
	    	
	    }
	 
	 public static void ����ġ�ϱ�(Player player) {
		 if (get��1().size()<2)
			 get��1().add(player);
		 else
			 get��2().add(player);
	 }
	 
//	 public static void �����ڹ�Ÿ�ټ���(Player_team<Player> teamname1, Player_team<Player> teamname2) {
//		 Random random1 = new Random();
//		 Random random2 = new Random();
//		 int ran1 = random1.nextInt(teamname1.size());
//		 int ran2 = random1.nextInt(teamname2.size());
//		 Player ������ = teamname1.get(ran1);
//		 Player Ÿ�� = teamname2.get(ran2);
//		 ������.attack(Ÿ��);
//		 ����Ȯ��(Ÿ��, teamname2);
//	 }
//	 
//	    public static void ����Ȯ��(Player player, Player_team<Player> teamname) {
//	    	if (player.getHp() <= 0) {
//	    		teamname.remove(player);
//	    		System.out.println("����������������"+player.name+"(��)�� �׾����ϴ�!!����������������");
//	    		if (��1.size()==0) {
//	    			System.out.println("�ڡ١ڡ١ڡ١ڡ١ڡ���2�� �¸��߽��ϴ�. ������ �����մϴ�.�ڡ١ڡ١ڡ١ڡ١ڡ�");
//	    			System.out.print("��Ƴ��� ��: ");
//	    	    	for (int i=0; i<��2.size(); i++)
//	    	    		System.out.print(��2.get(i).name+"   ");
//	    		}
//	    		if (��2.size()==0) {
//	    		System.out.println("�ڡ١ڡ١ڡ١ڡ١ڡ���1�� �¸��߽��ϴ�. ������ �����մϴ�.�ڡ١ڡ١ڡ١ڡ١ڡ�");
//	    		System.out.print("��Ƴ��� ��: ");
//	        	for (int i=0; i<��1.size(); i++)
//	        		System.out.print(��1.get(i).name+"   ");
//	    		}
//	    	}
//	    	else 
//	    		System.out.println("����"+player.name+"�� hp: "+player.getHp());
//	    	System.out.println();
//	    }

		public static Player_team <Player> get��2() {
			return ��2;
		}

		public static void set��2(Player_team <Player> ��2) {
			Setting.��2 = ��2;
		}

		public static Player_team <Player> get��1() {
			return ��1;
		}

		public static void set��1(Player_team <Player> ��1) {
			Setting.��1 = ��1;
		}

	
	
	
	

}
