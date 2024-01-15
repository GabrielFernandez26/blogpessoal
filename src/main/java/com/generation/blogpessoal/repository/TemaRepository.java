package com.generation.blogpessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.blogpessoal.model.Tema;

public interface TemaRepository  extends JpaRepository<Tema, Long>{
	//Equivalente ao SELECT * FROM tb_temas WHERE descricao LIKE "%descricao%" do SQL
	List<Tema> findAllByDescricaoContainingIgnoreCase(@Param("descricao") String descricao);
}
