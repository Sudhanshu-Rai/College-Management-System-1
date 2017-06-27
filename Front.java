import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JPanel;

public class Front {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Front window = new Front();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Front() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCollegeManagementSystem = new JLabel("College management system");
		lblCollegeManagementSystem.setHorizontalAlignment(SwingConstants.CENTER);
		lblCollegeManagementSystem.setBounds(12, 0, 408, 16);
		frame.getContentPane().add(lblCollegeManagementSystem);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(22, 29, 384, 26);
		frame.getContentPane().add(menuBar);
		
		JMenu mnNewMenu = new JMenu("About us");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Login");
		menuBar.add(mnNewMenu_1);
		
		JMenu mnNewMenu_2 = new JMenu("Information Broucher");
		menuBar.add(mnNewMenu_2);
		
		JMenu mnNewMenu_3 = new JMenu("Contact us");
		menuBar.add(mnNewMenu_3);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 68, 408, 133);
		frame.getContentPane().add(panel);
	}
}
