package com.gamestore.GameStoreG6.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="tb_produto")
public class ProdutoModel {
	
	@Id
	@GeneratedValue( strategy= GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private String nome;
	
	public enum formato {
		Digital,Física
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
