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
    @Column(name = "id")
    private Long ID;

    @Column(name = "data_entrada_produto")
    private Calendar dataEntradaProduto;

    @Column(name = "data_saida_produto")
    private Calendar dataSaidaProduto;

    @Column(name = "quantidade")
    private long quantidade;
    
    @Column(name = "id_produto") 
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

    public void setDataEntradaProduto(Calendar dataEntradaProduto) {
        this.dataEntradaProduto = dataEntradaProduto;
    }

    public Calendar getDataSaidaProduto() {
        return this.dataSaidaProduto;
    }

    public void setDataSaidaProduto(Calendar dataSaidaProduto) {
        this.dataSaidaProduto = dataSaidaProduto;
    }

    public Long getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(Long quantidade) {
        this.quantidade = quantidade;
    }

    public Long getIdProduto(){
        return this.idProduto;
    }
    public void setIdProduto(Long idProduto) {
        this.idProduto = idProduto;
    } 
}