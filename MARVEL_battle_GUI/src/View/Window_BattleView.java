package View;



import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Player.*;
import Setting.Player_team;
import Setting.Setting;
import mary.Mary;

import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.awt.event.ActionEvent;

public class Window_BattleView extends JFrame {

	private JPanel contentPane;
	JLabel 플레이어1hp = new JLabel("");
	JLabel 플레이어2hp = new JLabel("");
	JLabel 플레이어3hp = new JLabel("");
	JLabel 플레이어4hp = new JLabel("");
	JPanel panel1 = new JPanel();
	JLabel 플레이어1Label = new JLabel("");
	JLabel 플레이어2Label = new JLabel("");
	JProgressBar 플레이어1progressBar = new JProgressBar();
	JProgressBar 플레이어2progressBar = new JProgressBar();
	JPanel panel2 = new JPanel();
	JProgressBar 플레이어3progressBar = new JProgressBar();
	JProgressBar 플레이어4progressBar = new JProgressBar();
	JScrollPane scrollPane = new JScrollPane();
	static JTextArea textArea = new JTextArea();
	JLabel 플레이어3Label = new JLabel("");
	JLabel 플레이어4Label = new JLabel("");
	JButton 팀1상태보기Button = new JButton("\uD300 \uC0C1\uD0DC \uBCF4\uAE30");
	JButton 파일로저장Button = new JButton("\uD30C\uC77C\uB85C \uC800\uC7A5");
	static JButton 팀1공격하기Button = new JButton("\uACF5\uACA9\uD558\uAE30");
	JButton 팀2상태보기Button = new JButton("\uD300 \uC0C1\uD0DC \uBCF4\uAE30");
	static JButton 팀2공격하기Button = new JButton("\uACF5\uACA9\uD558\uAE30");
	static Player_team <Player> 게임플레이어 = new Player_team <Player>();
	
