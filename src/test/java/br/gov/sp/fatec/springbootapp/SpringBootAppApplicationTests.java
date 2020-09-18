package br.gov.sp.fatec.springbootapp;

import static org.junit.Assert.assertNotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.gov.sp.fatec.springbootapp.Entity.Produto;
import br.gov.sp.fatec.springbootapp.Repository.ProdutoRepository;

@SpringBootTest
class SpringBootAppApplicationTests {

    @Autowired
    private ProdutoRepository produtoRepo;

	@Test
	void contextLoads() {
	}

    @Test
    void testeInsercao() {
        final Produto produto = new Produto();
        produto.setDescricao("embalagem");
        produto.setValorCompra(10,00);
        produtoRepo.save(produto);
        assertNotNull(produto.getID());
    }

}
