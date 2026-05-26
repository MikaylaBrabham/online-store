package com.pluralsight;

public class CartItems {
    //add bonus options

    //add property
    private Product product;
    private int quality;


    //add constructor

    public CartItems(Product product, int quality) {
        this.product = product;
        this.quality = 1;
    }


    //add get set

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    // add increasequantity


    //add get line total
}
