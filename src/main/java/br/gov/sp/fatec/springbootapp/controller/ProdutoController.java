package br.gov.sp.fatec.springbootapp.controller;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonView;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.fatec.springbootapp.entity.Produto;
import br.gov.sp.fatec.springbootapp.service.SegurancaService;

@RestController
@RequestMapping(value = "/produto")
@CrossOrigin
public class ProdutoController {

    @Autowired
    private SegurancaService segurancaService;

    @JsonView(View.ProdutoResumo.class)
    @GetMapping
    public List<Produto> buscarTodosProdutos() {
        return segurancaService.buscarTodosProdutos();
    }

    @JsonView(View.ProdutoCompleto.class)
    @GetMapping(value = "/{id}")
    public Produto buscaPorId(@PathVariable("id") Long ID) {
        return segurancaService.buscaProdutoId(ID);
    }

    @JsonView(View.ProdutoResumo.class)    
    @GetMapping(value = "/descricao")
    public Produto buscarPorDescricao(@RequestParam(value = "descricao") String descricao){
        return segurancaService.buscaPorDescricao(descricao);
    }
    
    @JsonView(View.ProdutoResumo.class)
    @PostMapping
    public Produto cadastroNovoProduto(@RequestBody Produto produto){
        return segurancaService.criarProduto(produto.getDescricao(), produto.getValorVenda(), produto.getValorCompra(), produto.getStatus());
    }
}
