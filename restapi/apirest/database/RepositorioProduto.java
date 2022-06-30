package com.restapi.apirest.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi.apirest.entidade.Produto;

public interface RepositorioProduto extends JpaRepository<Produto,Long> {
    
}
