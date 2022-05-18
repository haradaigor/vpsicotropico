package vpsicotropico.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_login")
public class LoginUser {
	
	@Id
	private String email;
	private String password;
	
	public LoginUser() {
		
	}
	
	public LoginUser(String email, String password) {
		this.email = email;
		this.password = password;
	}
	
	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

}
