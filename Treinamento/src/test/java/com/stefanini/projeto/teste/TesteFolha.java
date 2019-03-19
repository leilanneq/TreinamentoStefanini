package com.stefanini.projeto.teste;

import java.util.Arrays;

import javax.persistence.EntityManager;

import com.stefanini.projeto.modelo.Folha;
import com.stefanini.projeto.modelo.Linhas;
import com.stefanini.projeto.modelo.TamanhoFolha;
import com.stefanini.projeto.util.HibernateUtil;


public class TesteFolha {

	public static void main(String[] args) {
		
		Linhas linha = new Linhas();
		linha.setNumeroLinha(20);
		linha.setNomeLinha("Linha1");
		
		Linhas linha2 = new Linhas();
		linha.setNumeroLinha(50);
		linha.setNomeLinha("Linha2");
		
		Folha folha = new Folha();
		folha.setNome("Folha1");
		folha.setTamanho(TamanhoFolha.A4);
		folha.setLinhas(Arrays.asList(linha,linha2));
		

		
		EntityManager em = new HibernateUtil().getEntityManager();

		em.getTransaction().begin();
		
		em.persist(linha);
		em.persist(folha);

		
		em.getTransaction().commit();

		em.close();
		
		
	}

}
