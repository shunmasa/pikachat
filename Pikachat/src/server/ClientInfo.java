package server;

import java.net.InetAddress;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class ClientInfo {

	private InetAddress address;
	private int port;
	private int id;
	private String name;
	
	public ClientInfo (String name, int id, InetAddress address, int port) {
		
		this.name = name;
		this.id = id;
		this.address = address;
		this.port = port;
	}
	public String getName() {
		return name;
	}
	public int getID() {
		return id;
	}
	public InetAddress getAddress() {
		return address;
	}
	public int getPort() {
		return port;
	}
	
	public static void getConnection(String cName, String cNickname, char[] cPassword) {
	
		Connection cnx = null;
		
        try {
        	String url = "jdbc:mysql://localhost:3306/test";
        	String user = "root";
        	String password = null;
        	
        	cnx = DriverManager.getConnection(url, user, password);
        	
        	PreparedStatement stmnt = cnx.prepareStatement("INSERT INTO `users_registered`(`name`, `nickname`, `password`) VALUES ('" + cName + "','"+cNickname+"','"+cPassword+"')");
        	
        	stmnt.execute();
        	
        } catch (Exception e) {
        	e.printStackTrace();
        }
        
        }
	
	public static void  getConnection(String loginName, char[] loginPassword) {
		
		Connection cnx = null;
		
		try {
			String url = "jdbc:mysql://localhost:3306/test";
        	String user = "root";
        	String password = null;
        	
        	cnx = DriverManager.getConnection(url, user, password);
			//SELECT * FROM `users_registered` WHERE `nickname`='jonn05';
			PreparedStatement stmnt = cnx.prepareStatement("SELECT * FROM `users_registered` WHERE `nickname`='" + loginName + "'"); 
					//+ "' AND 'password' = '" + loginPassword + "'");
			stmnt.execute();
			System.out.println("Access granted");
			ChatServer.main(null);
        	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
		
}