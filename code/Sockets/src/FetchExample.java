import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class FetchExample {

	public static String mystery1(String page) {

		String newPage = page.replaceAll("(?is)<.*?>", "");
		return newPage;		

	}
 
	public static ArrayList<String> mystery2(String page) {
				
		String REGEX = "(?is)(<\\s*a\\s+[^>]*href\\s*=\\s*\")(.+?)(\")";

		int GROUP = 2;

		ArrayList<String> result = new ArrayList<String>();
		
		Pattern p = Pattern.compile(REGEX);

		Matcher m = p.matcher(page);

		while(m.find()) {
			result.add(m.group(GROUP));
		}

		return result;
	}



	public static void main(String[] args) {

		String page = HTTPFetcher.download("www.cs.usfca.edu", "/~srollins/test.html");
		
		System.out.println(page);
		System.out.println("******");
		System.out.println(mystery1(page));
		
		
		
		
//		URL url = null;
//		try {
//			url = new URL("http://www.yelp.com/biz/bursa-san-francisco");			
//		} catch (MalformedURLException e) {
//			e.printStackTrace();
//		}
//		String page = HTTPFetcher.download(url.getHost(), url.getPath());
//		System.out.println(page);
//		
//		System.out.println(mystery1(page));
//		
//		ArrayList<String> result = mystery2(page);
//		for(String s: result) {
//			System.out.println(s);
//		}
		
		
//		String page = "<html>test page with <b>bold</b> text </html>";
//		System.out.println("result: " + mystery1(page));

	}

}