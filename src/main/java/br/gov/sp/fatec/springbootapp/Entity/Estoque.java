package br.gov.sp.fatec.springbootapp.Entity;

import java.util.Date;

/*import java.util.Set;*/

import javax.persistence.Column;
import javax.persistence.Entity;
/*import javax.persistence.FetchType;*/
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/*import javax.persistence.JoinColumn;*/
/*import javax.persistence.JoinTable;*/
/*import javax.persistence.ManyToMany;*/
import javax.persistence.Table;

@Entity
@Table(name = "ESTOQUE")
public class Estoque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long ID;

    @Column(name = "DATA_ENTRADA_PRODUTO")
    private Date dataEntradaProduto;

    @Column(name = "DATA_SAIDA_PRODUTO")
    private Date dataSaidaProduto;

    @Column(name = "QUANTIDADE")
    private long quantidade;

    /*
     * @Column(name = "ID_PRODUTO") 
     * @ManyToMany(fetch = FetchType.EAGER)
     * @ManyToMany(fetch = FetchType.EAGER)
            @JoinTable(name = "Produto", 
                joinColumns = { @JoinColumn(name= "ID_PRODUTO")},
                inverseJoinColumns = {@JoinColumn(name= "ID")}
        )
     * private long idProduto;
       private Set<Item> itens;
       
       
       public Set<Item> getID(){
           return this.ID;
        }
        public void setID(final Long ID) {
            this.ID = ID;
        } 
        */

    public Long getID(){
        return this.ID;
    }
    public void setID(final Long ID) {
        this.ID = ID;
    }

    public Date getDataEntradaProduto() {
        return this.dataEntradaProduto;
    }

    public void setDataEntradaProduto(final Date dataEntradaProduto) {
        this.dataEntradaProduto = dataEntradaProduto;
    }

    public Date getDataSaidaProduto() {
        return this.dataSaidaProduto;
    }

    public void setDataSaidaProduto(final Date dataSaidaProduto) {
        this.dataSaidaProduto = dataSaidaProduto;
    }

    public Long getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(final Long quantidade) {
        this.quantidade = quantidade;
    }

    /* public Long getIdProduto(){
        return this.idProduto;
    }
    public void setIdProduto(Long idProduto){
        this.idProduto = idProduto;
    } */

}