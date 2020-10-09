package br.gov.sp.fatec.springbootapp.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estoque")
public class Estoque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long ID;

    @Column(name = "DATA_ENTRADA_PRODUTO")
    private Calendar dataEntradaProduto;

    @Column(name = "DATA_SAIDA_PRODUTO")
    private Calendar dataSaidaProduto;

    @Column(name = "QUANTIDADE")
    private long quantidade;
    
    @Column(name = "ID_PRODUTO") 
    private long idProduto;
    
    public Long getID() {
        return this.ID;
    }
    public void setID(final Long ID) {
        this.ID = ID;
    } 

    public Calendar getDataEntradaProduto() {
        return this.dataEntradaProduto;
    }

    public void setDataEntradaProduto(final Calendar dataEntradaProduto) {
        this.dataEntradaProduto = dataEntradaProduto;
    }

    public Calendar getDataSaidaProduto() {
        return this.dataSaidaProduto;
    }

    public void setDataSaidaProduto(final Calendar dataSaidaProduto) {
        this.dataSaidaProduto = dataSaidaProduto;
    }

    public Long getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(final Long quantidade) {
        this.quantidade = quantidade;
    }

     public Long getIdProduto(){
        return this.idProduto;
    }
    public void setIdProduto(final Long idProduto) {
        this.idProduto = idProduto;
    } 

    public Object getEstoques() {
        return null;
    }
}