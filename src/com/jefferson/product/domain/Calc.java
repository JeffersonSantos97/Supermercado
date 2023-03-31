package com.jefferson.product.domain;

import java.util.List;

public class Calc {

    public static double calcAverage(List<? extends Product>list){

        double amount = 0.0;

        for(int i = 0; i < list.size(); i++ ) {

            amount +=list.get(i).price;
        }

        return amount;
    }

    public static double  bigger(List<? extends Product>list){
        double bigger = Double.MIN_VALUE;

        for(int i = 0; i < list.size(); i++) {

            if(list.get(i).price > bigger) {

                bigger = list.get(i).price;
            }
        }
        return bigger;
    }

    public static double small(List<? extends Product> list){

        double smaller = Double.MAX_VALUE;
        for(int i = 0 ; i < list.size(); i++ ) {

            if(list.get(i).getPrice() < smaller) {

                smaller = list.get(i).getPrice();
            }
        }
        return smaller;
    }
}
