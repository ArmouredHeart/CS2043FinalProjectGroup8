import javax.swing.*;
import java.awt.*;

class loginUI extends Frame implements WindowListener,ActionListener{
		private loginControl lCtrl;
		private UserAccount userAccnt;
		string username, password;
		
		public void displayLoginForm(){
			JFrame frame = new JFrame("Login UI");
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    frame.setSize(300,300);
			JPanel panel = new JPanel();
			JLabel l_Usr = new JLabel("Usernaem: ");
			JLabel l_Pwd = new JLabel("Password: ");
		    JButton button = new JButton("Login");
			button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				password = pwd.getText();
				username = usr.getText();
				String hash = lCtrl.convertPassword(password);
				int len = hash.length();
				if((hash != null) && (len > 0)){
				
					bool valid = lCtrl.checkUsername(username, hash);
				
					if(valid){
						displayLoginSuccess()
						userAccnt = lCtrl.getUserObject(username);
					}
					else{
						displayLoginFailure();
					}

				}
				);
				
			}
		});
			JTextField usr = new JTextField(10);
			JTextField pwd = new JTextField(64);
		    
			panel.add(l_Usr);
			panel.add(usr);
			
			panel.add(l_Pwd);
			panel.add(pwd);
			
		    panel.add(button);
			frame.setVisible(true);
		}
		
		public LoginUI(loginControl control) {
			this.loginControl = control;
		}
		
		public void displayLoginFailure(){
			System.out.println("User ID or Password incorrect");
		}
		
		public void displayLoginSuccess(){
			System.out.println("Login Successful. Retrieving User Data.");
		}
		
		
		/*
	
		String s_pw; 
		
		JFrame frame = new JFrame("Login Module");
		frame.setDefaultCloseOperation(JFrame..EXIT_ON_CLOSE);
		frame.setSize(400,400);

		/* Create Username Label and text field
		JLabel label_Username = new JLabel("Username: ");
		JTextField textField_Username = new JTextField(50);
		
		/* Create Password Label and text field
		JLabel label_Password = new JLabel("Password: ");
		JPasswordField textField_Password = new JPasswordField(64);
		
		JButton btn_CheckCreds = new JButton("Authenticate");
		btn_CheckCreds.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				s_pw = new String(textField_Password.getPassword());
			}
		});
		
		String hash = convertPassword(s_pw);
		
		/* Reset password in memory to null
		s_pw = NULL;
		*/
		
		
		
}