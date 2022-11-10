package com.ty.onttomanybi1.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onttomanybi1.dto.Phone;
import com.ty.onttomanybi1.dto.Sim;

public class SimDao {
	public void saveSim(Sim sim) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("map");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();

		entityManager.persist(sim);
		Phone phone = sim.getPhone();
		entityManager.persist(phone);
		entityTransaction.commit();
	}
}