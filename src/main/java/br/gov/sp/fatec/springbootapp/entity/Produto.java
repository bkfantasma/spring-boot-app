package br.gov.sp.fatec.springbootapp.entity;

import java.text.DecimalFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produto")
public class Produto {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long ID;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "valor_compra")
    private DecimalFormat valorCompra;

    @Column(name = "valor_venda")
    private DecimalFormat valorVenda;

    @Column(name = "status")
    private Boolean status;

    public Long getID(){
        return this.ID;
    }
    public void setID(Long ID){
        this.ID = ID;
    }

    public String getDescricao(){
        return this.descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public DecimalFormat getValorCompra() {
        return (DecimalFormat) this.valorCompra;
    }
   
    public void setValorCompra(Number valorCompra) {
        this.valorCompra = (DecimalFormat) this.valorCompra;
    }

    public DecimalFormat getValorVenda() {
        return (DecimalFormat) this.valorVenda;
    }

    public void setValorVenda(Number valorVenda) {
        this.valorCompra = (DecimalFormat) this.valorVenda;
    }

    public Boolean getStatus(){
        return this.status;
    }
    public void setStatus(Boolean status){
        this.status = status;
    }
}