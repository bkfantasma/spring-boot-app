package br.gov.sp.fatec.springbootapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.gov.sp.fatec.springbootapp.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    public Produto findByValorVendaAndValorCompra(Float valorCompra, Float valorVenda);

    public Produto findByDescricao(String descricao);

    public List<Produto> findByDescricaoContainsIgnoreCase(String descricao);

    @Query("select p from Produto p where p.valorVenda = ?1 and p.valorCompra = ?2")
    public Produto buscaProdutoValores(Float valorVenda, Float valorCompra);

    @Query("select p from Produto p where p.descricao = ?1")
    public Produto buscaPorProduto(String descricao);

    @Query("select e from estoque inner join e.id_produto p where p.id = ?1")
    public List<Produto> busca(long id);
    
}