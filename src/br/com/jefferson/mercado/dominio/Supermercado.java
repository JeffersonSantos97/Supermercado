package br.com.jefferson.mercado.dominio;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {

    public static void main(String[] args) {

        List<Shampoo> shampoos = new ArrayList<>();
        shampoos.add(new Shampoo("Dove", 14.50,"02/01/2023",7));
        shampoos.add(new Shampoo("Clear", 20.40, "01/01/1997", 8));
        shampoos.add(new Shampoo("Blue", 80.50, "02/03/2050", 1));

        double mediaShampoo = Calcular.calcularMedia(shampoos);
        double maiorPrecoShampoo = Calcular.maiorPreco(shampoos);
        double menorPrecoShampoo = Calcular.menorPreco(shampoos);

        System.out.println("Media : " + mediaShampoo);
        System.out.println("Maior Preco : " + maiorPrecoShampoo);
        System.out.println("Menor Preco : " + menorPrecoShampoo);

        System.out.println("--------");

        List<Biscoito> biscoitos = new ArrayList<>();
        biscoitos.add(new Biscoito("Trakinas", 2.50,"02/12/2024",1));
        biscoitos.add(new Biscoito("Passatempo", 4.40,"03/01/2024",2));
        biscoitos.add(new Biscoito("Piraque", 5.00, "15/01/1997", 0));

        double mediaBiscoito = Calcular.calcularMedia(biscoitos);
        double maiorPrecoBiscoito = Calcular.maiorPreco(biscoitos);
        double menorPrecoBiscoito = Calcular.menorPreco(biscoitos);
        System.out.println("Media Biscoitos: " + mediaBiscoito);
        System.out.println("Maior Preco : " + maiorPrecoBiscoito);
        System.out.println("Menor Preco : " + menorPrecoBiscoito);

        System.out.println("---------------------- ");

        List<Leite> leites = new ArrayList<>();
        leites.add(new Leite("Elege", 8.00, "15/01/1995", 10));
        leites.add(new Leite("Parmalate", 10.00, "16/01/2004", 8));
        leites.add(new Leite("Aurora", 4.00, "16/02/2025", 10));

        double mediaLeite = Calcular.calcularMedia(leites);
        double maiorPrecoLeite = Calcular.maiorPreco(leites);
        double menorPrecoLeite = Calcular.menorPreco(leites);
        System.out.println("Media leites : " + mediaLeite);
        System.out.println("Maior preco : " + maiorPrecoLeite);
        System.out.println("Menor preco : " + menorPrecoLeite);


    }
}
