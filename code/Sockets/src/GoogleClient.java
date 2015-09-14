import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class GoogleClient {

	final static int PORT = 80;

	public static void main(String[] args) {
		try (Socket s = new Socket(InetAddress.getByName("google.com"), PORT);
				PrintWriter out = new PrintWriter(new OutputStreamWriter(s.getOutputStream()))) {

			out.println("GET / HTTP/1.0\n");
			out.flush(); 
			
			BufferedReader instream = new BufferedReader(
					new InputStreamReader(s.getInputStream()));                   
			
			String line = instream.readLine();        
			while(line != null) {
				System.out.println(line);
				line = instream.readLine();
			}

		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
