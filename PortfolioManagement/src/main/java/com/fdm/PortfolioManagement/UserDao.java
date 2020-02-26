package com.fdm.PortfolioManagement;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

public class UserDao {

	private EntityManagerFactory emf;
	
	public UserDao(EntityManagerFactory mockEmf) {
		emf=mockEmf;
	}

	public void save(User User) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(User);
		et.commit();
		em.close();
	}
	
	public String getName(String username) {
		
		EntityManager em = emf.createEntityManager();
		String name = em.find(User.class, username).getFirstname() + " ";
		name += em.find(User.class, username).getLastname();
		return name;
	}
	public String getUser(String Username) {
		
		EntityManager em = emf.createEntityManager();
		String name = em.find(User.class, Username).getFirstname() + " ";
		name += em.find(User.class, Username).getLastname();
		return name;
	}
	public void updateName(String username,String Firstname,String LastName) {
		
		EntityManager em = emf.createEntityManager();
		User user = em.find(User.class, username);
		EntityTransaction et = em.getTransaction();
		et.begin();
		user.setFirstname(Firstname);
		user.setLastname(LastName);
		et.commit();
		em.close();
	}
public String getUserByFullName(String FirstName,String LastName) {
	EntityManager em = emf.createEntityManager();
	Query query = em.createQuery("SELECT username FROM users", User.class);

	List<User> allUsers = query.getResultList();

	for(User user : allUsers) {
		if(user.getFirstname().equals(FirstName)&&user.getLastname().equals(LastName))
			return user.getUserName();

	}
	return null;
	
}

}
