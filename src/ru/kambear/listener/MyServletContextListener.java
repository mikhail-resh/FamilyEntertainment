package ru.kambear.listener;

import org.apache.log4j.*;
import javax.servlet.*;
import java.io.*;

public class MyServletContextListener implements ServletContextListener{

	private static Logger log = LogManager.getRootLogger();

	public void contextInitialized(ServletContextEvent sce){
		System.out.println("Servlet Started");
		log.debug("Servlet started");
	}

	public void contextDestroyed(ServletContextEvent sce){
		log.debug("Servlet destroyed");
	}

}