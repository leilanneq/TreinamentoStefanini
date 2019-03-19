package com.stefanini.projeto.service;

import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.stefanini.projeto.dao.FolhaDAO;
import com.stefanini.projeto.modelo.Folha;
import com.stefanini.projeto.modelo.Linhas;
import com.stefanini.projeto.util.HibernateUtil;

public class FolhaService {
	
	@Inject
	FolhaDAO folhaDao;
	EntityManager em = new HibernateUtil().getEntityManager();
	
	public List<Folha> findAll(){
		
		return folhaDao.pesquisaFolhas();

	}
	 public Folha pesquisaID(final int id) {
		 return em.find(Folha.class, id);
	 }
	 
	 public void cadastraFolha(Folha folha) {
		 
			em.getTransaction().begin();
			em.persist(folha);
			em.getTransaction().commit();
		 
	 }
	 
	 public void cadastraLinhas(Linhas linhas) {
		 
			em.getTransaction().begin();
			em.persist(linhas);
			em.getTransaction().commit();
		 
	 }
	 
	 public void editarFolha(Folha folha) {
		 
			em.getTransaction().begin();
			em.persist(folha);
			em.getTransaction().commit();
		 
	 }
	 public void editarLinhas(Linhas linhas) {
		 
			em.getTransaction().begin();
			em.persist(linhas);
			em.getTransaction().commit();
		 
	 }
	 
	 
	 public void removerFolha(Folha folha) {
		 em.getTransaction().begin();
		 folha = em.find(Folha.class, folha.getId());
		 em.remove(folha);
		 em.getTransaction().commit();
	 }
	//Classe Service que evoca o repositório e contém a lógica de negócio do 
	//projeto para deixar o código da classe controller enxuto e mais limpo),
	
}
