package management;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.*;

class UserLayout_Admin  {
	
	UserLayout_Admin(){
		
		
		
		//To get screen size start
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		screenSize.getHeight();
		screenSize.getWidth();
		int screenHeight = screenSize.height;
		screenHeight=screenHeight-50;
		int screenWidth = screenSize.width;
		//To get screen size end

		JFrame userFrame=new JFrame("UserFrame");
		userFrame.setLayout(null);
		userFrame.setBounds(0,0,screenWidth,screenHeight);
		userFrame.setVisible(true);
		JLabel lblHeading=new JLabel("College Management System");
		lblHeading.setFont(new Font("ARIAL", Font.BOLD,40));
		lblHeading.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeading.setBounds(0, 10, screenWidth, 70);
		userFrame.add(lblHeading);
		
		/*int usersx=(50+screenWidth-120)/2-(50+screenWidth-120)/4-(50+screenWidth-120)/4+20;//20;//(50+screenWidth-120)/2-(50+screenWidth-120)/4-(50+screenWidth-120)/4+20; //Start X
		int usersy=(130+screenHeight-300)/2-(130+screenHeight-300)/4-(130+screenHeight-300)/4+20;//465;//(130+screenHeight-300)/2-(130+screenHeight-300)/4-(130+screenHeight-300)/4+20; //Start Y
		int userex=(50+screenWidth-180)/2-60;//835;//(50+screenWidth-180)/2-60; //End X
		int userey=(130+screenHeight-300)/2+(130+screenHeight-300)/3-33;//110;//(130+screenHeight-300)/2+(130+screenHeight-300)/3-33; //End Y*/
		
		JPanel user=new JPanel();
		user.setLayout(null);
		user.setBounds(20,200,200,screenHeight-150);
		user.setBackground(Color.gray);	
		userFrame.add(user);
		JPanel backuser=new JPanel();
		backuser.setLayout(null);
		backuser.setBounds(0,130,screenWidth,screenHeight);
		backuser.setBackground(Color.black);
		userFrame.add(backuser);
	
		
		
		/*label for welcome
		JLabel wellabel=new JLabel("Welcome");
		wellabel.setFont(new Font("ARIAL", Font.ITALIC,20));
		//wellabel.setHorizontalAlignment(SwingConstants.LEFT);
		wellabel.setBounds(25,150,50,200);
		wellabel.setForeground(Color.YELLOW);
		backuser.add(wellabel);
		*/
		
		
		JPanel details=new JPanel();
		details.setLayout(null);
		details.setBounds(250, 71, screenWidth-200,screenHeight-200);
		details.setBackground(Color.yellow);
		backuser.add(details);
		
		//adding buttons in userpanel
		
		JButton btn1=new JButton("Approval");
		btn1.setBounds(40, 80, 120, 20);
		user.add(btn1);
		

		JButton btn2=new JButton("Add Faculty");
		btn2.setBounds(40, 120, 120, 20);
		user.add(btn2);
		
		JButton btn3=new JButton("Add Student");
		btn3.setBounds(40, 160, 120, 20);
		user.add(btn3);
		
		JButton btn4=new JButton("Add Account");
		btn4.setBounds(40, 200, 120, 20);
		user.add(btn4);
		
		
		JPanel Approval_panel=new JPanel();
		Approval_panel.setBounds(250, 71, screenWidth-200,screenHeight-200);
		Approval_panel.setVisible(false);
		Approval_panel.setBackground(Color.MAGENTA);
		JLabel lblinfo=new JLabel("Approval will be here");
		lblinfo.setBounds(50, -50, 400, 250);
		Approval_panel.add(lblinfo);
		Approval_panel.setLayout(null);
		
		
		
		JPanel Add_faculty_panel=new JPanel();
		Add_faculty_panel.setBounds(250, 71, screenWidth-200,screenHeight-200);
		Add_faculty_panel.setVisible(false);
		Add_faculty_panel.setBackground(Color.BLUE);
		JLabel lblinfo1=new JLabel("Add faculty will be here");
		lblinfo1.setBounds(50, -50, 400, 250);
		Add_faculty_panel.add(lblinfo1);
		Add_faculty_panel.setLayout(null);
		
		
		
		JPanel Add_student_panel=new JPanel();
		Add_student_panel.setBounds(250, 71, screenWidth-200,screenHeight-200);
		Add_student_panel.setVisible(false);
		Add_student_panel.setBackground(Color.CYAN);
		JLabel lblinfo2=new JLabel("Add student will be here");
		lblinfo2.setBounds(50, -50, 400, 250);
		Add_student_panel.add(lblinfo2);
		Add_student_panel.setLayout(null);
		
		
		
		JPanel Add_account_panel=new JPanel();
		Add_account_panel.setBounds(250, 71, screenWidth-200,screenHeight-200);
		Add_account_panel.setVisible(false);
		Add_account_panel.setBackground(Color.ORANGE);
		JLabel lblinfo4=new JLabel("Add account will be here");
		lblinfo2.setBounds(50, -50, 400, 250);
		Add_account_panel.add(lblinfo4);
		Add_account_panel.setLayout(null);
		
		backuser.add(Add_account_panel);
		backuser.add(Add_student_panel);
		backuser.add(Add_faculty_panel);
		backuser.add(Approval_panel);
		/*JButton btn5=new JButton("Button five");
		btn5.setBounds(40, 240, 100, 20);
		user.add(btn5);
		*/
		
		btn1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e){
				details.setVisible(false);
				//about.setVisible(false);
				Approval_panel.setVisible(true);
				Add_faculty_panel.setVisible(false);
				Add_student_panel.setVisible(false);
				Add_account_panel.setVisible(false);
			}
		});
		
		
		btn2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e){
				details.setVisible(false);
				//about.setVisible(false);
				Approval_panel.setVisible(false);
				Add_faculty_panel.setVisible(true);
				Add_student_panel.setVisible(false);
				Add_account_panel.setVisible(false);
			}
		});
		
		
		
		btn3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e){
				details.setVisible(false);
				//about.setVisible(false);
				Approval_panel.setVisible(false);
				Add_faculty_panel.setVisible(false);
				Add_student_panel.setVisible(true);
				Add_account_panel.setVisible(false);
			}
		});
		
		
		
		btn4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e){
				details.setVisible(false);
				//about.setVisible(false);
				Approval_panel.setVisible(false);
				Add_faculty_panel.setVisible(false);
				Add_student_panel.setVisible(false);
				Add_account_panel.setVisible(true);
			}
		});
		
		
		
	}

	public static void main(String[] args){
		new UserLayout_Admin();
		
	}
	
	

}

