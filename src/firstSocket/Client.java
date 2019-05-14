package firstSocket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Client {
	
public static void main(String[] args) {
	
}
	public String browse(String ipAddress, Integer port) {
		String LineIn;
		StringBuffer urlContent = new StringBuffer();
		
		
		try (Socket s = new Socket("127.0.0.1", 1025);
			OutputStreamWriter out = new OutputStreamWriter(s.getOutputStream());
			BufferedReader inReader = new BufferedReader(new InputStreamReader(s.getInputStream()));
		) {
			
			out.write("GET / HTTP/1.0\r\n");
			out.write("User-Agent: Browser0\r\n");
			out.write("Host: "+ ipAddress + ":" + port + "\r\n");
			out.write("Accept: text/html, */*\r\n\r\n");
			out.flush();
		
		
			while((LineIn = inReader.readLine()) != null) {
				urlContent.append(LineIn + "\n");
			}
			
		}
		
		catch (Exception err) {
			urlContent.append("ERROR: " + err.toString());
		}
		
		return urlContent.toString();
		}
}


