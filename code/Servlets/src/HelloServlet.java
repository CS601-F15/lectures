import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.istack.internal.logging.Logger;


public class HelloServlet extends HttpServlet {

	
	private Logger logger = Logger.getLogger(HelloServlet.class);
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
			
		String name = request.getParameter("name");
		if(name == null) {
			name = "anonymous";
		}		

		logger.log(Level.INFO, "Request from: " + name);
		
		response.setContentType("text/html");
        response.setStatus(HttpServletResponse.SC_OK);
                
		PrintWriter out = response.getWriter();
		
		out.println("<html><title>HelloServlxet</title><body>Hello, " + name + "!<br/>Thanks for visiting</body></html>");
		
	}
	
	
}
