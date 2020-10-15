package br.gov.sp.fatec.springbootapp.service;

import br.gov.sp.fatec.springbootapp.entity.Produto;

public interface SegurancaService {

    public Produto criarProduto(String descricao, float valorVenda, float valorCompra, boolean status);
    
}