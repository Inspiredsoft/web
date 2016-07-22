/*******************************************************************************
* Inspired Web is a framework containing several web utilities.
* Copyright (C) 2016 Inspired Soft
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.    
*******************************************************************************/

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
