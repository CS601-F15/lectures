import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class YelpClient {

	final static int PORT = 80;

	public static void main(String[] args) {
		try (Socket s = new Socket(InetAddress.getByName("www.yelp.com"), PORT);
				PrintWriter out = new PrintWriter(new OutputStreamWriter(s.getOutputStream()))) {

			String request = "GET /biz/velo-rouge-cafe-san-francisco HTTP/1.1\r\n" +
					"Host: www.yelp.com\r\n" +
					"Connection: close\r" +
					"\r\n"; 
			
			System.out.println("Sending request:");
			System.out.println(request);
			System.out.println("*****");
			out.println(request);
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
