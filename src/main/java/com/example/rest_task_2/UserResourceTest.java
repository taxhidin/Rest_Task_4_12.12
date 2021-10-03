package com.example.rest_task_2;

import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.jboss.resteasy.plugins.server.servlet.HttpServletDispatcher;


public class UserResourceTest {

    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);
        server.setHandler(getHandlers());
        server.start();
        server.join();
    }

    private static Handler getHandlers() {
        ServletContextHandler handler = new ServletContextHandler(ServletContextHandler.NO_SESSIONS);
        handler.addServlet(HttpServletDispatcher.class, "/");
        handler.setInitParameter("javax.ws.rs.Application", RestEasyServices.class.getCanonicalName());
        return handler;
    }


}
