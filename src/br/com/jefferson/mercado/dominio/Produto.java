package br.com.jefferson.mercado.dominio;

public abstract class Produto {

    private String nome;
    private Double preco;
    private String dataValidade;

    public Produto(String nome, Double preco, String dataValidade){

        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    // para mostrar tod conteudo de cada classe

    // coloquei a classe abstract pra dar erro nas outras classes que forem usar
    // poderia colocar sem o abstratc pq já estou em uma classe abstrata
    public abstract String toString();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }


}
