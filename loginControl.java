import javax.
swing.*;
class loginControl extends Frame implements WindowListener,ActionListener{
	public static void main(String args[]){
	
		String s_pw; 
		
		JFrame frame = new JFrame("Login Module");
		frame.setDefaultCloseOperation(JFrame..EXIT_ON_CLOSE);
		frame.setSize(400,400);
		
		/* Create Username Label and text field */
		JLabel label_Username = new JLabel("Username: ");
		JTextField textField_Username = new JTextField(50);
		
		/* Create Password Label and text field */
		JLabel label_Password = new JLabel("Password: ");
		JPasswordField textField_Password = new JPasswordField(64);
		
		JButton btn_CheckCreds = new JButton("Authenticate");
		btn_CheckCreds.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				s_pw = new String(textField_Password.getPassword());
			}
		});
		
		String hash = convertPassword(s_pw);
		
		/* Reset password in memory to null */
		s_pw = NULL;
		
		
		
		
	}
	
	public bool checkUsername(String username){
		
	}
	
	public bool checkPassword(String username, String hash){
	
	}
	
	public String convertPassword(String password){
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		md.update(password.getBytes());
		
		byte[] md = md.digest();
		
		StringBuffer hex = new StringBuffer();
		
		for(int i = 0; i < digest.length; i++){
			hex.append(Integer.toHexString(0xFF & digest[i]));
		}
		
		return hex.toString();
	}
	
	public DataManager() {
		 try {
	         Class.forName("com.mysql.jdbc.Driver").newInstance();
	     } catch (Exception e) {
	      System.err.println(e.toString());
	     }
		String url = "jdbc:mysql://<server host>:3306/<DBName>";
		try {
		connection = DriverManager.getConnection(url, "your-login-ID", "your-MySQL-password");
		} catch (SQLException e) {
		System.err.println("Database connection error.");
		}
	}
}