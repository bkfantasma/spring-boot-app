package br.gov.sp.fatec.springbootapp.Entity;

public class Produto {
    private Long ID;
    private String descricao;
    private Float valorCompra;
    private Float valorVenda;
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
        return this.valorCompra;
    }
    public void setValorCompra(Float valorCompra){
        this.valorCompra = valorCompra;
    }

    public Float getValorVenda(){
        return this.valorVenda;
    }
    public void getValorVenda(Float valorVenda){
        this.valorVenda = valorVenda;
    }

    public Boolean getStatus(){
        return this.status;
    }
    public void getStatus(Boolean status){
        this.status = status;
    }
	public void setValorCompra(int i, int j) {
		// TODO Auto-generated method stub
		
	}

}