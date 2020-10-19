package br.gov.sp.fatec.springbootapp.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.fatec.springbootapp.entity.Estoque;

public interface EstoqueRepository extends JpaRepository<Estoque, Long> {

    public Estoque findByQuantidade(Long quantidade);
    
}