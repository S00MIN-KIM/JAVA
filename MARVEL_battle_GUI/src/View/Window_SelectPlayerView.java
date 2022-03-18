package View;



import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Player.Player;
import Player.블랙위도우;
import Player.스파이더맨;
import Player.아이언맨;
import Player.토르;
import Player.헐크;
import Setting.Setting;
import mary.Mary;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class Window_SelectPlayerView extends JFrame {

	private JPanel contentPane;
	

	JLabel 설명Label = new JLabel("\uCC98\uC74C\uC5D0 \uC120\uD0DD\uD55C 2\uBA85\uC774 \uD3001\uC744, \uB098\uC911\uC5D0 \uC120\uD0DD\uD55C 2\uBA85\uC774 \uD3002\uB97C \uC774\uB8E8\uAC8C \uB429\uB2C8\uB2E4.");
	JLabel 사진Label = new JLabel("");
	JScrollPane scrollPane = new JScrollPane();
	JTextArea textArea = new JTextArea();
	JButton 아이언맨Button = new JButton("\uC544\uC774\uC5B8\uB9E8");
	JButton 헐크Button = new JButton("\uD5D0\uD06C");
	JButton 블랙위도우Button = new JButton("\uBE14\uB799\uC704\uB3C4\uC6B0");
	JButton 토르Button = new JButton("\uD1A0\uB974");
	JButton 스파이더맨Button = new JButton("\uC2A4\uD30C\uC774\uB354\uB9E8");
	JButton 배틀시작Button = new JButton("\uBC30\uD2C0 \uC2DC\uC791");
	int num;

	static Mary tts = new Mary();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window_SelectPlayerView frame = new Window_SelectPlayerView();
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
	public Window_SelectPlayerView() {
		setTitle("\uD50C\uB808\uC774\uC5B4 \uC120\uD0DD");
		tts.setVoiceToMan();
		tts.speak("select four players.");
		
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		contentPane = new JPanel();
		setBounds(100, 100, 1022, 790);
				contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		

		설명Label.setForeground(Color.BLACK);
		설명Label.setFont(new Font("나눔스퀘어 Bold", Font.PLAIN, 21));
		설명Label.setBackground(Color.WHITE);
		설명Label.setBounds(12, 25, 648, 64);
		contentPane.add(설명Label);
		

		사진Label.setIcon(new ImageIcon("D:\\EWHA\\\uAC15\uC758\\2\uD559\uB144\\\uAC1D\uC9C0\uD504\\\uAC1D\uC9C0\uD504 \uBC30\uD2C0 \uC0AC\uC9C4\\\uAC1D\uC9C0\uD504.png"));
		사진Label.setBounds(0, 177, 1079, 631);
		contentPane.add(사진Label);
		

		scrollPane.setBounds(663, 25, 302, 107);
		contentPane.add(scrollPane);
		

		scrollPane.setViewportView(textArea);
		

		아이언맨Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num=Setting.팀원결정하기(1);
				tts.setVoiceToMan();
				tts.speak("Iron man ");
				아이언맨Button.setEnabled(false);
				textArea.append("아이언맨 선택\n");
				if (num==1) {
					선택완료();
				}
			}



		});
		아이언맨Button.setBackground(new Color(204, 0, 0));
		아이언맨Button.setFont(new Font("나눔스퀘어", Font.PLAIN, 20));
		아이언맨Button.setBounds(33, 142, 118, 38);
		contentPane.add(아이언맨Button);
		

		헐크Button.setBackground(new Color(0, 153, 0));
		헐크Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num=Setting.팀원결정하기(3);
				tts.setVoiceToMan();
				tts.speak("Hulk");
				헐크Button.setEnabled(false);
				textArea.append("헐크 선택\n");
				if (num==1) {
					선택완료();
				}
			}
		});
		헐크Button.setBounds(230, 143, 118, 38);
		헐크Button.setFont(new Font("나눔스퀘어", Font.PLAIN, 20));
		contentPane.add(헐크Button);
		

		블랙위도우Button.setForeground(Color.WHITE);
		블랙위도우Button.setBackground(new Color(0, 0, 0));
		블랙위도우Button.setFont(new Font("나눔스퀘어", Font.PLAIN, 20));
		블랙위도우Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num=Setting.팀원결정하기(5);
				tts.setVoiceToWoman();
				tts.speak("Black Widow");
				블랙위도우Button.setEnabled(false);
				textArea.append("블랙위도우 선택\n");
				if (num==1) {
					선택완료();
				}
			}
		});
		블랙위도우Button.setBounds(425, 142, 142, 38);
		contentPane.add(블랙위도우Button);
		토르Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num=Setting.팀원결정하기(4);
				tts.setVoiceToMan();
				tts.speak("Thor");
				토르Button.setEnabled(false);
				textArea.append("토르 선택\n");
				if (num==1) {
					선택완료();
				}
			}
		});
		

		토르Button.setBackground(Color.YELLOW);
		토르Button.setFont(new Font("나눔스퀘어", Font.PLAIN, 20));
		토르Button.setBounds(635, 142, 118, 38);
		contentPane.add(토르Button);
		스파이더맨Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num=Setting.팀원결정하기(2);
				tts.setVoiceToMan();
				tts.speak("Spider Man");
				스파이더맨Button.setEnabled(false);
				textArea.append("스파이더맨 선택\n");
				if (num==1) {
					선택완료();
				}
			}
		});
		

		스파이더맨Button.setBackground(new Color(204, 0, 51));
		스파이더맨Button.setFont(new Font("나눔스퀘어", Font.PLAIN, 20));
		스파이더맨Button.setBounds(825, 142, 147, 38);
		contentPane.add(스파이더맨Button);
		배틀시작Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tts.setVoiceToWoman();
				tts.speak("Battle Start");
				Player player1, player2, player3, player4;
				player1=Setting.get팀1().get(0);
				player2=Setting.get팀1().get(1);
				player3=Setting.get팀2().get(0);
				player4=Setting.get팀2().get(1);
				Window_BattleView frame3 = new Window_BattleView(player1, player2, player3, player4);
				frame3.setVisible(true);
				
				dispose();
			}
		});
		

		배틀시작Button.setFont(new Font("나눔스퀘어 ExtraBold", Font.PLAIN, 25));
		배틀시작Button.setBounds(230, 81, 178, 41);
		contentPane.add(배틀시작Button);
		배틀시작Button.setVisible(false);
	}
	private void 선택완료() {
		tts.setVoiceToMan();
		tts.speak("Player selection is complete.");
		textArea.append("-------------------------팀 배치 완료!-------------------------\n");
		textArea.append("팀1: ");
    	for (int i=0; i<Setting.get팀1().size(); i++) {
    		textArea.append(Setting.get팀1().get(i).name);
			textArea.append("  ");
    	}
    	textArea.append("\n");
		textArea.append("팀2: ");
    	for (int i=0; i<Setting.get팀2().size(); i++) {
    		textArea.append(Setting.get팀2().get(i).name);
			textArea.append("  ");
    	}
    	textArea.append("\n\n");
    	textArea.append(">>배틀시작 버튼을 누르세요<<");
    	배틀시작Button.setVisible(true);
		배틀시작Button.setEnabled(true);
		토르Button.setEnabled(false);
		스파이더맨Button.setEnabled(false);
		블랙위도우Button.setEnabled(false);
		헐크Button.setEnabled(false);
		아이언맨Button.setEnabled(false);
		
	}
}
