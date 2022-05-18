package vpsicotropico.controller.actions;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginForm implements Action{

	public String execute(HttpServletRequest request, HttpServletResponse response) {
		return "foward:login.jsp";
	}
	
}
