
package com.mycompany.pirkiniai;

import java.util.ArrayList;


public class List {
    
    private ArrayList<Product> list;
    
    public List() {
        this.list = new ArrayList<>();
    }
    
    public void showList() {
        
        if(this.list.isEmpty()) {
            System.out.println("Irasu nera");
        } else {
            int i = 1;
            for(Product product: this.list) {
                System.out.println(i + ": " + product.getProduct() + ", kiekis: " + 
                       product.getQuantity());
                i++;
            }
        }     
    }
    
    public void addProduct(Product product) {
        
        this.list.add(product);
        
    }
    
    public void removeProduct(int i) {
        
        i--;
        this.list.remove(i);  
    }
    
    public Product getProduct(int i) {
        return this.list.get(i);
    }
    
}
