package com.gamestore.GameStoreG6.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gamestore.GameStoreG6.model.CategoriaModel;

public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long>{
	

	@Query(value= 
	"SELECT c.genero, COUNT(categoria_id) AS Quantidade FROM tb_categoria AS c\r\n"
	+ "INNER JOIN tb_produto AS p ON p.categoria_id = c.id\r\n"
	+ "GROUP BY c.genero ORDER BY quantidade DESC;", nativeQuery = true)
	List<GeneroDashboard>getDashGenero();
	
	public List<CategoriaModel> findAllByGeneroContainingIgnoreCase (String genero);

	
	
	
}
