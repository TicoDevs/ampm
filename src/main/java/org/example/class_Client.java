package org.example;

public class class_Client {
    int[] product;
    String name;

    // Constructor que recibe el array de productos
    public class_Client(int[] product, String name) {
        this.product = product;
        this.name = name;
    }

    public int[] getProduct() {
        return product;
    }

    public void setProduct(int[] product) {
        this.product = product;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
