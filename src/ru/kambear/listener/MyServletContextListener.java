package ru.kambear.listener;

import org.apache.log4j.*;
import javax.servlet.*;
import java.io.*;

public class MyServletContextListener implements ServletContextListener{

	private static Logger log = LogManager.getRootLogger();

	public void contextInitialized(ServletContextEvent sce){
		
	}

	public void contextDestroyed(ServletContextEvent sce){
		
	}

}