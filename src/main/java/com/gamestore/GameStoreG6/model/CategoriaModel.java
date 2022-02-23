package com.gamestore.GameStoreG6.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

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

		
		
		// GETERS & SETTERS
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
		
		
		
		
	
}
