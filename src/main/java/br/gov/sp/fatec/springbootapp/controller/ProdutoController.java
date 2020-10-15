package br.gov.sp.fatec.springbootapp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.fatec.springbootapp.entity.Produto;
import br.gov.sp.fatec.springbootapp.service.SegurancaService;

@RestController
@RequestMapping(value = "/produto")
public class ProdutoController {

    private SegurancaService segurancaService;

    @GetMapping(value = "/todos")
    public List<Produto> buscarTodosProdutos() {
        return segurancaService.buscarTodosProdutos();
    }
    
}