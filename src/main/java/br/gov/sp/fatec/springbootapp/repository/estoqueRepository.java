package br.gov.sp.fatec.springbootapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.fatec.springbootapp.entity.Estoque;
import br.gov.sp.fatec.springbootapp.entity.Produto;

public interface estoqueRepository extends JpaRepository<Produto, Long> {

    Estoque findByEstoqueQuantidade(int i);
    
}