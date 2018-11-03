import java.rmi.*;
import java.util.*;
import java.util.Scanner;

public class MyClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner keyb = new Scanner(System.in);
			int port = 1339;
			String host = "localhost";
			String registryUrl = "rmi://" + host + ":" + port + "/voting";
			VoteInterface voteSystem = (VoteInterface)Naming.lookup(registryUrl);
			System.out.println("Lookup completed/n");
			
			System.out.print("Enter port: What is your vote?[Yes][No] : ");
			String vote = keyb.nextLine();
			// Note - Need to create better validation for keyboard input
			System.out.println(voteSystem.castVote(vote.charAt(0)));
			
			//Close the scanner
			keyb.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
