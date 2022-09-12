
package com.mycompany.pirkiniai;


public class Product {
 
    private String product;
    private int quantity;
    
    public Product(String p, int q) {
        this.product = p;
        this.quantity = q;
    }
    
    public Product(String p) {
        this.product = p;
        this.quantity = 0;
    }
    
    public String getProduct() {
        return this.product;
    }
    
    public int getQuantity() {
        return this.quantity;
    }
    
    public void setProduct(String n) {
        this.product = n;
    }
    
    public void setQuantity(int q) {
        this.quantity = q;
    }
    
    public void plusOne() {
        this.quantity++;
    }
    
    public void minusOne() {
        this.quantity--;
    }
    
}
