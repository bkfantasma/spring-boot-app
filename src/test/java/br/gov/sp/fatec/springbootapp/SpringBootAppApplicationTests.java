package br.gov.sp.fatec.springbootapp;

//import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
//import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;
//import br.gov.sp.fatec.springbootapp.entity.Estoque;
import br.gov.sp.fatec.springbootapp.entity.Produto;
import br.gov.sp.fatec.springbootapp.repository.ProdutoRepository;
//import br.gov.sp.fatec.springbootapp.repository.EstoqueRepository;

@SpringBootTest
@Transactional
@Rollback
class SpringBootAppApplicationTests {

    @Autowired
    private ProdutoRepository produtoRepo;

//    @Autowired
//    private EstoqueRepository estoqueRepo;

//	@Test
//	void contextLoads() {
//	}

    @Test
    void testeInsercao() {
        Produto produto = new Produto();
        produto.setDescricao("embalagem");
        produto.setValorCompra(1.0);
        produto.setValorVenda(5.0);
        produto.setStatus(true);
        produtoRepo.save(produto);
        assertNotNull(produto.getID());
    }

    /*@Test
    void buscaProduto(){
        List<Produto> produtos = produtoRepo.findByDescricaoContainsIgnoreCase("E");
        assertFalse(produtos.isEmpty());
    }

    @Test
    void buscaProdutoDescicao(){
        Produto produto = produtoRepo.findByDescricao("embalagem");
        assertNotNull(produto);
    }

    @Test
    void buscaValores(){
        Produto produto = produtoRepo.findByValorVendaAndValorCompra(10.00, 15.00);
        assertNotNull(produto);
    }

    @Test
    void buscaQtdEstoque(){
        Estoque estoque = estoqueRepo.findByQuantidade(1);
        assertNotNull(estoque);
    }

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