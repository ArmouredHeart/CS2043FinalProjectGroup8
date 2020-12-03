import java.sql.*;
import java.util.*;
public class DataManager {
	Connection connection = null;
	
	public DataManager() {
		 try {
	         Class.forName("com.mysql.jdbc.Driver").newInstance();
	     } catch (Exception e) {
	      System.err.println(e.toString());
	     }
		String url = "jdbc:mysql://cs2043.cs.unb.ca:3306/cs204301ateam8";
		try {
		connection = DriverManager.getConnection(url, "cs204301ateam8", "RN9KJ7fS");
		} catch (SQLException e) {
		System.err.println("Database connection error.");
		}
	}
	
	public UserAccount getUserObject(String userID) {
		UserAccount user = new UserAccount();
		try {
			Statement st = connection.createStatement();
			
			//create query string
			String sqlQuery = "select * from users where username = " + userID + ";";
			
			//execute SQL query
			ResultSet rs = st.executeQuery(sqlQuery);
			
			//convert retrieved rows to BookInfoObject[]
			UserAccount user = new UserAccount();
			while (rs.next()) {
				user.userID = rs.getString(1);
				user.FirstName = rs.getString(2);
				user.LastName = rs.getString(3);
				user.Password = rs.getString(4);
			}
		} catch (SQLException e) {
			System.err.println("SQL error: getUserObject");
		}
		
		return user;
	}
	
	public Message getMessageObject(int messageID) {
		Message user = new Message();
		try {
			Statement st = connection.createStatement();
			
			//create query string
			String sqlQuery = "select * from users where username = " + messageID + ";";
			
			//execute SQL query
			ResultSet rs = st.executeQuery(sqlQuery);
			
			//convert retrieved rows to BookInfoObject[]
			Message msg = new Message();
			while (rs.next()) {
				msg.MessageID = rs.getInt(1);
				msg.Sender = rs.getString(2);
				msg.Receiver = rs.getString(3);
				msg.GroupId = rs.getString(4);
				msg.AdminId = rs.getString(5);
				msg.Text = rs.getString(6);
				msg.SendTime = rs.getString(7);
			}
		} catch (SQLException e) {
			System.err.println("SQL error: getUserObject");
		}
		
		return msg;
	}
}