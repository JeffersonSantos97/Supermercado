package com.jefferson.product.domain;

public class Shampoo extends Product{

    private Integer irritability;
    public Shampoo(String name, Double price, Integer expirationDate, Integer irritability){

        super(name, price, expirationDate);
        this.irritability = irritability;
    }

    public String toString(){

        return "Product: Shampoo, Price : " + price + ", Expiration Date : " + expirationDate +
                ", Irrritability : " + irritability + "\n";

    }



    public Integer getIrritability() {
        return irritability;
    }

    public void setIrritability(Integer irritability) {
        this.irritability = irritability;
    }
}
