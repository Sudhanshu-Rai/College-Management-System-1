import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Logintest{

	JPanel home,about,login,footer;
	
	public static void main(String[] args) {
		
		new Logintest();

	}

	Logintest()
	{
		JFrame f=new JFrame("College Management System");
		JButton b1=new JButton("About Us");
		b1.setBounds(50, 50, 100, 20);
		
		JButton b2=new JButton("Login");
		b2.setBounds(150, 50, 100, 20);
		
		//Home panel design Start
		home=new JPanel();
		home.setBounds(50, 80, 400, 250);
		home.setBackground(Color.BLUE);
		//Home panel design end
		
		//About panel design start
		about=new JPanel();
		about.setBounds(50, 80, 400, 250);
		about.setVisible(false);
		JLabel lblabout=new JLabel("About us will be here");
		lblabout.setBounds(50, 80, 400, 250);
		about.add(lblabout);
		about.setLayout(null);
		//About panel design end
		
		
		//Login panel design start
		login=new JPanel();
		login.setBounds(50, 80, 400, 250);
		login.setVisible(false);
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
		
		//Footer panel design start
		footer=new JPanel();
		footer.setBounds(50, 300, 400, 100);
		JLabel lblFooter=new JLabel("Footer will be here");
		lblFooter.setBounds(50, 325, 400, 100);
		footer.add(lblFooter);
		footer.setLayout(null);
		//Footer panel design end
		
		f.add(b1);
		f.add(b2);
		f.add(home);
		f.add(about);
		f.add(login);
		f.add(footer);
		f.setBounds(0, 0, 500, 500);
		f.setLayout(null);
		f.setVisible(true);
		
		b1.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent e){
				home.setVisible(false);
				about.setVisible(true);
				login.setVisible(false);
			}
				});
		
		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e){
				home.setVisible(false);
				about.setVisible(false);
				login.setVisible(true);
			}
		});
			
		
		
		
	}
}
