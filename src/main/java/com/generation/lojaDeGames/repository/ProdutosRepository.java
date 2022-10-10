package com.generation.lojaDeGames.repository;


import com.generation.lojaDeGames.model.ProdutosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutosRepository extends JpaRepository<ProdutosModel, Long> {
    public List<ProdutosModel> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);
}
