package com.stefanini.projeto.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.ManyToOne;

@Entity
public class Linhas {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private Integer id;
	
	@Column
	private String nomeLinha;
	
	@Column
	private int numeroLinha;
	
	/*@ManyToOne
	@Column
	private Folha folha;*/
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNomeLinha() {
		return nomeLinha;
	}
	public void setNomeLinha(String nomeLinha) {
		this.nomeLinha = nomeLinha;
	}
	public int getNumeroLinha() {
		return numeroLinha;
	}
	public void setNumeroLinha(int numeroLinha) {
		this.numeroLinha = numeroLinha;
	}
	
	/*public Folha getFolha() {
		return folha;
	}
	public void setFolha(Folha folha) {
		this.folha = folha;
	}*/
	
	

}
