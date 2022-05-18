package vpsicotropico.controller;

import jakarta.persistence.EntityManager;
import vpsicotropico.model.dao.LoginUserDao;
import vpsicotropico.model.entities.LoginUser;
import vpsicotropico.model.service.JPAUtil;

public class UserLoginController {
	
		
	public static void createUser(LoginUser user) {
		EntityManager entityManager = JPAUtil.getEntityManager();
		LoginUserDao loginUserDao = new LoginUserDao(entityManager);
		entityManager.getTransaction().begin();
		loginUserDao.save(user);
		entityManager.close();
	}
	
	public static void updateUser(LoginUser user) {
		EntityManager entityManager = JPAUtil.getEntityManager();
		LoginUserDao loginUserDao = new LoginUserDao(entityManager);
		entityManager.getTransaction().begin();
		loginUserDao.update(user);
		entityManager.close();
	}
	
	public static void delete(LoginUser user) {
		
		EntityManager entityManager = JPAUtil.getEntityManager();
		LoginUserDao loginUserDao = new LoginUserDao(entityManager);
		entityManager.getTransaction().begin();
		loginUserDao.delete(user);
		entityManager.close();		
	}
	
	public static LoginUser getUser(String email) {
		
		EntityManager entityManager = JPAUtil.getEntityManager();
		LoginUserDao loginUserDao = new LoginUserDao(entityManager);
		entityManager.getTransaction().begin();
		LoginUser user = loginUserDao.getUser(email);
		entityManager.close();
		
		return user;
	}
	
}
