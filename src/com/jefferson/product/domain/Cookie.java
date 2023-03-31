package com.jefferson.product.domain;

public class Cookie extends Product{

    private Integer carcinogenicComponent;
   public Cookie(String name, Double price,Integer expirationDate,Integer carcinogenicComponent){

       super(name, price, expirationDate);
       this.carcinogenicComponent = carcinogenicComponent;
   }

    public String toString(){

        return "Product: Shampoo, Price : " + price + ", Expiration Date : " + expirationDate +
                ", CarcinogenicComponent : " + carcinogenicComponent;
    }

    public Integer getCarcinogenicComponent() {
        return carcinogenicComponent;
    }

    public void setCarcinogenicComponent(Integer carcinogenicComponent) {
        this.carcinogenicComponent = carcinogenicComponent;
    }


}
