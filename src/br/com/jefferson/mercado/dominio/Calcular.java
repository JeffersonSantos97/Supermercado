package br.com.jefferson.mercado.dominio;

import java.util.List;

public class Calcular {

    // Passei como parametro qualquer lista que extenda de lista
    // usei o static pra não precisar instanciar no meu Supermecado
    public static double calcularMedia(List<? extends Produto> list ) {

        double total = 0.0;

        for(int i = 0; i < list.size(); i++ ) {

            total += list.get(i).getPreco();
        }
        return total / list.size();
    }

    public static double maiorPreco(List<? extends Produto> list){
        double maior = Integer.MIN_VALUE;
        for(int i = 0; i < list.size(); i++){

            if(list.get(i).getPreco() > maior){

                maior = list.get(i).getPreco();
            }
        }

        return maior;
    }

    public static double menorPreco(List<? extends Produto> list){
        double menor = Integer.MAX_VALUE;

        // IMPLEMENTAR A LOGICA DO MENOR VALOR

        for(int i = 0; i < list.size(); i++) {

            if(list.get(i).getPreco() < menor ) {

                menor = list.get(i).getPreco();
            }
        }
        return menor;
    }
}
