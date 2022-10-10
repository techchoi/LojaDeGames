package com.generation.lojaDeGames.repository;


import com.generation.lojaDeGames.model.ProdutosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProdutosRepository extends JpaRepository<ProdutosModel, Long> {
    public List<ProdutosModel> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);
}
