package polling;
import java.sql.*;

public class Connection {
	
	
		
		java.sql.Connection con;
		

		
		public void connectVoter(Voter voter) {
				
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/polling","root","root");
			
			Statement stmt=null;		
			
		//**voter details will be insert
			

			String query = ("insert into voter (voterid,username,password)" + " values ('" + voter.getVoterId() + "','"
					+ voter.getUsername() + "','" + voter.getPassword() + "')");
			stmt= con.createStatement();
			   
			stmt.execute(query);
			System.out.println("voter value  inserted");
	
				
		}
				    catch (Exception e)
				    {
				    	System.err.println("Got an insert table exception" + e);
						System.err.println(e.getMessage());
				    }
		}

		public void connectCan(candidate can) {
				
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/polling","root","root");
			
			Statement stmt=null;		
			String query = ("insert into candidate (username,password,party)" + " values ('" + can.getUsername() + "','"
					+ can.getPassword() + "','" + can.getParty() + "')");
			
			stmt= con.createStatement();
			   
			stmt.execute(query);
			System.out.println("candidate value inserted");
	
		}

	    catch (Exception e)
	    {
	    	System.err.println("Got an insert table exception" + e);
			System.err.println(e.getMessage());
	    }
		}
					   
		}


