import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class CookieServlet extends HttpServlet {

	
	private Logger logger = Logger.getLogger(CookieServlet.class.getName());
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		Cookie[] cookies = request.getCookies();

		String name = null;
		
		if(cookies != null) {
			//for each cookie, if the key is name, store the value
			for(Cookie c: cookies) {
				System.out.println(c);
				 
			}
		}
		Cookie c = new Cookie("user", "1234");
		response.addCookie(c);
		
//		String name = request.getParameter("name");
//		if(name == null) {
//			name = "anonymous";
//		}		
//
//		logger.log(Level.INFO, "Request from: " + name);
		
		response.setContentType("text/html");
        response.setStatus(HttpServletResponse.SC_OK);
                
		PrintWriter out = response.getWriter();
		
		String responseStr = "";
		
		out.println(responseStr);
		
	}
	
	
}
