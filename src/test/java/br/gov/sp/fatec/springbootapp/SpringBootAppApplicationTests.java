package br.gov.sp.fatec.springbootapp;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import br.gov.sp.fatec.springbootapp.entity.Estoque;

import br.gov.sp.fatec.springbootapp.entity.Produto;
import br.gov.sp.fatec.springbootapp.repository.EstoqueRepository;
import br.gov.sp.fatec.springbootapp.repository.ProdutoRepository;

@SpringBootTest
@Transactional
@Rollback
class SpringBootAppApplicationTests {

    @Autowired
    private ProdutoRepository produtoRepo;

    @Autowired
    private EstoqueRepository estoqueRepo;

	@Test
	void contextLoads() {
	}

    @Test
    void testeInsercao() {
        final Produto produto = new Produto();
        produto.setDescricao("embalagem");
        produto.setValorCompra((float) 10.0);
        produto.setValorVenda((float) 15.0);
        produto.setStatus(true);
        produtoRepo.save(produto);
        assertNotNull(produto.getID());
    }

    @Test
    void buscaProduto() {
        final List<Produto> produtos = produtoRepo.findByDescricaoContainsIgnoreCase("E");
        assertFalse(produtos.isEmpty());
    } 

    @Test
        void buscaValores(){
            produtoRepo.findByValorVendaAndValorCompra((float) 10.0, (float) 15.0);
        }

    @Test
    void buscaQtdEstoque(){
        Estoque estoque = estoqueRepo.findByQuantidade(1);
        assertNotNull(estoque.getQuantidade());
    }
    
    @Test
    void buscaProdutoDescicao(){
        produtoRepo.findByDescricao("embalagem");
    }
    
    /*
    
    @Test
    void buscaProdutoDescicaoQuery(){
        Produto produto = produtoRepo.buscaPorProduto("embalagem");
        assertNotNull(produto);
    }
    
    @Test
    void buscaValoresQuery(){
        Produto produto = produtoRepo.BuscaProdutoValores(10.00, 15.00);
        assertNotNull(produto);
    }*/
   



}