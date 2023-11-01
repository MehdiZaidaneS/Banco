package main;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    Banco customerBanco = new Banco(50.00);
    Customer newCustomer = new Customer (0, 0);
       
       System.out.println("Bienvenido al Banco Mehdi.");
       System.out.println("");
       System.out.println("¿Tiene usted cuenta en el banco?");
       String respuesta = sc.nextLine();
       if (respuesta.contains("Si") || respuesta.contains("si")){
           newCustomer.login();
       } else {
           newCustomer.createBank();
           System.out.println("");
           newCustomer.login();
       }
       
       customerBanco.start();
       
       
      
       
       
       
       
    }
    
}
