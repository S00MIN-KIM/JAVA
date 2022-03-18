package View;



import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Window_StartView extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					Window_StartView frame = new Window_StartView();
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
	public Window_StartView() {
		setTitle("\uC2DC\uC791 \uD654\uBA74");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1021, 635);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		JButton jButton1 = new JButton("\uD50C\uB808\uC774\uC5B4 \uC120\uD0DD");
		jButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Window_SelectPlayerView frame2 = new Window_SelectPlayerView();
				frame2.setVisible(true);
				
				dispose();
			}
		});
		jButton1.setFont(new Font("³ª´®½ºÄù¾î ExtraBold", Font.PLAIN, 22));
		jButton1.setBackground(Color.WHITE);
		jButton1.setBounds(408, 534, 165, 52);
		contentPane.add(jButton1);
		
		JLabel jNewLabel2 = new JLabel("Avengers Battle Program");
		jNewLabel2.setForeground(Color.BLACK);
		jNewLabel2.setBackground(Color.BLACK);
		jNewLabel2.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 40));
		jNewLabel2.setBounds(187, 459, 712, 98);
		contentPane.add(jNewLabel2);
		
		JLabel jLabel1 = new JLabel("");
		jLabel1.setIcon(new ImageIcon("C:\\Users\\soomi\\Pictures\\\uC5B4\uBCA4\uC838\uC2A4.png"));
		jLabel1.setBounds(99, -52, 800, 613);
		contentPane.add(jLabel1);
		
	}
}
