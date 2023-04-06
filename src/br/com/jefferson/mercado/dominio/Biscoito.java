package br.com.jefferson.mercado.dominio;


public class Biscoito extends Produto{

    private Integer compCancer;
    private String test;

    public Biscoito(String nome, Double preco, String dataValidade, Integer compCancer){

        super(nome,preco,dataValidade);
        this.compCancer = compCancer;
    }

    public String toString(){

        return "Produto: Biscoito, Preco : " + getPreco() + ", Data de Validade : " + getDataValidade() +
                ", Componente Cancerigeno : " + compCancer;
    }

    public Integer getCompCancer(){

        return compCancer;
    }

    public void setCompCancer(Integer compCancer) {

        this.compCancer = compCancer;
    }


}
