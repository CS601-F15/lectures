import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONObject;

public class SPAServlet extends HttpServlet {
	
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		HttpSession session = request.getSession();
		Integer count = (Integer) session.getAttribute("count");
		if(count == null) {
			count = 1;
		} else {
			count = count + 1;
		}
		session.setAttribute("count", count);
		
		response.setContentType("text/html");
        response.setStatus(HttpServletResponse.SC_OK);
                
		PrintWriter out = response.getWriter();
		
		//This should really come from the database or similar!
		JSONObject obj = new JSONObject();
		obj.put("count", count);
		out.println(obj);		
	}
	
}
