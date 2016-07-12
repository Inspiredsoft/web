package it.inspired.web.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Using jsf an integer property binded to a inputtext in UI is set to zero on submit
 * add it as listener in the web.xml
 * 
 *	<listener>
 *		<listener-class>it.inspired.web.listener.CoerceToZeroListener</listener-class>
 *	</listener>
 *
 * @author Massimo Romano
 *
 */
public class CoerceToZeroListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent event) {
		System.setProperty("org.apache.el.parser.COERCE_TO_ZERO", "false");
	}

	public void contextDestroyed(ServletContextEvent event) {
	}
}
