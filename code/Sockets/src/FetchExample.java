import java.net.MalformedURLException;
import java.net.URL;


public class FetchExample {

	public static void main(String[] args) {

		String page = HTTPFetcher.download("www.cs.usfca.edu", "/~srollins/test.html");		
		System.out.println(page);
			
//		URL url = null;
//		try {
//			url = new URL("http://www.cs.usfca.edu/~srollins/test.html");			
//		} catch (MalformedURLException e) {
//			e.printStackTrace();
//		}
//		String page = HTTPFetcher.download(url.getHost(), url.getPath());
//		System.out.println(page);
		
		
	}

}