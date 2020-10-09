package br.gov.sp.fatec.springbootapp.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import javafx.scene.chart.PieChart.Data;

@Entity
@Table(name = "ESTOQUE")
public class Estoque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long ID;

    @Column(name = "DATA_ENTRADA_PRODUTO")
    private Data dataEntradaProduto;

    @Column(name = "DATA_SAIDA_PRODUTO")
    private Data dataSaidaProduto;

    @Column(name = "QUANTIDADE")
    private long quantidade;
    
    @Column(name = "ID_PRODUTO") 
    private long idProduto;

    @ManyToMany(fetch = FetchType.EAGER)
        @JoinTable(name = "PRODUTO", 
            joinColumns = { @JoinColumn(name= "ID_PRODUTO")},
            inverseJoinColumns = {@JoinColumn(name= "ID")}
        )
    private Set<Produto> produtos;
    
    public Long getID() {
        return this.ID;
    }
    public void setID(final Long ID) {
        this.ID = ID;
    } 
        

    public Data getDataEntradaProduto() {
        return this.dataEntradaProduto;
    }

    public void setDataEntradaProduto(final Data dataEntradaProduto) {
        this.dataEntradaProduto = dataEntradaProduto;
    }

    public Data getDataSaidaProduto() {
        return this.dataSaidaProduto;
    }

    public void setDataSaidaProduto(final Data dataSaidaProduto) {
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

    public Set<Produto> getProdutos() {
    return this.produtos;
    }
    public void setProdutos(Set<Produto> produtos) {
        this.produtos = produtos;
    } 
}