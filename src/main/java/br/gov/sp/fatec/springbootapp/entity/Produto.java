package br.gov.sp.fatec.springbootapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUTO")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long ID;

    @Column(name = "DESCRICAO")
    private String descricao;

    @Column(name = "VALOR_COMPRA")
    private double valorCompra;

    @Column(name = "VALOR_VENDA")
    private double valorVenda;

    @Column(name = "STATUS")
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

    public Float getValorCompra(){
        return (float) this.valorCompra;
    }
   
    public void setValorCompra(double valorCompra) {
        this.valorCompra = (float) valorCompra;
    }

    public Float getValorVenda(){
        return (float) this.valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorCompra = (float) valorVenda;
    }

    public Boolean getStatus(){
        return this.status;
    }
    public void setStatus(Boolean status){
        this.status = status;
    }
}