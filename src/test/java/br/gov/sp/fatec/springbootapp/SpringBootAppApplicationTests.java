package br.gov.sp.fatec.springbootapp;

import static org.junit.Assert.assertNotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import br.gov.sp.fatec.springbootapp.entity.Produto;

@SpringBootTest
@Transactional
@Rollback
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
       // produtoRepo.save(produto);
        assertNotNull(produto.getID());
    }

}
