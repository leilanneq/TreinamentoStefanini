package com.stefanini.projeto.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtil {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("treinamento");


	public EntityManager getEntityManager() {
		return emf.createEntityManager();
	}
}
