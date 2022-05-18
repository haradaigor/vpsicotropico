package vpsicotropico.controller;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vpsicotropico.controller.actions.Action;


@WebServlet("/")
public class EntryController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Servlet Entry Controller");
		String actionName = 
				request.getParameter("action");
		
		System.out.println("Action servlet: "+ actionName);
		String actionDirection = "";
		try {
			
			Class<?> actionClass = Class.forName("vpsicotropico.controller.actions."+actionName);
			Constructor<?> actionClassContructor = actionClass.getConstructor();
			Action actionInstance = (Action) actionClassContructor.newInstance();
			actionDirection = actionInstance.execute(request, response);
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		
		String actionType = actionDirection.split(":")[0];
		String actionResource = actionDirection.split(":")[1];
		System.out.println(actionResource);
		if(actionType.equals("foward")) {
			RequestDispatcher requestDispatcher = request
					.getRequestDispatcher("WEB-INF/view/"+actionResource);
			
			requestDispatcher.forward(request, response);
		}
		else {
			response.sendRedirect(actionResource);
		}
		
		
		
	}


}
