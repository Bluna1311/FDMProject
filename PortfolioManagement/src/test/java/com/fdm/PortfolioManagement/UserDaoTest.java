package com.fdm.PortfolioManagement;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.when;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.junit.Test;
import org.mockito.InOrder;

public class UserDaoTest {

	@Test
	public void given_User_Entity_When_New_User_Then_User_Is_Persisted() {
		EntityManagerFactory mockEmf = mock(EntityManagerFactory.class);
		EntityManager mockEm = mock(EntityManager.class);
		EntityTransaction mockEt = mock(EntityTransaction.class);
		User mockUser1 = mock(User.class);
		when(mockEmf.createEntityManager()).thenReturn(mockEm);
		when(mockEm.getTransaction()).thenReturn(mockEt);
		UserDao uDao = new UserDao(mockEmf);
		uDao.save(mockUser1);
		InOrder order = inOrder(mockEt, mockEm, mockEmf);
		order.verify(mockEmf).createEntityManager();
		order.verify(mockEm).getTransaction();
		order.verify(mockEt).begin();
		order.verify(mockEm).persist(mockUser1);
		order.verify(mockEt).commit();
		order.verify(mockEm).close();
	}

	@Test
	public void given_Username_Return_Name() {
		EntityManagerFactory mockEmf = mock(EntityManagerFactory.class);
		EntityManager mockEm = mock(EntityManager.class);
		User mockUser1 = mock(User.class);
		when(mockEmf.createEntityManager()).thenReturn(mockEm);
		when(mockEm.find(User.class, "Username")).thenReturn(mockUser1);
		UserDao uDao = new UserDao(mockEmf);
		uDao.getName("Username");
		InOrder order = inOrder(mockEm, mockEmf);
		order.verify(mockEmf).createEntityManager();
		order.verify(mockEm, times(2)).find(User.class, "Username");
	}

	@Test
	public void given_User_Entity_Update() {
		EntityManagerFactory mockEmf = mock(EntityManagerFactory.class);
		EntityManager mockEm = mock(EntityManager.class);
		EntityTransaction mockEt = mock(EntityTransaction.class);
		User mockUser1 = mock(User.class);
		when(mockEmf.createEntityManager()).thenReturn(mockEm);
		when(mockEm.getTransaction()).thenReturn(mockEt);
		when(mockEm.find(User.class, mockUser1.getUserName())).thenReturn(mockUser1);
		UserDao uDao = new UserDao(mockEmf);
		uDao.updateName(mockUser1.getUserName(), "first", "last");
		InOrder order = inOrder(mockEt, mockEm, mockEmf);
		order.verify(mockEmf).createEntityManager();
		order.verify(mockEm).getTransaction();
		order.verify(mockEt).begin();
		// order.verify(mockEm).merge(mockUser1);
		order.verify(mockEt).commit();
		order.verify(mockEm).close();
	}


}
