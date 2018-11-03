import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.net.*;

public class MyServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int port = 1339;
			String host = "localhost";
			VoteServerImpl voteServerImpl = new VoteServerImpl();
			LocateRegistry.createRegistry(port);
			String registryUrl = "rmi://" + host + ":" + port + "/voting";
			Naming.rebind(registryUrl, voteServerImpl);
			System.out.println("Server is ready for connection");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
