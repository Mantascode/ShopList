
package com.mycompany.pirkiniai;

import java.util.Scanner;


public class Interface {
    
    private Scanner scanner;
    private List list;
    
    public Interface(Scanner s, List l) {
        this.scanner = s;
        this.list = l;
    }
    
    public void start() {
        
        while(true) {
            
            System.out.println("");
            System.out.println("Pasirinkimas:");
            System.out.println("1 - parodyti sarasa");
            System.out.println("2 - prideti i sarasa");
            System.out.println("3 - istrinti is saraso");
            System.out.println("4 - prideti viena");
            System.out.println("5 - atimti viena");
            System.out.println("6 - redaguoti kieki");
            System.out.println("0 - uzdaryti programa");
            
            int i = Integer.valueOf(scanner.nextLine());
            
            if(i == 0) {
                break;
            }
            
            if(i == 1) {
                System.out.println("");
                list.showList();
            }
            
            if(i == 2) {
                
                System.out.println("");
                System.out.println("Produktas:");
                String p = scanner.nextLine();
                
                System.out.println("Kiekis:");
                int q = Integer.valueOf(scanner.nextLine());
                
                list.addProduct(new Product(p, q));
            }
            
            if(i == 3) {
                
                System.out.println("");
                System.out.println("Kuri produkta istrinti? (irasykite produkto numeri)");
                list.showList();
                
                int id = Integer.valueOf(scanner.nextLine()) - 1;
                list.removeProduct(id);
            }
            
            if(i == 4) {
                
                System.out.println("");
                System.out.println("Kuri produkta padidinti vienetu? (irasykite produkto numeri)");
                list.showList();
                
                int id = Integer.valueOf(scanner.nextLine()) - 1;
                list.getProduct(id).plusOne();
            }
            
            if(i == 5) {
                
                System.out.println("");
                System.out.println("Kuri produkta sumazinti vienetu? (irasykite produkto numeri)");
                list.showList();
                
                int id = Integer.valueOf(scanner.nextLine()) - 1;
                list.getProduct(id).minusOne();
            }
            
            if(i == 6) {
                
                System.out.println("");
                System.out.println("Kuri produkto kieki redaguoti? (irasykite produkto numeri)");
                list.showList();
                
                int id = Integer.valueOf(scanner.nextLine()) - 1;
                
                System.out.println("Naujas kiekis:");
                int newQ = Integer.valueOf(scanner.nextLine());
                
                list.getProduct(id).setQuantity(newQ);
            }
            
        }
        
    }
    
}
