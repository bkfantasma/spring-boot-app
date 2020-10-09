package br.gov.sp.fatec.springbootapp;

//import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import br.gov.sp.fatec.springbootapp.entity.Estoque;
//import br.gov.sp.fatec.springbootapp.entity.Estoque;
import br.gov.sp.fatec.springbootapp.entity.Produto;
import br.gov.sp.fatec.springbootapp.repository.ProdutoRepository;
import br.gov.sp.fatec.springbootapp.repository.EstoqueRepository;

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
        Produto produto = new Produto();
        produto.setDescricao("embalagem");
        produto.setValorCompra(10.00);
        produto.setValorVenda(10.50);
        produto.setStatus(true);
        produtoRepo.save(produto);
        assertNotNull(produto.getID());
    }

//    @Test
//    void testeProduto() {
//        Produto produto = produtoRepo.findById(1L).get();
//        assertEquals("embalagem", produto.getProduto().iterator().next().getDescricao());
//    }

//    @Test
//    void testaEstoque() {
//        Estoque estoque = estoqueRepo.findById(1L).get();
//        assertEquals("1", estoque.getEstoques().iterator().next().getQuantidade());
//    }

    @Test
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
        Estoque estoque = estoqueRepo.findByEstoqueQuantidade(1);
        assertNotNull(estoque);
    }
    
}