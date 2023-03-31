package com.jefferson.product.domain;

import javax.accessibility.AccessibleValue;
import java.util.List;

public abstract class Product  {

    protected String name;
    protected Double price;
    protected Integer expirationDate; // in days


    public Product(String name, Double price, Integer expirationDate){

        this.name = name;
        this.price = price;
        this.expirationDate = expirationDate;
    }

    public abstract String toString();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Integer expirationDate) {
        this.expirationDate = expirationDate;
    }
}
