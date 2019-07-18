package polling;
import java.sql.*;
import java.util.Scanner;
public class PartySelection {
	
	public void insertVote(String username,Votes votes) {
		System.out.println(username);
		java.sql.Connection con;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/polling","root","root");
			
			Statement stmt=null;		
			
		//**votes details will be insert
			

			String query = ("insert into votes(username,partyname)" + " values ('" + username + "','"
					+ votes.getPartyName() + "')");
			stmt= con.createStatement();
			   
			stmt.execute(query);
			System.out.println("----->  Voted");
			Main ob=new Main();
			ob.run();
		}
		catch (Exception e) {
			System.err.println("Got an insert table exception" + e);
			System.err.println(e.getMessage());
}
}
	
	public  void selectParty(String user) 
	{	

System.out.println("1.dmk \n 2.admk \n 3.ntk");
Votes votes=new Votes();
PartySelection ps=new PartySelection();
Scanner scanner=new Scanner(System.in);
switch (scanner.nextInt()) {
case 1:
	votes.setPartyName("dmk");
	ps.insertVote(user,votes);
	break;
case 2:
	votes.setPartyName("admk");
	ps.insertVote(user,votes);
	break;
case 3:
	votes.setPartyName("ntk");
	ps.insertVote(user,votes);
	break;
default:
	System.out.println("invalid");
	break;

}

}


}













