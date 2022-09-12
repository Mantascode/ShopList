package com.mycompany.pirkiniai;

import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List list = new List();
        
        Interface ui = new Interface(scanner, list);
        ui.start();
        
        
    }
    
}
