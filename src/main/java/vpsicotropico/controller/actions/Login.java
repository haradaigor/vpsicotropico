package vpsicotropico.controller.actions;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import vpsicotropico.controller.AuthenticateUserLogin;
import vpsicotropico.model.entities.LoginUser;
import vpsicotropico.service.HashString;

public class Login implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String user = request.getParameter("user");
		String password = request.getParameter("password");
		

		LoginUser userLogged = new LoginUser(user, HashString.toSHA(password));
		
		boolean isUserAuthenticate = 
				AuthenticateUserLogin.authenticate(userLogged);
		
		if(isUserAuthenticate) {
			System.out.println("Cliente "+ user +" authenticate sucessfull!");
			HttpSession session = request.getSession();
			session.setAttribute("userLogged", userLogged);
			
		}
		return "redirect:?action=MainForm";

	}

}
