package com.gamestore.GameStoreG6.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name ="tb_categoria")

public class CategoriaModel {
 
		@Id
		@GeneratedValue(strategy= GenerationType.IDENTITY)
		private Long id;
		
		@NotNull
		private String genero;
		
		@NotNull
		private String estudio;

		@OneToMany(mappedBy="categoria", cascade=CascadeType.ALL)
		@JsonIgnoreProperties("categoria")
		private List <ProdutoModel> produto;
		
		// GETTERS & SETTERS
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getGenero() {
			return genero;
		}

		public void setGenero(String genero) {
			this.genero = genero;
		}

		public String getEstudio() {
			return estudio;
		}

		public void setEstudio(String estudio) {
			this.estudio = estudio;
		}

		public List<ProdutoModel> getProduto() {
			return produto;
		}

		public void setProduto(List<ProdutoModel> produto) {
			this.produto = produto;
		}
		
}
