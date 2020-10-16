package br.gov.sp.fatec.springbootapp.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.springbootapp.entity.Produto;
import br.gov.sp.fatec.springbootapp.exception.RegistroNaoEncontradoException;
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

    @Override
    public List<Produto> buscarTodosProdutos(){
        return produtoRepo.findAll();
    }

    @Override
    public Produto buscaProdutoId(Long ID) {
        Optional<Produto> produtoOp = produtoRepo.findById(ID);
        if(produtoOp.isPresent()){
            return produtoOp.get();
        }
        throw new RegistroNaoEncontradoException("Produto não encontrado");
    }

    @Override
    public Produto buscaPorDescricao(String descricao){
        Produto produto =produtoRepo.findByDescricao(descricao);
        if(produto != null){
            return produto;
        }
        throw new RegistroNaoEncontradoException("Produto não encontrado");
    }
}