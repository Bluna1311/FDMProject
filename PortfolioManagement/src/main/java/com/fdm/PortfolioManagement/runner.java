package com.fdm.PortfolioManagement;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class runner {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa_Project1");
		
		Portfolio p = new Portfolio();
		Portfolio p1 = new Portfolio();
		Portfolio p2= new Portfolio();
		Portfolio p3 = new Portfolio();
		Portfolio p4 = new Portfolio();
		Portfolio p5 = new Portfolio();
		Portfolio p6 = new Portfolio();
		
		
		User user1 = new User("brian1","brian","luna","Email","Q1","A1","Q2","A2",24,p);
		User user2 = new User("brian2","brianfn2","luna2","Email","Q11","A11","Q21","A21",24,p1);
		User user3 = new User("brian3","brianfn3","luna3","Email","Q12","A12","Q22","A22",24,p2);
		User user4 = new User("brian4","brianfn4","luna4","Email","Q13","A13","Q23","A23",24,p3);
		User user5 = new User("brian5","brianfn5","luna5","Email","Q14","A14","Q24","A24",24,p4);
		User user6 = new User("brian6","brianfn6","luna6","Email","Q15","A15","Q25","A25",24,p5);
		User user7 = new User("brian7","brianfn7","luna7","Email","Q16","A16","Q26","A26",24,p6);
		
		UserDao uDao = new UserDao(emf);
		uDao.save(user1);
		uDao.save(user2);
		uDao.save(user3);
		uDao.save(user4);
		uDao.save(user5);
		uDao.save(user6);
		uDao.save(user7);
		uDao.updateName("brian1", "BrianHasBeen", "UpdatedInThisObject");
	}

}
