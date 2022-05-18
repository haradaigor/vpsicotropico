package vpsicotropico.model.dao;

import jakarta.persistence.EntityManager;
import vpsicotropico.model.entities.LoginUser;

public class LoginUserDao {

	EntityManager entityManager;
	
	public LoginUserDao(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	public void save(LoginUser user) {
		this.entityManager.persist(user);
	}
	
	public void delete(LoginUser user) {
		this.entityManager.remove(user);
	}
	
	public void update(LoginUser user) {
		this.entityManager.refresh(user);
	}
	
	public LoginUser getUser(String email) {
		return this.entityManager.find(LoginUser.class, email);
	}
	
	public LoginUser getUser(LoginUser user) {
		return this.entityManager.find(LoginUser.class, user.getEmail());
	}
	
}
