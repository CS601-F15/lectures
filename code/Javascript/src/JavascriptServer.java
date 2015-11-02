import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.DefaultHandler;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.server.handler.ResourceHandler;
import org.eclipse.jetty.servlet.ServletContextHandler;


public class JavascriptServer {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		
		Logger logger = Logger.getLogger(JavascriptServer.class.getName());
		
		//Example from http://www.eclipse.org/jetty/documentation/current/embedding-jetty.html
		
        Server server = new Server(8080);
 
        ServletContextHandler servhandler = new ServletContextHandler(ServletContextHandler.SESSIONS);        
 
//        servhandler.addServlet(ClientSideServlet.class, "/clientside");
        servhandler.addServlet(SPAServlet.class, "/spa");

        ResourceHandler resource_handler = new ResourceHandler();
        resource_handler.setDirectoriesListed(true);

        resource_handler.setResourceBase("static");

        HandlerList handlers = new HandlerList();
        handlers.setHandlers(new Handler[] { resource_handler, servhandler });
        server.setHandler(handlers);
        
        
        // Start things up!
        server.start();
 
        // The use of server.join() the will make the current thread join and
        // wait until the server is done executing.
        // See
        // http://docs.oracle.com/javase/7/docs/api/java/lang/Thread.html#join()
        server.join();

		
	}

}
