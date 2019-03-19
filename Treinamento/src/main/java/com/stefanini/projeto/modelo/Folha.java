package com.stefanini.projeto.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Folha {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private Integer id;
	
	@Column
	private String nome;
	
	@Enumerated(EnumType.STRING)
	@Column
	private TamanhoFolha tamanho;
	
	@OneToMany //(mappedBy = "folha")
	@Column
	private List<Linhas> linhas;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public TamanhoFolha getTamanho() {
		return tamanho;
	}
	public void setTamanho(TamanhoFolha tamanho) {
		this.tamanho = tamanho;
	}
	public List<Linhas> getLinhas() {
		return linhas;
	}
	public void setLinhas(List<Linhas> linhas) {
		this.linhas = linhas;
	}
	

	


	}
