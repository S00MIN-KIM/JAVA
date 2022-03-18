import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import Player.*;
import Setting.Player_team;
import View.Window_StartView;

public class Main {
	static Scanner input= new Scanner(System.in);
	static Player_team <Player> ÆÀ1 = new Player_team <Player>();
	static Player_team <Player> ÆÀ2 = new Player_team <Player>();
	static Player_team <Integer> ÇÃ·¹ÀÌ¾î = new Player_team <Integer>();
	
	
	public static void main(String[] args) {

		Window_StartView frame1 = new Window_StartView();
		frame1.setVisible(true);
		
	}

}

//Setting.ÆÀ¿ø°áÁ¤ÇÏ±â();
//int round=1;
//while(true) {
//	if (ÆÀ1.size()==0) {
//		System.out.println("¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡ÙÆÀ2°¡ ½Â¸®Çß½À´Ï´Ù. °ÔÀÓÀ» Á¾·áÇÕ´Ï´Ù.¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù");
//		System.out.print("»ì¾Æ³²Àº ÀÚ: ");
//    	for (int i=0; i<ÆÀ2.size(); i++)
//    		System.out.print(ÆÀ2.get(i).name+"   ");
//		System.exit(0);
//	}
//	
//	Player.show_header(round);
//	System.out.println("ÆÀ1ÀÇ °ø°Ý Â÷·Ê!");
//	Setting.°ø°ÝÀÚ¹×Å¸°Ù¼±Á¤(ÆÀ1, ÆÀ2);
//	
//	if (ÆÀ2.size()==0) {
//		System.out.println("¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡ÙÆÀ1ÀÌ ½Â¸®Çß½À´Ï´Ù. °ÔÀÓÀ» Á¾·áÇÕ´Ï´Ù.¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù");
//		System.out.print("»ì¾Æ³²Àº ÀÚ: ");
//    	for (int i=0; i<ÆÀ1.size(); i++)
//    		System.out.print(ÆÀ1.get(i).name+"   ");
//		System.exit(0);
//	}
//	
//	System.out.println("ÆÀ2ÀÇ °ø°Ý Â÷·Ê!");
//	Setting.°ø°ÝÀÚ¹×Å¸°Ù¼±Á¤(ÆÀ2, ÆÀ1);
//
//	round++;
//	
//}
//
//
//