import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import Player.*;
import Setting.Player_team;
import View.Window_StartView;

public class Main {
	static Scanner input= new Scanner(System.in);
	static Player_team <Player> ��1 = new Player_team <Player>();
	static Player_team <Player> ��2 = new Player_team <Player>();
	static Player_team <Integer> �÷��̾� = new Player_team <Integer>();
	
	
	public static void main(String[] args) {

		Window_StartView frame1 = new Window_StartView();
		frame1.setVisible(true);
		
	}

}

//Setting.���������ϱ�();
//int round=1;
//while(true) {
//	if (��1.size()==0) {
//		System.out.println("�ڡ١ڡ١ڡ١ڡ١ڡ���2�� �¸��߽��ϴ�. ������ �����մϴ�.�ڡ١ڡ١ڡ١ڡ١ڡ�");
//		System.out.print("��Ƴ��� ��: ");
//    	for (int i=0; i<��2.size(); i++)
//    		System.out.print(��2.get(i).name+"   ");
//		System.exit(0);
//	}
//	
//	Player.show_header(round);
//	System.out.println("��1�� ���� ����!");
//	Setting.�����ڹ�Ÿ�ټ���(��1, ��2);
//	
//	if (��2.size()==0) {
//		System.out.println("�ڡ١ڡ١ڡ١ڡ١ڡ���1�� �¸��߽��ϴ�. ������ �����մϴ�.�ڡ١ڡ١ڡ١ڡ١ڡ�");
//		System.out.print("��Ƴ��� ��: ");
//    	for (int i=0; i<��1.size(); i++)
//    		System.out.print(��1.get(i).name+"   ");
//		System.exit(0);
//	}
//	
//	System.out.println("��2�� ���� ����!");
//	Setting.�����ڹ�Ÿ�ټ���(��2, ��1);
//
//	round++;
//	
//}
//
//
//