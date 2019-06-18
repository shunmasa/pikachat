package server;

import client.ClientWindow;

public class ChatServer {

	public static void main(String[] args) {
	
		Server.start(52864);
		ClientWindow.main(args);
		
	}

}