	static Mary tts = new Mary();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window_BattleView frame = new Window_BattleView(null, null, null, null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Window_BattleView() {
		setTitle("\uBC30\uD2C0 \uD654\uBA74");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1112, 742);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		panel1.setBackground(new Color(255, 153, 153));
		panel1.setBounds(12, 10, 381, 641);
		contentPane.add(panel1);
		panel1.setLayout(null);
		
		


		

		플레이어1Label.setBounds(94, 26, 160, 250);
		panel1.add(플레이어1Label);

		

		플레이어2Label.setBounds(94, 336, 160, 250);
		panel1.add(플레이어2Label);
		

		플레이어1progressBar.setForeground(new Color(204, 0, 51));
		플레이어1progressBar.setBounds(24, 286, 328, 29);
		panel1.add(플레이어1progressBar);
		

		플레이어2progressBar.setForeground(new Color(204, 0, 51));
		플레이어2progressBar.setBounds(12, 596, 328, 29);
		panel1.add(플레이어2progressBar);
		

		플레이어1hp.setBounds(24, 300, 57, 15);
		panel1.add(플레이어1hp);
		

		플레이어2hp.setBounds(12, 610, 57, 15);
		panel1.add(플레이어2hp);
		

		panel2.setBackground(new Color(153, 153, 255));

		panel2.setLayout(null);
		panel2.setBounds(703, 10, 381, 641);
		contentPane.add(panel2);
		

		플레이어3Label.setBounds(94, 26, 160, 250);
		panel2.add(플레이어3Label);
		

		플레이어4Label.setBounds(94, 336, 160, 250);
		panel2.add(플레이어4Label);
		

		플레이어3progressBar.setForeground(new Color(204, 0, 51));
		플레이어3progressBar.setBounds(24, 286, 328, 29);
		panel2.add(플레이어3progressBar);
		

		플레이어4progressBar.setForeground(new Color(204, 0, 51));
		플레이어4progressBar.setBounds(12, 596, 328, 29);
		panel2.add(플레이어4progressBar);
		

		플레이어3hp.setBounds(24, 300, 57, 15);
		panel2.add(플레이어3hp);
		플레이어4hp.setBounds(12, 610, 57, 15);
		
		panel2.add(플레이어4hp);
		
		

		팀1상태보기Button.setBounds(40, 661, 160, 32);
		contentPane.add(팀1상태보기Button);
		

		scrollPane.setBounds(405, 40, 287, 577);
		contentPane.add(scrollPane);
		

		scrollPane.setViewportView(textArea);
		

		파일로저장Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saveToFile();
			}
		});
		
		파일로저장Button.setBounds(474, 640, 151, 32);
		contentPane.add(파일로저장Button);
		
		팀1공격하기Button.setBounds(212, 661, 160, 32);
		contentPane.add(팀1공격하기Button);

		팀2상태보기Button.setBounds(729, 661, 160, 32);
		contentPane.add(팀2상태보기Button);
		
		팀2공격하기Button.setBounds(904, 661, 160, 32);
		contentPane.add(팀2공격하기Button);
		
		
	}
	protected void saveToFile() {
		// TODO Auto-generated method stub
		PrintWriter pw = null;
		try {
			pw = new PrintWriter("d:\\EWHA\\강의\\2학년\\객지프\\Battle\\log.txt");
			pw.println(textArea.getText());
			pw.flush();
			pw.close();
			
		} catch(FileNotFoundException e) {
			System.out.println("쓰기 실패");
			//e.printStackTrace();
		}
		
	}

	public Window_BattleView(Player player1, Player player2, Player player3, Player player4) {
		this();

		게임플레이어.add(player1);
		게임플레이어.add(player2);
		게임플레이어.add(player3);
		게임플레이어.add(player4);

		
		for (int i=0;i<게임플레이어.size();i++) {
			JLabel Label = null;
			if (i==0)
				Label=플레이어1Label;
			else if (i==1)
				Label=플레이어2Label;
			else if (i==2)
				Label=플레이어3Label;
			else if (i==3)
				Label=플레이어4Label;
			
			if ( 게임플레이어.get(i) instanceof 아이언맨 & 게임플레이어.get(i).getHp()==1400 )
				Label.setIcon(new ImageIcon("D:\\EWHA\\\uAC15\uC758\\2\uD559\uB144\\\uAC1D\uC9C0\uD504\\\uAC1D\uC9C0\uD504 \uBC30\uD2C0 \uC0AC\uC9C4\\\uC544\uC774\uC5B8\uB9E8.png"));
			else if ( 게임플레이어.get(i) instanceof 아이언맨 & 게임플레이어.get(i).getHp()==1200 ) {
				Label.setIcon(new ImageIcon("D:\\EWHA\\\uAC15\uC758\\2\uD559\uB144\\\uAC1D\uC9C0\uD504\\\uAC1D\uC9C0\uD504 \uBC30\uD2C0 \uC0AC\uC9C4\\\uC218\uD2B8\uC5C6\uB294 \uC544\uC774\uC5B8\uB9E8.png"));
				tts.setVoiceToMan();
				tts.speak("oops, Iron man is not wearing a suit.");
				textArea.append("아이언맨이 수트를 입지 못했어요!ㅠㅠ\n\n");
			}	
			else if ( 게임플레이어.get(i) instanceof 스파이더맨 & 게임플레이어.get(i).getHp()==1400 )
				Label.setIcon(new ImageIcon("D:\\EWHA\\\uAC15\uC758\\2\uD559\uB144\\\uAC1D\uC9C0\uD504\\\uAC1D\uC9C0\uD504 \uBC30\uD2C0 \uC0AC\uC9C4\\\uC2A4\uD30C\uC774\uB354\uB9E8.png"));
			else if ( 게임플레이어.get(i) instanceof 스파이더맨 & 게임플레이어.get(i).getHp()==1200 ) {
				Label.setIcon(new ImageIcon("D:\\EWHA\\\uAC15\uC758\\2\uD559\uB144\\\uAC1D\uC9C0\uD504\\\uAC1D\uC9C0\uD504 \uBC30\uD2C0 \uC0AC\uC9C4\\\uC218\uD2B8\uC5C6\uB294 \uC2A4\uD30C\uC774\uB354\uB9E8.png"));
				tts.setVoiceToMan();
				tts.speak("oops, Spider man is not wearing a suit.");
				textArea.append("스파이더맨이 수트를 입지 못했어요!ㅠㅠ\n\n");
			}
			else if ( 게임플레이어.get(i) instanceof 헐크)
				Label.setIcon(new ImageIcon("D:\\EWHA\\\uAC15\uC758\\2\uD559\uB144\\\uAC1D\uC9C0\uD504\\\uAC1D\uC9C0\uD504 \uBC30\uD2C0 \uC0AC\uC9C4\\\uD5D0\uD06C.png"));
			else if ( 게임플레이어.get(i) instanceof 토르)
				Label.setIcon(new ImageIcon("D:\\EWHA\\\uAC15\uC758\\2\uD559\uB144\\\uAC1D\uC9C0\uD504\\\uAC1D\uC9C0\uD504 \uBC30\uD2C0 \uC0AC\uC9C4\\\uD1A0\uB974.png"));
			else if ( 게임플레이어.get(i) instanceof 블랙위도우)
				Label.setIcon(new ImageIcon("D:\\EWHA\\\uAC15\uC758\\2\uD559\uB144\\\uAC1D\uC9C0\uD504\\\uAC1D\uC9C0\uD504 \uBC30\uD2C0 \uC0AC\uC9C4\\\uBE14\uB799\uC704\uB3C4\uC6B0.png"));
			
		}
		

		플레이어1progressBar.setMaximum(player1.getHp());
		플레이어1progressBar.setValue(player1.getHp());
		
		플레이어2progressBar.setMaximum(player2.getHp());
		플레이어2progressBar.setValue(player2.getHp());
		
		플레이어3progressBar.setMaximum(player3.getHp());
		플레이어3progressBar.setValue(player3.getHp());
		
		플레이어4progressBar.setMaximum(player4.getHp());
		플레이어4progressBar.setValue(player4.getHp());
		
		

		팀1공격하기Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				공격자및타겟선정(Setting.get팀1(), Setting.get팀2());
				
				플레이어3progressBar.setValue(player3.getHp());
				플레이어4progressBar.setValue(player4.getHp());
				
				
				
			}
		});
		
		팀2공격하기Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				공격자및타겟선정(Setting.get팀2(), Setting.get팀1());
				
				플레이어1progressBar.setValue(player1.getHp());
				플레이어2progressBar.setValue(player2.getHp());
			}
		});
		
		팀1상태보기Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Icon icon1 = 플레이어1Label.getIcon();
				Icon icon2 = 플레이어2Label.getIcon();
				Window_playerView frame4 = new Window_playerView(player1, player2, icon1, icon2);
				frame4.setVisible(true);
			}
		});
		
		팀2상태보기Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Icon icon3 = 플레이어3Label.getIcon();
				Icon icon4 = 플레이어4Label.getIcon();
				Window_playerView frame4 = new Window_playerView(player3, player4, icon3, icon4);
				frame4.setVisible(true);
			}
		});

		
	}
	public static void 공격자및타겟선정(Player_team<Player> teamname1, Player_team<Player> teamname2) {
		 Random random1 = new Random();
		 Random random2 = new Random();
		 int ran1 = random1.nextInt(teamname1.size());
		 int ran2 = random1.nextInt(teamname2.size());
		 Player 공격자 = teamname1.get(ran1);
		 Player 타겟 = teamname2.get(ran2);
		 String 문구= 공격자.attack(타겟);
		 textArea.append(문구+"\n");
//		 if (타겟 instanceof 블랙위도우) {
//				tts.setVoiceToWoman();
//				tts.speak("ouch");
//		 }
//		 else {
//				tts.setVoiceToMan();
//				tts.speak("ouch");
//		 }
		 //너무 시끄러워서...
		 

		 
		 생사확인(타겟, teamname2);
	 }
	 

	public static void 생사확인(Player player, Player_team<Player> teamname) {
	   	if (player.getHp() <= 0) {
	   		teamname.remove(player);
	   		textArea.append("▶▷"+player.name+"(이)가 죽었습니다!!◁◀\n\n");
			 if (player instanceof 블랙위도우) {
					tts.setVoiceToWoman();
					tts.speak("Black widow is dead.");
			 }
			 else {
					tts.setVoiceToMan();
					tts.speak(player.get영어이름()+" is dead.");
			 }
	   	}
	   	else 
	   		textArea.append("▶▷"+player.name+"의 hp: "+player.getHp()+"\n\n");
	    	
	   	if (Setting.get팀1().size()==0) {
	   		textArea.append("\n★☆팀2가 승리했습니다.\n ★☆게임을 종료합니다.\n\n");
			tts.setVoiceToWoman();
			tts.speak("congrats, Team two is the winner. The battle is over.");
	   		
	   		textArea.append("살아남은 자: ");
		   	for (int i=0; i<Setting.get팀2().size(); i++)
		   		textArea.append(Setting.get팀2().get(i).name+"   ");
			팀1공격하기Button.setEnabled(false);
			팀2공격하기Button.setEnabled(false);
		}
	   	if (Setting.get팀2().size()==0) {
	   		textArea.append("\n★☆팀1이 승리했습니다.\n ★☆게임을 종료합니다.\n\n");
			tts.setVoiceToWoman();
			tts.speak("congrats, Team one is the winner. The battle is over.");
	   		textArea.append("살아남은 자: ");
	    	for (int i=0; i<Setting.get팀1().size(); i++)
	    		textArea.append(Setting.get팀1().get(i).name+"   ");
			팀1공격하기Button.setEnabled(false);
			팀2공격하기Button.setEnabled(false);
		}
			
	    	
    }
	

}
