package br.gov.sp.fatec.springbootapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.fatec.springbootapp.entity.Produto;
//import javafx.scene.chart.PieChart.Data;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

    public List<Produto> findByDescricaoContainsIgnoreCase(String descricao);

    public Produto findByDescricao(String descricao);

    public Produto findByValorVendaAndValorCompra(double d, double e);

    public List<Produto> findByEstoqueQuantidade(long estoque);
    
}