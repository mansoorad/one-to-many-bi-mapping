package com.ty.onttomanybi1.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onttomanybi1.dto.Phone;
import com.ty.onttomanybi1.dto.Sim;

public class PhoneDao {
	public void savePhone(Phone phone) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("map");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(phone);
		List<Sim> sims = phone.getSims();
		for(Sim sim : sims) {
			entityManager.persist(sim);
		}
		entityTransaction.commit();
	}
}
