package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Player.*;
import Weapon.*;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class Window_playerView extends JFrame {

	private JPanel contentPane;
	JPanel panel = new JPanel();
	JPanel panel_1 = new JPanel();
	JLabel AÇÃ·¹ÀÌ¾îLabel = new JLabel("");
	JLabel BÇÃ·¹ÀÌ¾îLabel = new JLabel("");
	private final JLabel AHPLabel = new JLabel("\uD604\uC7AC Hp: ");
	private final JLabel APowerLabel = new JLabel("Power:");
	private final JLabel AwsLabel = new JLabel("\uBCF4\uC720 \uBB34\uAE30:");
	private final JLabel BHPLabel = new JLabel("\uD604\uC7AC hp:");
	private final JLabel BPowerLabel = new JLabel("Power:");
	private final JLabel BwsLabel = new JLabel("\uBCF4\uC720 \uBB34\uAE30:");
	private final JLabel AHPLabel_1 = new JLabel("0");
	private final JLabel APowerLabel_1 = new JLabel("0");
	private final JLabel AwsLabel_1 = new JLabel("\uC5C6\uC74C");
	private final JLabel BHPLabel_1 = new JLabel("0");
	private final JLabel BPowerLabel_1 = new JLabel("0");
	private final JLabel BwsLabel_1 = new JLabel("\uC5C6\uC74C");
	private final JLabel AwsLabel_1_1 = new JLabel("");
	private final JLabel BwsLabel_1_1 = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window_playerView frame = new Window_playerView();
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
	public Window_playerView() {
		setTitle("\uD300 \uC815\uBCF4");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 794, 467);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		panel.setBackground(new Color(255, 255, 255));
		

		panel.setBounds(29, 10, 341, 408);
		contentPane.add(panel);
		panel.setLayout(null);
		

		AÇÃ·¹ÀÌ¾îLabel.setBounds(94, 26, 160, 250);
		panel.add(AÇÃ·¹ÀÌ¾îLabel);
		AHPLabel.setFont(new Font("³ª´®½ºÄù¾î Light", Font.PLAIN, 13));
		AHPLabel.setBounds(29, 322, 57, 15);
		
		panel.add(AHPLabel);
		APowerLabel.setFont(new Font("³ª´®½ºÄù¾î Light", Font.PLAIN, 13));
		APowerLabel.setBounds(29, 347, 57, 15);
		
		panel.add(APowerLabel);
		AwsLabel.setFont(new Font("³ª´®½ºÄù¾î Light", Font.PLAIN, 13));
		AwsLabel.setBounds(29, 372, 57, 15);
		
		panel.add(AwsLabel);
		AHPLabel_1.setFont(new Font("³ª´®½ºÄù¾î", Font.PLAIN, 13));
		AHPLabel_1.setBounds(117, 321, 172, 15);
		
		panel.add(AHPLabel_1);
		APowerLabel_1.setFont(new Font("³ª´®½ºÄù¾î", Font.PLAIN, 13));
		APowerLabel_1.setBounds(117, 346, 172, 15);
		
		panel.add(APowerLabel_1);
		AwsLabel_1.setFont(new Font("³ª´®½ºÄù¾î", Font.PLAIN, 13));
		AwsLabel_1.setBounds(117, 371, 51, 15);
		
		panel.add(AwsLabel_1);
		panel.add(AwsLabel_1_1);
		panel_1.setBackground(new Color(255, 255, 255));
		

		
		panel_1.setBounds(408, 10, 341, 408);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		

		BÇÃ·¹ÀÌ¾îLabel.setBounds(99, 30, 160, 250);
		panel_1.add(BÇÃ·¹ÀÌ¾îLabel);
		BHPLabel.setFont(new Font("³ª´®½ºÄù¾î Light", Font.PLAIN, 13));
		BHPLabel.setBounds(48, 321, 57, 15);
		
		panel_1.add(BHPLabel);
		BPowerLabel.setFont(new Font("³ª´®½ºÄù¾î Light", Font.PLAIN, 13));
		BPowerLabel.setBounds(48, 346, 57, 15);
		
		panel_1.add(BPowerLabel);
		BwsLabel.setFont(new Font("³ª´®½ºÄù¾î Light", Font.PLAIN, 13));
		BwsLabel.setBounds(48, 371, 57, 15);
		
		panel_1.add(BwsLabel);
		BHPLabel_1.setFont(new Font("³ª´®½ºÄù¾î", Font.PLAIN, 13));
		BHPLabel_1.setBounds(137, 320, 160, 15);
		
		panel_1.add(BHPLabel_1);
		BPowerLabel_1.setFont(new Font("³ª´®½ºÄù¾î", Font.PLAIN, 13));
		BPowerLabel_1.setBounds(137, 345, 151, 15);
		
		panel_1.add(BPowerLabel_1);
		BwsLabel_1.setFont(new Font("³ª´®½ºÄù¾î", Font.PLAIN, 13));
		BwsLabel_1.setBounds(137, 371, 57, 15);
		
		panel_1.add(BwsLabel_1);
		BwsLabel_1_1.setFont(new Font("³ª´®½ºÄù¾î", Font.PLAIN, 13));
		BwsLabel_1_1.setBounds(195, 371, 74, 15);
		
		panel_1.add(BwsLabel_1_1);
		AwsLabel_1_1.setBounds(168, 371, 129, 15);
		AwsLabel_1_1.setFont(new Font("³ª´®½ºÄù¾î", Font.PLAIN, 13));
	}
	
	public Window_playerView(Player playerA, Player playerB, Icon iconA, Icon iconB) {
		this();
		AÇÃ·¹ÀÌ¾îLabel.setIcon(iconA);
		BÇÃ·¹ÀÌ¾îLabel.setIcon(iconB);
		
		int A_Hp = playerA.getHp();
		if (A_Hp<0)
			A_Hp=0;
		AHPLabel_1.setText(Integer.toString(A_Hp));
		APowerLabel_1.setText(Integer.toString(playerA.getPower()));

		try {
			AwsLabel_1.setText(playerA.getWs().get(0).name);
		}catch(ArrayIndexOutOfBoundsException e){}
		catch(Exception e) {}		    

		try {
			AwsLabel_1_1.setText(playerA.getWs().get(1).name);
		}catch(ArrayIndexOutOfBoundsException e){}
		catch(Exception e) {}		    
		

		int B_Hp = playerB.getHp();
		if (B_Hp<0)
			B_Hp=0;
		BHPLabel_1.setText(Integer.toString(B_Hp));
		BPowerLabel_1.setText(Integer.toString(playerB.getPower()));
		try {
			BwsLabel_1.setText(playerB.getWs().get(0).name);
		}catch(ArrayIndexOutOfBoundsException e){}
		catch(Exception e) {}		    

		try {
			BwsLabel_1_1.setText(playerB.getWs().get(1).name);
		}catch(ArrayIndexOutOfBoundsException e){}
		catch(Exception e) {}	



		
		
		
	}
}
