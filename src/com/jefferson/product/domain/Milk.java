package com.jefferson.product.domain;

public class Milk extends Product{

    private Integer expirationDatePacked;


    public Milk(String name, Double price, Integer expirationDate, Integer expirationDatePacked){

        super(name, price, expirationDate);
        this.expirationDatePacked = expirationDatePacked;

    }

    public String toString(){

        return "Product: Shampoo, Price : " + price + ", Expiration Date : " + expirationDate +
                ", expirationDatePacked : " + expirationDatePacked;
    }

    public Integer getExpirationDatePacked() {
        return expirationDatePacked;
    }

    public void setExpirationDatePacked(Integer expirationDatePacked) {
        this.expirationDatePacked = expirationDatePacked;
    }
}
