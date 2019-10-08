package br.edu.infnet.locaapp.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sala {
	
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nome;
	
	private Boolean locada;
	
	public Sala() {
		super();
	}

	public Sala(Integer id, String nome, Boolean locada) {
		super();
		this.id = id;
		this.nome = nome;
		this.locada = locada;
	}

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

	public Boolean getLocada() {
		return locada;
	}

	public void setLocada(Boolean locada) {
		this.locada = locada;
	}
	
	
	
}
