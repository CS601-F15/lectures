import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {

	final static String EOT = "EOT";

	public static void main(String[] args) {

		try (ServerSocket serve = new ServerSocket(1024);
				Socket sock = serve.accept();
				BufferedReader instream = new BufferedReader(new InputStreamReader(sock.getInputStream()))) {

			String message = "";
			String line = instream.readLine();
			
			while(line != null && !line.trim().equals(EOT)) {
				message += line + "\n";
				line = instream.readLine();
			}
			System.out.println("Client says: " + message);
			
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
