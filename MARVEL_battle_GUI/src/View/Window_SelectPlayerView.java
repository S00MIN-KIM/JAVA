package View;



import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Player.Player;
import Player.��������;
import Player.�����̴���;
import Player.���̾��;
import Player.�丣;
import Player.��ũ;
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
	

	JLabel ����Label = new JLabel("\uCC98\uC74C\uC5D0 \uC120\uD0DD\uD55C 2\uBA85\uC774 \uD3001\uC744, \uB098\uC911\uC5D0 \uC120\uD0DD\uD55C 2\uBA85\uC774 \uD3002\uB97C \uC774\uB8E8\uAC8C \uB429\uB2C8\uB2E4.");
	JLabel ����Label = new JLabel("");
	JScrollPane scrollPane = new JScrollPane();
	JTextArea textArea = new JTextArea();
	JButton ���̾��Button = new JButton("\uC544\uC774\uC5B8\uB9E8");
	JButton ��ũButton = new JButton("\uD5D0\uD06C");
	JButton ��������Button = new JButton("\uBE14\uB799\uC704\uB3C4\uC6B0");
	JButton �丣Button = new JButton("\uD1A0\uB974");
	JButton �����̴���Button = new JButton("\uC2A4\uD30C\uC774\uB354\uB9E8");
	JButton ��Ʋ����Button = new JButton("\uBC30\uD2C0 \uC2DC\uC791");
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
		

		

		����Label.setForeground(Color.BLACK);
		����Label.setFont(new Font("���������� Bold", Font.PLAIN, 21));
		����Label.setBackground(Color.WHITE);
		����Label.setBounds(12, 25, 648, 64);
		contentPane.add(����Label);
		

		����Label.setIcon(new ImageIcon("D:\\EWHA\\\uAC15\uC758\\2\uD559\uB144\\\uAC1D\uC9C0\uD504\\\uAC1D\uC9C0\uD504 \uBC30\uD2C0 \uC0AC\uC9C4\\\uAC1D\uC9C0\uD504.png"));
		����Label.setBounds(0, 177, 1079, 631);
		contentPane.add(����Label);
		

		scrollPane.setBounds(663, 25, 302, 107);
		contentPane.add(scrollPane);
		

		scrollPane.setViewportView(textArea);
		

		���̾��Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num=Setting.���������ϱ�(1);
				tts.setVoiceToMan();
				tts.speak("Iron man ");
				���̾��Button.setEnabled(false);
				textArea.append("���̾�� ����\n");
				if (num==1) {
					���ÿϷ�();
				}
			}



		});
		���̾��Button.setBackground(new Color(204, 0, 0));
		���̾��Button.setFont(new Font("����������", Font.PLAIN, 20));
		���̾��Button.setBounds(33, 142, 118, 38);
		contentPane.add(���̾��Button);
		

		��ũButton.setBackground(new Color(0, 153, 0));
		��ũButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num=Setting.���������ϱ�(3);
				tts.setVoiceToMan();
				tts.speak("Hulk");
				��ũButton.setEnabled(false);
				textArea.append("��ũ ����\n");
				if (num==1) {
					���ÿϷ�();
				}
			}
		});
		��ũButton.setBounds(230, 143, 118, 38);
		��ũButton.setFont(new Font("����������", Font.PLAIN, 20));
		contentPane.add(��ũButton);
		

		��������Button.setForeground(Color.WHITE);
		��������Button.setBackground(new Color(0, 0, 0));
		��������Button.setFont(new Font("����������", Font.PLAIN, 20));
		��������Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num=Setting.���������ϱ�(5);
				tts.setVoiceToWoman();
				tts.speak("Black Widow");
				��������Button.setEnabled(false);
				textArea.append("�������� ����\n");
				if (num==1) {
					���ÿϷ�();
				}
			}
		});
		��������Button.setBounds(425, 142, 142, 38);
		contentPane.add(��������Button);
		�丣Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num=Setting.���������ϱ�(4);
				tts.setVoiceToMan();
				tts.speak("Thor");
				�丣Button.setEnabled(false);
				textArea.append("�丣 ����\n");
				if (num==1) {
					���ÿϷ�();
				}
			}
		});
		

		�丣Button.setBackground(Color.YELLOW);
		�丣Button.setFont(new Font("����������", Font.PLAIN, 20));
		�丣Button.setBounds(635, 142, 118, 38);
		contentPane.add(�丣Button);
		�����̴���Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num=Setting.���������ϱ�(2);
				tts.setVoiceToMan();
				tts.speak("Spider Man");
				�����̴���Button.setEnabled(false);
				textArea.append("�����̴��� ����\n");
				if (num==1) {
					���ÿϷ�();
				}
			}
		});
		

		�����̴���Button.setBackground(new Color(204, 0, 51));
		�����̴���Button.setFont(new Font("����������", Font.PLAIN, 20));
		�����̴���Button.setBounds(825, 142, 147, 38);
		contentPane.add(�����̴���Button);
		��Ʋ����Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tts.setVoiceToWoman();
				tts.speak("Battle Start");
				Player player1, player2, player3, player4;
				player1=Setting.get��1().get(0);
				player2=Setting.get��1().get(1);
				player3=Setting.get��2().get(0);
				player4=Setting.get��2().get(1);
				Window_BattleView frame3 = new Window_BattleView(player1, player2, player3, player4);
				frame3.setVisible(true);
				
				dispose();
			}
		});
		

		��Ʋ����Button.setFont(new Font("���������� ExtraBold", Font.PLAIN, 25));
		��Ʋ����Button.setBounds(230, 81, 178, 41);
		contentPane.add(��Ʋ����Button);
		��Ʋ����Button.setVisible(false);
	}
	private void ���ÿϷ�() {
		tts.setVoiceToMan();
		tts.speak("Player selection is complete.");
		textArea.append("-------------------------�� ��ġ �Ϸ�!-------------------------\n");
		textArea.append("��1: ");
    	for (int i=0; i<Setting.get��1().size(); i++) {
    		textArea.append(Setting.get��1().get(i).name);
			textArea.append("  ");
    	}
    	textArea.append("\n");
		textArea.append("��2: ");
    	for (int i=0; i<Setting.get��2().size(); i++) {
    		textArea.append(Setting.get��2().get(i).name);
			textArea.append("  ");
    	}
    	textArea.append("\n\n");
    	textArea.append(">>��Ʋ���� ��ư�� ��������<<");
    	��Ʋ����Button.setVisible(true);
		��Ʋ����Button.setEnabled(true);
		�丣Button.setEnabled(false);
		�����̴���Button.setEnabled(false);
		��������Button.setEnabled(false);
		��ũButton.setEnabled(false);
		���̾��Button.setEnabled(false);
		
	}
}
