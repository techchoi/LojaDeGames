package com.generation.lojaDeGames.repository;

import com.generation.lojaDeGames.model.CategoriasModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CategoriasRepository extends JpaRepository<CategoriasModel, Long> {
    public List<CategoriasModel> findAllByDescricaoContainingIgnoreCase(@Param("descricao") String descricao);
}
