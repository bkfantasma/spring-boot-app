package br.gov.sp.fatec.springbootapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;

import br.gov.sp.fatec.springbootapp.controller.View;

@Entity
@Table(name = "produto")
public class Produto {

    @JsonView(View.ProdutoCompleto.class)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long ID;

    @JsonView(View.ProdutoResumo.class)
    @Column(name = "descricao")
    private String descricao;

    @JsonView(View.ProdutoResumo.class)
    @Column(name = "valor_compra")
    private Float valorCompra;

    @JsonView(View.ProdutoResumo.class)
    @Column(name = "valor_venda")
    private Float valorVenda;

    @JsonView(View.ProdutoResumo.class)
    @Column(name = "status")
    private Boolean status;

    @JsonView(View.ProdutoResumo.class)
    @ManyToOne(fetch = FetchType.EAGER, optional = true)
    @JoinColumn(name = "id_estoque", nullable = true) 
    private Estoque estoque;

    public Long getID() {
        return this.ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = (String) descricao;
    }

    public Float getValorCompra() {
        return (Float) this.valorCompra;
    }

    public void setValorCompra(Float valorCompra) {
        this.valorCompra = (Float) valorCompra;

    }
 
    public Float getValorVenda() {
        return (Float) this.valorVenda;
    }

    public void setValorVenda(Float valorVenda) {
        this.valorVenda = (Float) valorVenda;
    }

    public Boolean getStatus() {
        return this.status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Estoque getEstoque() {
        return this.estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

}