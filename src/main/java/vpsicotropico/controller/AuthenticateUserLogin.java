package vpsicotropico.controller;

import vpsicotropico.model.entities.LoginUser;

public class AuthenticateUserLogin{

	
	public static boolean authenticate(LoginUser userReceived) {
		LoginUser userFound = 
				UserLoginController.getUser(userReceived.getEmail());
		
		if(!userFound.equals(null)) {
			return passwordMatch(userReceived.getPassword(), userFound.getPassword());
		}
		
		return false;
	}
	
	private static boolean passwordMatch(String userPasswordReceived, String realUserPassword) {
		
		return userPasswordReceived.equals(realUserPassword);
	}

}
