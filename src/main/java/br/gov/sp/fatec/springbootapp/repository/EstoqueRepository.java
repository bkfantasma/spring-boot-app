package br.gov.sp.fatec.springbootapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.fatec.springbootapp.entity.Produto;

public interface EstoqueRepository extends JpaRepository<Produto, Long> {
    
}