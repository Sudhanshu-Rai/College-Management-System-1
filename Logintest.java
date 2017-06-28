import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Logintest{

	JPanel home,about,login,information,contact,footer;
	
	
	
	public static void main(String[] args) {
		
		
		new Logintest();

	}

	Logintest()
	{
		
		//To get screen size start
				Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
				screenSize.getHeight();
				screenSize.getWidth();
				int screenHeight = screenSize.height;
				screenHeight=screenHeight-50;
				int screenWidth = screenSize.width;
		//To get screen size end
				
		JFrame f=new JFrame("College Management System");
		JLabel lblHeading=new JLabel("College Management System");
		lblHeading.setFont(new Font("ARIAL", Font.BOLD,40));
		lblHeading.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeading.setBounds(0, 10, screenWidth, 70);
		f.add(lblHeading);
		
		//Buttons Design start
		
		int btnWidth=(screenWidth-120)/4;
		
		JButton b1=new JButton("About Us");
		b1.setFont(new Font("ARIAL", Font.BOLD, 20));
		b1.setBounds(50, 80, btnWidth, 40);
		
		JButton b2=new JButton("Login");
		b2.setFont(new Font("ARIAL", Font.BOLD, 20));
		b2.setBounds(50+btnWidth, 80, btnWidth, 40);
		
		JButton b3=new JButton("Information Broucher");
		b3.setFont(new Font("ARIAL", Font.BOLD, 20));
		b3.setBounds(50+2*btnWidth, 80, btnWidth, 40);
		
		JButton b4=new JButton("Contact us");
		b4.setFont(new Font("ARIAL", Font.BOLD, 20));
		b4.setBounds(50+3*btnWidth, 80, btnWidth, 40);
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		//Buttons Design end
		
		//Home panel design Start
		home=new JPanel();
		home.setBounds(50, 130, screenWidth-120, screenHeight-300);
		home.setBackground(Color.BLUE);
		JLabel lblhome=new JLabel("Home content here");
		
		
		lblhome.setBounds(50, -50, 400, 250);
		home.add(lblhome);
		home.setLayout(null);
		//Home panel design end
		
		//About panel design start
		about=new JPanel();
		about.setBounds(50, 130, screenWidth-120, screenHeight-300);
		about.setVisible(false);
		about.setBackground(Color.cyan);
		JLabel lblabout=new JLabel("About us will be here");
		lblabout.setBounds(50, -50, 400, 250);
		about.add(lblabout);
		about.setLayout(null);
		//About panel design end
		
		
		//Login panel design start
		login=new JPanel();
		login.setBounds(50, 130, screenWidth-120, screenHeight-300);
		login.setVisible(false);
		login.setBackground(Color.DARK_GRAY);
		JLabel userName=new JLabel("Username");
		userName.setBounds(50, 100, 50, 20);
		JLabel password=new JLabel("Password");
		password.setBounds(50, 140, 50, 20);
		JTextField tbUserName=new JTextField();
		tbUserName.setBounds(100, 100, 50, 20);
		JPasswordField tbpassword=new JPasswordField();
		tbpassword.setBounds(100, 140, 50, 20);
		login.add(userName);
		login.add(tbUserName);
		login.add(password);
		login.add(tbpassword);
		login.setLayout(null);
		//Login panel design end
		
		//Information panel design start
				information=new JPanel();
				information.setBounds(50, 130, screenWidth-120, screenHeight-300);
				information.setVisible(false);
				information.setBackground(Color.MAGENTA);
				JLabel lblinfo=new JLabel("Info us will be here");
				lblinfo.setBounds(50, -50, 400, 250);
				information.add(lblinfo);
				information.setLayout(null);
		//Information panel design end
				
		//Contact panel design start
				contact=new JPanel();
				contact.setBounds(50, 130, screenWidth-120, screenHeight-300);
				contact.setVisible(false);
				contact.setBackground(Color.WHITE);
				JLabel lblcontact=new JLabel("Contact us will be here");
				lblcontact.setBounds(50, -50, 400, 250);
				contact.add(lblcontact);
				contact.setLayout(null);
		//Contact panel design end
		
		//Footer panel design start
		footer=new JPanel();
		footer.setBounds(50 ,screenHeight-165, screenWidth-120, 100);
		JLabel lblFooter=new JLabel("Footer will be here");
		footer.setBackground(Color.GREEN);
		lblFooter.setBounds(50, 0, 400, 100);
		footer.add(lblFooter);
		footer.setLayout(null);
		//Footer panel design end
		
		
		
		
		f.add(home);
		f.add(about);
		f.add(login);
		f.add(footer);
		f.add(information);
		f.add(contact);
		f.setBounds(0, 10, screenWidth, screenHeight);
		f.setLayout(null);
		f.setVisible(true);
		
		//Button action starts here
		b1.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent e){
				home.setVisible(false);
				about.setVisible(true);
				login.setVisible(false);
				information.setVisible(false);
				contact.setVisible(false);
			}
				});
		
		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e){
				home.setVisible(false);
				about.setVisible(false);
				login.setVisible(true);
				information.setVisible(false);
				contact.setVisible(false);
			}
		});
		
		b3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e){
				home.setVisible(false);
				about.setVisible(false);
				login.setVisible(false);
				information.setVisible(true);
				contact.setVisible(false);
			}
		});
		
		b4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e){
				home.setVisible(false);
				about.setVisible(false);
				login.setVisible(false);
				information.setVisible(false);
				contact.setVisible(true);
			}
		});
			
		
		//Button action ends here
		
		
	}
}

