package br.gov.sp.fatec.springbootapp.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;

import br.gov.sp.fatec.springbootapp.controller.View;

@Entity
@Table(name = "estoque")
public class Estoque {

    @JsonView(View.EstoqueCompleto.class)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long ID;

    @JsonView(View.EstoqueResumo.class)
    @Column(name = "data_entrada_produto")
    private Calendar dataEntradaProduto;

    @JsonView(View.EstoqueResumo.class)
    @Column(name = "data_saida_produto")
    private Calendar dataSaidaProduto;


    @JsonView(View.EstoqueResumo.class)
    @Column(name = "quantidade")
    private long quantidade;
    
    @JsonView(View.EstoqueResumo.class)
    @ManyToOne
    @JoinColumn(name = "id_produto") 
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