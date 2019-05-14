package firstSocket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Logger;




public class ServerSocket extends Thread {
	private Integer port = 1025;
	private final Logger logger = Logger.getLogger("");
	
	public void run() {
		try (ServerSocket listener = new ServerSocket(port, 10, null)) {
			
			while(true) {
				try (Socket client = Listener.accept();
					BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
					PrintWriter out = new PrintWriter(client.getOutputStream());
					){
						logger.info("Request from client " + client.getInetAddress().toString()
									+ " for server " + client.getLocalAddress().toString());
						
						out.print("HTTP/1.0 200 \r\n");
						out.println("Content-Type: text/plain\r\n");
						out.println("\r\n");
						
						StringBuilder received = new StringBuilder();
						String inString;
						while ((inString = in.readLine()) != null && inString.length() != 0 ) {
							received.append(inString + "\n");
						}
						
					String outString = received.toString();
					out.print(outString);
					logger.info("Request contents: \n" + outString);
					out.flush();
					
				}
			}
			
		} catch (Exception e) {
			System.err.println(e);
		}
	};
	
	public void setPort(Integer port) {
		this.port = port;
	}

}
