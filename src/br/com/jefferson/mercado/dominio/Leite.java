package br.com.jefferson.mercado.dominio;

public class Leite extends Produto{

    Integer validadeLeite;

    public Leite(String nome, Double preco, String dataValidade, Integer validadeLeite){

        super(nome, preco, dataValidade);
        this.validadeLeite = validadeLeite;
    }

    public String toString(){

        return "Produto: Leite, Preco : " + getPreco() + ", Data de Validade : " + getDataValidade() +

                "Validade depois de embalado : " + validadeLeite;
    }

    public Integer getValidadeLeite() {
        return validadeLeite;
    }

    public void setValidadeLeite(Integer validadeLeite) {
        this.validadeLeite = validadeLeite;
    }
}
