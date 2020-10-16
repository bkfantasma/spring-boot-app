package br.gov.sp.fatec.springbootapp.service;

import java.util.List;

import br.gov.sp.fatec.springbootapp.entity.Produto;

public interface SegurancaService {

    public Produto criarProduto(String descricao, float valorVenda, float valorCompra, boolean status);

    public List<Produto> buscarTodosProdutos();

    //public Produto buscaProdutoId(Long ID);
    
}