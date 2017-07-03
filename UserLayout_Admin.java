package management;
import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.ThreadLocalRandom;

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
		
		
		JPanel backuser=new JPanel();
		backuser.setLayout(null);
		backuser.setBounds(0,130,screenWidth,screenHeight);
		backuser.setBackground(Color.black);
		userFrame.add(backuser);
		
		
		
		JPanel user=new JPanel();
		user.setLayout(null);
		user.setBounds(20,200,200,screenHeight-150);
		user.setBackground(Color.gray);	
		backuser.add(user);
		
		
		
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
		Add_faculty_panel.setBackground(Color.MAGENTA);
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
		
		
		
		
		//designing of add faculty panel
		JLabel lblFirstName,lblLastName,lblrpassword,lblGender;
		lblFirstName=new JLabel("First Name");
		lblLastName=new JLabel("Last Name");
		lblrpassword=new JLabel("Password");
		lblGender=new JLabel("Gender");
		
		
		JTextField txtFname,txtLname,txtrpassword;
		txtFname=new JTextField();
		txtLname=new JTextField();
		txtrpassword=new JTextField();
		
		
		
		JRadioButton genderMale=new JRadioButton("Male");  
		genderMale.setActionCommand("Male");
		JRadioButton genderFemale=new JRadioButton("Female");
		genderFemale.setActionCommand("Female");
		ButtonGroup bg=new ButtonGroup();    
		bg.add(genderMale);bg.add(genderFemale); 
		JButton btnRegister_faculty=new JButton("Register");
		
		
		
		lblFirstName.setBounds(190, 130, 190, 20);
		lblFirstName.setFont(new Font("ARIAL", Font.BOLD,20));
		txtFname.setBounds(300, 130, 340, 30);
		lblLastName.setBounds(190, 210, 190, 20);
		lblLastName.setFont(new Font("ARIAL", Font.BOLD,20));
		txtLname.setBounds(300, 210, 340, 30);
		lblrpassword.setBounds(190, 290, 190, 20);
		lblrpassword.setFont(new Font("ARIAL", Font.BOLD,20));
		txtrpassword.setBounds(300, 290, 340, 30);
		lblGender.setBounds(190, 370, 190, 20);
		lblGender.setFont(new Font("ARIAL", Font.BOLD,20));
		genderMale.setBounds(300, 370, 100, 20);
		genderMale.setFont(new Font("ARIAL", Font.BOLD,20));
		genderFemale.setBounds(400, 370, 100, 20);
		genderFemale.setFont(new Font("ARIAL", Font.BOLD,20));
		
		btnRegister_faculty.setBounds(190, 20, 190, 30);
		
		Add_faculty_panel.add(btnRegister_faculty);
		Add_faculty_panel.add(genderFemale);
		Add_faculty_panel.add(genderMale);
		Add_faculty_panel.add(txtrpassword);
		Add_faculty_panel.add(txtLname);
		Add_faculty_panel.add(txtFname);
		Add_faculty_panel.add(lblGender);
		Add_faculty_panel.add(lblrpassword);
		Add_faculty_panel.add(lblLastName);
		Add_faculty_panel.add(lblFirstName);
	
		
		
		//creating buttons and labels again for student
	
		JLabel slblFirstName,slblLastName,slblrpassword,slblGender;
		slblFirstName=new JLabel("First Name");
		slblLastName=new JLabel("Last Name");
		slblrpassword=new JLabel("Password");
		slblGender=new JLabel("Gender");
		
		
		JTextField stxtFname,stxtLname,stxtrpassword;
		stxtFname=new JTextField();
		stxtLname=new JTextField();
		stxtrpassword=new JTextField();
		
		
		
		JRadioButton sgenderMale=new JRadioButton("Male");  
		JRadioButton sgenderFemale=new JRadioButton("Female");       
		ButtonGroup sbg=new ButtonGroup();    
		sbg.add(sgenderMale);sbg.add(sgenderFemale); 
		JButton btnRegister_student=new JButton("Register");
		
		
		
		slblFirstName.setBounds(190, 130, 190, 20);
		slblFirstName.setFont(new Font("ARIAL", Font.BOLD,20));
		stxtFname.setBounds(300, 130, 340, 30);
		slblLastName.setBounds(190, 210, 190, 20);
		slblLastName.setFont(new Font("ARIAL", Font.BOLD,20));
		stxtLname.setBounds(300, 210, 340, 30);
		slblrpassword.setBounds(190, 290, 190, 20);
		slblrpassword.setFont(new Font("ARIAL", Font.BOLD,20));
		stxtrpassword.setBounds(300, 290, 340, 30);
		slblGender.setBounds(190, 370, 190, 20);
		slblGender.setFont(new Font("ARIAL", Font.BOLD,20));
		sgenderMale.setBounds(300, 370, 100, 20);
		sgenderMale.setFont(new Font("ARIAL", Font.BOLD,20));
		sgenderFemale.setBounds(400, 370, 100, 20);
		sgenderFemale.setFont(new Font("ARIAL", Font.BOLD,20));
		btnRegister_student.setBounds(190, 20, 190, 30);
		
		
		
		
		Add_student_panel.add(btnRegister_student);
		Add_student_panel.add(sgenderFemale);
		Add_student_panel.add(sgenderMale);
		Add_student_panel.add(stxtrpassword);
		Add_student_panel.add(stxtLname);
		Add_student_panel.add(stxtFname);
		Add_student_panel.add(slblGender);
		Add_student_panel.add(slblrpassword);
		Add_student_panel.add(slblLastName);
		Add_student_panel.add(slblFirstName);
	
	
		//code for student panel ends here
		
		
		
		//creating buttons and labels again for accountant
		
		JLabel alblFirstName,alblLastName,alblrpassword,alblGender;
		alblFirstName=new JLabel("First Name");
		alblLastName=new JLabel("Last Name");
		alblrpassword=new JLabel("Password");
		alblGender=new JLabel("Gender");
		
		
		JTextField atxtFname,atxtLname,atxtrpassword;
		atxtFname=new JTextField();
		atxtLname=new JTextField();
		atxtrpassword=new JTextField();
		
		
		
		JRadioButton agenderMale=new JRadioButton("Male");  
		JRadioButton agenderFemale=new JRadioButton("Female");       
		ButtonGroup abg=new ButtonGroup();    
		abg.add(sgenderMale);sbg.add(sgenderFemale); 
		JButton btnRegister_accountant=new JButton("Register");
		
		
		
		alblFirstName.setBounds(190, 130, 190, 20);
		alblFirstName.setFont(new Font("ARIAL", Font.BOLD,20));
		atxtFname.setBounds(300, 130, 340, 30);
		alblLastName.setBounds(190, 210, 190, 20);
		alblLastName.setFont(new Font("ARIAL", Font.BOLD,20));
		atxtLname.setBounds(300, 210, 340, 30);
		alblrpassword.setBounds(190, 290, 190, 20);
		alblrpassword.setFont(new Font("ARIAL", Font.BOLD,20));
		atxtrpassword.setBounds(300, 290, 340, 30);
		alblGender.setBounds(190, 370, 190, 20);
		alblGender.setFont(new Font("ARIAL", Font.BOLD,20));
		agenderMale.setBounds(300, 370, 100, 20);
		agenderMale.setFont(new Font("ARIAL", Font.BOLD,20));
		agenderFemale.setBounds(400, 370, 100, 20);
		agenderFemale.setFont(new Font("ARIAL", Font.BOLD,20));
		btnRegister_accountant.setBounds(190, 20, 190, 30);
		
		
		
		
		Add_account_panel.add(btnRegister_accountant);
		Add_account_panel.add(agenderFemale);
		Add_account_panel.add(agenderMale);
		Add_account_panel.add(atxtrpassword);
		Add_account_panel.add(atxtLname);
		Add_account_panel.add(atxtFname);
		Add_account_panel.add(alblGender);
		Add_account_panel.add(alblrpassword);
		Add_account_panel.add(alblLastName);
		Add_account_panel.add(alblFirstName);
	
	
		//code for accountant panel ends here
		
		
		
		
		
		//ending of add faculty panel
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
		
		btnRegister_faculty.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e){
				String f1=txtFname.getText();
				String l1=txtLname.getText();
				String p1=txtrpassword.getText();
				int r=ThreadLocalRandom.current().nextInt(100000,1000000);
				String user1=f1.charAt(0)+r+l1;
				
				String g1=bg.getSelection().getActionCommand();
				String rid="Faculty";
				Connectivity obj1=new Connectivity();
				//obj1.
				//System.out.println(f1+" "+l1+" "+p1+" "+user1+" "+g1+" "+rid);
				obj1.register(f1, l1, user1, p1, rid, g1);
			}
		});	
		
	}

	public static void main(String[] args){
		new UserLayout_Admin();
		Connectivity obj=new Connectivity();
		//obj.register();
		
		
	}
	
	

}

