package br.gov.sp.fatec.springbootapp.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.springbootapp.entity.Produto;
import br.gov.sp.fatec.springbootapp.repository.ProdutoRepository;

@Transactional
@Service("SegurancaService")
public class SegurancaServiceImpl implements SegurancaService {

    @Autowired
    private ProdutoRepository produtoRepo;

    @Override
    public Produto criarProduto(String descricao, float valorVenda, float valorCompra, boolean status) {
        final Produto produto = new Produto();
        produto.setDescricao(descricao);
        produto.setValorCompra(valorCompra);
        produto.setValorVenda(valorVenda);
        produto.setStatus(status);
        produtoRepo.save(produto);
        return produto;
    }
    
}