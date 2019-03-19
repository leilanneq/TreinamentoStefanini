package com.stefanini.projeto.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.stefanini.projeto.modelo.Folha;
import com.stefanini.projeto.modelo.Linhas;
import com.stefanini.projeto.util.HibernateUtil;


public class FolhaDAO {
	
	EntityManager em = new HibernateUtil().getEntityManager();
	
	String busca = "select distinct f from Folha f left join f.linhas";

	Query query = em.createQuery(busca, Folha.class);
	
	 public List<Folha> pesquisaFolhas() { 
		 
		 return query.getResultList();
	}
	 
	
}
