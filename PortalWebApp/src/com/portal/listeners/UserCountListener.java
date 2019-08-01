package com.portal.listeners;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class UserCountListener
 *
 */

@WebListener
public class UserCountListener implements HttpSessionListener {

	public static int count=0;

	public void sessionCreated(HttpSessionEvent event)  { 
		
        count++;
    }

	
    public void sessionDestroyed(HttpSessionEvent event)  { 
    	count--;
    }
	
}
