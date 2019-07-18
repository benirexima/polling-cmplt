package polling;
import java.sql.*;
import java.util.Scanner;

import polling.Connection;

public class VotingSystem {
	Scanner sc=new Scanner(System.in);

	java.sql.Connection con;
	
	public void login() {
		Connection con=new Connection();
		System.out.println("Enter the name");
		String user=sc.next();
		System.out.println("enter the password");
         String password=sc.next();
VotingSystem voting=new VotingSystem();
		voting.checkVoter(user,password);
		}
	public void checkVoter(String x,String y)	{
		try {
		
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/polling","root","root");
		
			Statement stmt=null;
			stmt= con.createStatement();
			   
			String query = ("select * from voter where username='" + x + "' and password ='" + y + "'");
			
					 ResultSet results = stmt.executeQuery(query);
					 while (results.next())
					 {
						
								String username=results.getString(2);
								String password=results.getString(3);
								if((username!=null)&&(password!=null)) 
								{
										System.err.println("welcome to polling the system --->");
										PartySelection ps=new PartySelection();
										ps.selectParty(username);
								}        
								else {
										System.out.println("Voter not available in voters list");
				        	 
				         }
					 }
					 con.close();}
		
		catch (Exception e)
	    {
				 	    	System.err.println("password not match" + e);
				 			System.err.println(e.getMessage());
				 	    }
	}
	public void clogin() {
		Connection con=new Connection();
		System.out.println("Enter the username");
		String id=sc.next();
		System.out.println("enter password");
         String password=sc.next();

         VotingSystem voting=new VotingSystem();
 		voting.checkCandidate(id,password);

	}
	
	public void checkCandidate(String a,String b) {
		try {
		
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/polling","root","root");
			
			Statement stmt=null;
			stmt= con.createStatement();
			   
			String query = ("select * from candidate where username='" + a + "' and password ='" + b + "'");
			
					 ResultSet results = stmt.executeQuery(query);
					
					 while (results.next())
					 {
					
								String username=results.getString(1);
								String password=results.getString(2);
								String partyname=results.getString(3);
								
								
								if((username!=null)&&(password!=null)) 
								{
										System.err.println("welcome to polling the system --->");
										VotingSystem voting=new VotingSystem();
										voting.count(partyname);
										
								}		
								else {
									System.out.println("Voter not available in voters list");
											
			        	
			         }
							
								}
					 con.close();}	
								catch (Exception e)
							    {
										 	    	System.err.println("password not match" + e);
										 			System.err.println(e.getMessage());
										 	    }
	}
	
	
	
	public void count(String partyname) {
		try {
		
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/polling","root","root");
			Statement stmt = null;
			stmt= con.createStatement();
			
			String query = ("select count(*) from votes where partyname='"+partyname+"'");
		
			ResultSet rs = stmt.executeQuery(query);


while (rs.next()) {
	System.err.println("u got---> "+ rs.getString(1) +"");
}
Main ob=new Main();
ob.run();
con.close();
} 
		catch (Exception e) {
				System.err.println("Votecount fail---->> " + e);
					e.printStackTrace();
	}
}}
