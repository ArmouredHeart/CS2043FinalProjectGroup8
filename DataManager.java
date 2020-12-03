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
			System.err.println("SQL error: getMessageObject");
		}
		
		return msg;
	}
	
	public Administrator getAdminObject(int adminID) {
		Administrator adm = new Administrator();
		try {
			Statement st = connection.createStatement();
			
			//create query string
			String sqlQuery = "select * from users where username = " + adminID + ";";
			
			//execute SQL query
			ResultSet rs = st.executeQuery(sqlQuery);
			
			//convert retrieved rows to BookInfoObject[]
			while (rs.next()) {
				adm.userID = rs.getString(1);
				adm.FirstName = rs.getString(2);
				adm.LastName = rs.getString(3);
				adm.Password = rs.getString(4);
			}
		} catch (SQLException e) {
			System.err.println("SQL error: getAdminObject");
		}
		
		return adm;
	}
	
	public FriendGroup getFriendGroupObject(int groupID) {
		FriendGroup user = new Administrator();
		try {
			Statement st = connection.createStatement();
			
			//create query string
			String sqlQuery = "select * from users where username = " + adminID + ";";
			
			//execute SQL query
			ResultSet rs = st.executeQuery(sqlQuery);
			
			//convert retrieved rows to BookInfoObject[]
			Administrator fr = new Administrator();
			while (rs.next()) {
				fr.userID = rs.getString(1);
				fr.FirstName = rs.getString(2);
				fr.LastName = rs.getString(3);
				fr.Password = rs.getString(4);
			}
		} catch (SQLException e) {
			System.err.println("SQL error: getAdminObject");
		}
		
		return fr;
	}
}