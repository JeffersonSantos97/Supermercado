package com.jefferson.product.test;


import com.jefferson.product.domain.Calc;
import com.jefferson.product.domain.Cookie;
import com.jefferson.product.domain.Milk;
import com.jefferson.product.domain.Shampoo;

import java.util.ArrayList;
import java.util.List;

public class Supermarket {

    public static void main(String[] args) {

        List<Shampoo> shampoos = new ArrayList<>();

        shampoos.add(new Shampoo("Dove", 18.50, 180,2));
        shampoos.add(new Shampoo("Clear man", 5.50, 150,4));
        shampoos.add(new Shampoo("Blá", 14.50,360,7));
        System.out.println("---------Shampoo -------- ");
        System.out.println(shampoos.toString());
        System.out.println("Average : " + Calc.calcAverage(shampoos));
        System.out.println("Bigger : " + Calc.bigger(shampoos));
        System.out.println("Smaller : " + Calc.small(shampoos));

        List<Milk> milks = new ArrayList<>();


        milks.add(new Milk("Elge", 50.00, 170, 45));
        milks.add(new Milk("Aurora", 26.50, 180, 60));
        milks.add(new Milk("Parmalate", 85.40, 360, 180));

        System.out.println("----- Milk-----------");
        // System.out.println(milks.toString());
        System.out.println("Average : " + Calc.calcAverage(milks));
        System.out.println("Bigger : " + Calc.bigger(milks));
        System.out.println("Smaller : " + Calc.small(milks));

        List<Cookie> cookies = new ArrayList<>();

        cookies.add(new Cookie("Trakinas", 5.50, 360,4));
        cookies.add(new Cookie("Fandangos", 4.50, 180, 40));
        cookies.add(new Cookie("Fofura", 1.50, 90, 60));

        System.out.println("------ Cookies------------");
        //System.out.println(cookies.toString());
        System.out.println("Average : " + Calc.calcAverage(cookies));
        System.out.println("Bigger : " + Calc.bigger(cookies));
        System.out.println("Smaller : " + Calc.small(cookies));

    }
}
