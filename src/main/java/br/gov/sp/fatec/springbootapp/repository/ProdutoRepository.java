package br.gov.sp.fatec.springbootapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.gov.sp.fatec.springbootapp.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
    
}