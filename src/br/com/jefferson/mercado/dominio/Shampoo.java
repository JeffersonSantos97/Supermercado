package br.com.jefferson.mercado.dominio;

public class Shampoo extends Produto{

    // atributos
    private Integer irritabilidade;

    // Construtor
    public Shampoo(String nome, Double preco, String dataValidade, Integer irritabilidade){

        super(nome, preco,dataValidade);
        this.irritabilidade = irritabilidade;
    }

    // toString

    public String toString(){

        return "Produto: Shampoo, Preco : " + getPreco() + ", Data de Validade : " + getDataValidade() +
                ", Irritabilidade : " + irritabilidade;
    }

    // metodos getter e setters
    public Integer getIrritabilidade() {
        return irritabilidade;
    }

    public void setIrritabilidade(Integer irritabilidade) {
        this.irritabilidade = irritabilidade;
    }
}
