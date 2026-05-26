package com.pluralsight;

public class CartItems {
    //add bonus options

    //add property
    private Product product;
    private int quantity;


    //add constructor

    public CartItems(Product product) {
        this.product = product;
        this.quantity = quantity;
    }


    //add get set


    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // add increasequantity
public void increaseQuantity() {
        quantity++;
}

    //add get line total
    public double getLineTotal() {
        return quantity * product.getPrice();

    }
}
