package com.restapi.apirest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.apirest.database.RepositorioProduto;
import com.restapi.apirest.entidade.Produto;

@RestController
@RequestMapping("/produto")
public class ProdutoRest {
 
 @Autowired
 private RepositorioProduto repositorio;

 @GetMapping
 public List<Produto>listar(){return repositorio.findAll();}

 @PostMapping
 public void salvar(@RequestBody Produto produto){repositorio.save(produto);}

 @PutMapping
 public void alterar(@RequestBody Produto produto){if(produto.getId() > 0) repositorio.save(produto);}

@DeleteMapping
public void excluir(@RequestBody Produto produto){repositorio.delete(produto);}

}
