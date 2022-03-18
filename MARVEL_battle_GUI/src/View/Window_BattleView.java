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
	JLabel �÷��̾�1hp = new JLabel("");
	JLabel �÷��̾�2hp = new JLabel("");
	JLabel �÷��̾�3hp = new JLabel("");
	JLabel �÷��̾�4hp = new JLabel("");
	JPanel panel1 = new JPanel();
	JLabel �÷��̾�1Label = new JLabel("");
	JLabel �÷��̾�2Label = new JLabel("");
	JProgressBar �÷��̾�1progressBar = new JProgressBar();
	JProgressBar �÷��̾�2progressBar = new JProgressBar();
	JPanel panel2 = new JPanel();
	JProgressBar �÷��̾�3progressBar = new JProgressBar();
	JProgressBar �÷��̾�4progressBar = new JProgressBar();
	JScrollPane scrollPane = new JScrollPane();
	static JTextArea textArea = new JTextArea();
	JLabel �÷��̾�3Label = new JLabel("");
	JLabel �÷��̾�4Label = new JLabel("");
	JButton ��1���º���Button = new JButton("\uD300 \uC0C1\uD0DC \uBCF4\uAE30");
	JButton ���Ϸ�����Button = new JButton("\uD30C\uC77C\uB85C \uC800\uC7A5");
	static JButton ��1�����ϱ�Button = new JButton("\uACF5\uACA9\uD558\uAE30");
	JButton ��2���º���Button = new JButton("\uD300 \uC0C1\uD0DC \uBCF4\uAE30");
	static JButton ��2�����ϱ�Button = new JButton("\uACF5\uACA9\uD558\uAE30");
	static Player_team <Player> �����÷��̾� = new Player_team <Player>();
	
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
		
		


		

		�÷��̾�1Label.setBounds(94, 26, 160, 250);
		panel1.add(�÷��̾�1Label);

		

		�÷��̾�2Label.setBounds(94, 336, 160, 250);
		panel1.add(�÷��̾�2Label);
		

		�÷��̾�1progressBar.setForeground(new Color(204, 0, 51));
		�÷��̾�1progressBar.setBounds(24, 286, 328, 29);
		panel1.add(�÷��̾�1progressBar);
		

		�÷��̾�2progressBar.setForeground(new Color(204, 0, 51));
		�÷��̾�2progressBar.setBounds(12, 596, 328, 29);
		panel1.add(�÷��̾�2progressBar);
		

		�÷��̾�1hp.setBounds(24, 300, 57, 15);
		panel1.add(�÷��̾�1hp);
		

		�÷��̾�2hp.setBounds(12, 610, 57, 15);
		panel1.add(�÷��̾�2hp);
		

		panel2.setBackground(new Color(153, 153, 255));

		panel2.setLayout(null);
		panel2.setBounds(703, 10, 381, 641);
		contentPane.add(panel2);
		

		�÷��̾�3Label.setBounds(94, 26, 160, 250);
		panel2.add(�÷��̾�3Label);
		

		�÷��̾�4Label.setBounds(94, 336, 160, 250);
		panel2.add(�÷��̾�4Label);
		

		�÷��̾�3progressBar.setForeground(new Color(204, 0, 51));
		�÷��̾�3progressBar.setBounds(24, 286, 328, 29);
		panel2.add(�÷��̾�3progressBar);
		

		�÷��̾�4progressBar.setForeground(new Color(204, 0, 51));
		�÷��̾�4progressBar.setBounds(12, 596, 328, 29);
		panel2.add(�÷��̾�4progressBar);
		

		�÷��̾�3hp.setBounds(24, 300, 57, 15);
		panel2.add(�÷��̾�3hp);
		�÷��̾�4hp.setBounds(12, 610, 57, 15);
		
		panel2.add(�÷��̾�4hp);
		
		

		��1���º���Button.setBounds(40, 661, 160, 32);
		contentPane.add(��1���º���Button);
		

		scrollPane.setBounds(405, 40, 287, 577);
		contentPane.add(scrollPane);
		

		scrollPane.setViewportView(textArea);
		

		���Ϸ�����Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saveToFile();
			}
		});
		
		���Ϸ�����Button.setBounds(474, 640, 151, 32);
		contentPane.add(���Ϸ�����Button);
		
		��1�����ϱ�Button.setBounds(212, 661, 160, 32);
		contentPane.add(��1�����ϱ�Button);

		��2���º���Button.setBounds(729, 661, 160, 32);
		contentPane.add(��2���º���Button);
		
		��2�����ϱ�Button.setBounds(904, 661, 160, 32);
		contentPane.add(��2�����ϱ�Button);
		
		
	}
	protected void saveToFile() {
		// TODO Auto-generated method stub
		PrintWriter pw = null;
		try {
			pw = new PrintWriter("d:\\EWHA\\����\\2�г�\\������\\Battle\\log.txt");
			pw.println(textArea.getText());
			pw.flush();
			pw.close();
			
		} catch(FileNotFoundException e) {
			System.out.println("���� ����");
			//e.printStackTrace();
		}
		
	}

	public Window_BattleView(Player player1, Player player2, Player player3, Player player4) {
		this();

		�����÷��̾�.add(player1);
		�����÷��̾�.add(player2);
		�����÷��̾�.add(player3);
		�����÷��̾�.add(player4);

		
		for (int i=0;i<�����÷��̾�.size();i++) {
			JLabel Label = null;
			if (i==0)
				Label=�÷��̾�1Label;
			else if (i==1)
				Label=�÷��̾�2Label;
			else if (i==2)
				Label=�÷��̾�3Label;
			else if (i==3)
				Label=�÷��̾�4Label;
			
			if ( �����÷��̾�.get(i) instanceof ���̾�� & �����÷��̾�.get(i).getHp()==1400 )
				Label.setIcon(new ImageIcon("D:\\EWHA\\\uAC15\uC758\\2\uD559\uB144\\\uAC1D\uC9C0\uD504\\\uAC1D\uC9C0\uD504 \uBC30\uD2C0 \uC0AC\uC9C4\\\uC544\uC774\uC5B8\uB9E8.png"));
			else if ( �����÷��̾�.get(i) instanceof ���̾�� & �����÷��̾�.get(i).getHp()==1200 ) {
				Label.setIcon(new ImageIcon("D:\\EWHA\\\uAC15\uC758\\2\uD559\uB144\\\uAC1D\uC9C0\uD504\\\uAC1D\uC9C0\uD504 \uBC30\uD2C0 \uC0AC\uC9C4\\\uC218\uD2B8\uC5C6\uB294 \uC544\uC774\uC5B8\uB9E8.png"));
				tts.setVoiceToMan();
				tts.speak("oops, Iron man is not wearing a suit.");
				textArea.append("���̾���� ��Ʈ�� ���� ���߾��!�Ф�\n\n");
			}	
			else if ( �����÷��̾�.get(i) instanceof �����̴��� & �����÷��̾�.get(i).getHp()==1400 )
				Label.setIcon(new ImageIcon("D:\\EWHA\\\uAC15\uC758\\2\uD559\uB144\\\uAC1D\uC9C0\uD504\\\uAC1D\uC9C0\uD504 \uBC30\uD2C0 \uC0AC\uC9C4\\\uC2A4\uD30C\uC774\uB354\uB9E8.png"));
			else if ( �����÷��̾�.get(i) instanceof �����̴��� & �����÷��̾�.get(i).getHp()==1200 ) {
				Label.setIcon(new ImageIcon("D:\\EWHA\\\uAC15\uC758\\2\uD559\uB144\\\uAC1D\uC9C0\uD504\\\uAC1D\uC9C0\uD504 \uBC30\uD2C0 \uC0AC\uC9C4\\\uC218\uD2B8\uC5C6\uB294 \uC2A4\uD30C\uC774\uB354\uB9E8.png"));
				tts.setVoiceToMan();
				tts.speak("oops, Spider man is not wearing a suit.");
				textArea.append("�����̴����� ��Ʈ�� ���� ���߾��!�Ф�\n\n");
			}
			else if ( �����÷��̾�.get(i) instanceof ��ũ)
				Label.setIcon(new ImageIcon("D:\\EWHA\\\uAC15\uC758\\2\uD559\uB144\\\uAC1D\uC9C0\uD504\\\uAC1D\uC9C0\uD504 \uBC30\uD2C0 \uC0AC\uC9C4\\\uD5D0\uD06C.png"));
			else if ( �����÷��̾�.get(i) instanceof �丣)
				Label.setIcon(new ImageIcon("D:\\EWHA\\\uAC15\uC758\\2\uD559\uB144\\\uAC1D\uC9C0\uD504\\\uAC1D\uC9C0\uD504 \uBC30\uD2C0 \uC0AC\uC9C4\\\uD1A0\uB974.png"));
			else if ( �����÷��̾�.get(i) instanceof ��������)
				Label.setIcon(new ImageIcon("D:\\EWHA\\\uAC15\uC758\\2\uD559\uB144\\\uAC1D\uC9C0\uD504\\\uAC1D\uC9C0\uD504 \uBC30\uD2C0 \uC0AC\uC9C4\\\uBE14\uB799\uC704\uB3C4\uC6B0.png"));
			
		}
		

		�÷��̾�1progressBar.setMaximum(player1.getHp());
		�÷��̾�1progressBar.setValue(player1.getHp());
		
		�÷��̾�2progressBar.setMaximum(player2.getHp());
		�÷��̾�2progressBar.setValue(player2.getHp());
		
		�÷��̾�3progressBar.setMaximum(player3.getHp());
		�÷��̾�3progressBar.setValue(player3.getHp());
		
		�÷��̾�4progressBar.setMaximum(player4.getHp());
		�÷��̾�4progressBar.setValue(player4.getHp());
		
		

		��1�����ϱ�Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				�����ڹ�Ÿ�ټ���(Setting.get��1(), Setting.get��2());
				
				�÷��̾�3progressBar.setValue(player3.getHp());
				�÷��̾�4progressBar.setValue(player4.getHp());
				
				
				
			}
		});
		
		��2�����ϱ�Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				�����ڹ�Ÿ�ټ���(Setting.get��2(), Setting.get��1());
				
				�÷��̾�1progressBar.setValue(player1.getHp());
				�÷��̾�2progressBar.setValue(player2.getHp());
			}
		});
		
		��1���º���Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Icon icon1 = �÷��̾�1Label.getIcon();
				Icon icon2 = �÷��̾�2Label.getIcon();
				Window_playerView frame4 = new Window_playerView(player1, player2, icon1, icon2);
				frame4.setVisible(true);
			}
		});
		
		��2���º���Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Icon icon3 = �÷��̾�3Label.getIcon();
				Icon icon4 = �÷��̾�4Label.getIcon();
				Window_playerView frame4 = new Window_playerView(player3, player4, icon3, icon4);
				frame4.setVisible(true);
			}
		});

		
	}
	public static void �����ڹ�Ÿ�ټ���(Player_team<Player> teamname1, Player_team<Player> teamname2) {
		 Random random1 = new Random();
		 Random random2 = new Random();
		 int ran1 = random1.nextInt(teamname1.size());
		 int ran2 = random1.nextInt(teamname2.size());
		 Player ������ = teamname1.get(ran1);
		 Player Ÿ�� = teamname2.get(ran2);
		 String ����= ������.attack(Ÿ��);
		 textArea.append(����+"\n");
//		 if (Ÿ�� instanceof ��������) {
//				tts.setVoiceToWoman();
//				tts.speak("ouch");
//		 }
//		 else {
//				tts.setVoiceToMan();
//				tts.speak("ouch");
//		 }
		 //�ʹ� �ò�������...
		 

		 
		 ����Ȯ��(Ÿ��, teamname2);
	 }
	 

	public static void ����Ȯ��(Player player, Player_team<Player> teamname) {
	   	if (player.getHp() <= 0) {
	   		teamname.remove(player);
	   		textArea.append("����"+player.name+"(��)�� �׾����ϴ�!!����\n\n");
			 if (player instanceof ��������) {
					tts.setVoiceToWoman();
					tts.speak("Black widow is dead.");
			 }
			 else {
					tts.setVoiceToMan();
					tts.speak(player.get�����̸�()+" is dead.");
			 }
	   	}
	   	else 
	   		textArea.append("����"+player.name+"�� hp: "+player.getHp()+"\n\n");
	    	
	   	if (Setting.get��1().size()==0) {
	   		textArea.append("\n�ڡ���2�� �¸��߽��ϴ�.\n �ڡٰ����� �����մϴ�.\n\n");
			tts.setVoiceToWoman();
			tts.speak("congrats, Team two is the winner. The battle is over.");
	   		
	   		textArea.append("��Ƴ��� ��: ");
		   	for (int i=0; i<Setting.get��2().size(); i++)
		   		textArea.append(Setting.get��2().get(i).name+"   ");
			��1�����ϱ�Button.setEnabled(false);
			��2�����ϱ�Button.setEnabled(false);
		}
	   	if (Setting.get��2().size()==0) {
	   		textArea.append("\n�ڡ���1�� �¸��߽��ϴ�.\n �ڡٰ����� �����մϴ�.\n\n");
			tts.setVoiceToWoman();
			tts.speak("congrats, Team one is the winner. The battle is over.");
	   		textArea.append("��Ƴ��� ��: ");
	    	for (int i=0; i<Setting.get��1().size(); i++)
	    		textArea.append(Setting.get��1().get(i).name+"   ");
			��1�����ϱ�Button.setEnabled(false);
			��2�����ϱ�Button.setEnabled(false);
		}
			
	    	
    }
	

}
