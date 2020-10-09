package br.gov.sp.fatec.springbootapp.entity;

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
    private Number valorCompra;

    @Column(name = "valor_venda")
    private Number valorVenda;

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

    public Float getValorCompra(){
        return (float) this.valorCompra;
    }
   
    public void setValorCompra(Number valorCompra) {
        this.valorCompra = valorCompra;
    }

    public Float getValorVenda(){
        return (float) this.valorVenda;
    }

    public void setValorVenda(Number valorVenda) {
        this.valorCompra = valorVenda;
    }

    public Boolean getStatus(){
        return this.status;
    }
    public void setStatus(Boolean status){
        this.status = status;
    }

    public Object getProduto() {
        return null;
    }

}