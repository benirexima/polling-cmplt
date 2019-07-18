package polling;

import java.util.Scanner;

public class Main {
Scanner sc=new Scanner(System.in);
	
	
	public void run() {
		Main ob=new Main();
        VotingSystem voting=new VotingSystem();
		System.out.println("1.voter");
	System.out.println("2.candidate");
			 switch (sc.nextInt()) {
		 		case 1:
		 			
		                voting.login();
		 	
		 			break;
		 		case 2:
		 			
		 		         voting.clogin();
		 			
		 			break;
		 		default:
		 			System.out.println("Entered wrong option/select 1or2 only");
		 }}
	
	public static void main(String[] args) {
		Main ob=new Main();
ob.run();
	//	Connection con=new Connection();
	//	VotingSystem voting=new VotingSystem();	
	//	voting.login();
	//////////////** voter values to be set---------------***********\\\\\\\
		
//		Voter vote=new Voter();
//    	vote.setVoterId(1001);
//		vote.setUsername("benito");
//		vote.setPassword("benito123");
//		con.connectVoter(vote);
//		
//		
//		Voter vote1=new Voter();
//    	vote1.setVoterId(1002);
//		vote1.setUsername("anish");
//		vote1.setPassword("anish123");
//		con.connectVoter(vote1);
//		
//		
//		Voter vote2=new Voter();
//    	vote2.setVoterId(1003);
//		vote2.setUsername("anu");
//		vote2.setPassword("anu123");
//		con.connectVoter(vote2);
//		
//		
//		Voter vote3=new Voter();
//    	vote3.setVoterId(1004);
//		vote3.setUsername("remi");
//		vote3.setPassword("remi123");
//		con.connectVoter(vote3);
//		
//		
//		Voter vote4=new Voter();
//    	vote4.setVoterId(1005);
//		vote4.setUsername("deepika");
//		vote4.setPassword("deepika123");
//		con.connectVoter(vote4);
//		
////////////////*****candidate values to be insert************\\\\\\\\\\\\\\
////		
//	candidate can=new candidate();
//		can.setUsername("stalin");
//		can.setPassword("dmk1111");
//		can.setParty("dmk");
//		con.connectCan(can);
//
//		candidate can1=new candidate();
//		can1.setUsername("ops");
//		can1.setPassword("admk1111");
//		can1.setParty("admk");
//		con.connectCan(can1);
//		
//		candidate can2=new candidate();
//		can2.setUsername("seemon");
//		can2.setPassword("ntk1111");
//		can2.setParty("ntk");
//         con.connectCan(can2);

}}