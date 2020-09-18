package br.gov.sp.fatec.springbootapp.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

    public Long getID(){
        return this.ID;
    }
    public void setID(Long ID){
        this.ID = ID;
    }

    public Data getDataEntradaProduto(){
        return this.dataEntradaProduto;
    }
    public void setDataEntradaProduto(Data dataEntradaProduto) {
        this.dataEntradaProduto = dataEntradaProduto;
    }

    public Data getDataSaidaProduto(){
        return this.dataSaidaProduto;
    }
    public void setDataSaidaProduto(Data dataSaidaProduto) {
        this.dataSaidaProduto = dataSaidaProduto;
    }

    public Long getQuantidade(){
        return this.quantidade;
    }
    public void setQuantidade(Long quantidade) {
        this.quantidade = quantidade;
    }

    public Long getIdProduto(){
        return this.idProduto;
    }
    public void setIdProduto(Long idProduto){
        this.idProduto = idProduto;
    }

}