/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author Mehdi
 */
public class Banco {
    
    Scanner sc = new Scanner (System.in);
    
    String[] opciones = {"Sacar.", "Depositar.", "Ver saldo."};
    private double balance;
    boolean verdad = true;

    
       
    public Banco (double saldo){
        this.balance = saldo;
        
    }
    
    public void start(){
        System.out.println("Seleccione lo que desea hacer: ");
        for (int i = 0; i<opciones.length; i++){
        System.out.println("- " + opciones[i]);}
        String respuesta = sc.nextLine();
        switch (respuesta){
            case "Sacar":
                sacar();
            break;    
            case "Depositar":
                depositar();
            break;
            case "Saldo":
                verSaldo();
            break;    
        }    
    }
    
    public void sacar(){
        System.out.println("Tu saldo actual es " + balance + " euros. ¿Cuanto desea sacar?");
        double sacarDinero = sc.nextDouble();
        if (sacarDinero>balance){
            while (verdad){
            System.out.println("Saldo insuficiente, escribe una cantidad inferior.");
            double sacarDinero2 = sc.nextDouble();
            if (balance>=sacarDinero2){
                System.out.println("Has sacado " + sacarDinero2);
                verdad = false; 
                double nuevaCantidad = balance - sacarDinero2;
                this.balance = nuevaCantidad;
                System.out.println("Le quedan " + balance + " euros en el banco."); } }                  
        } else {
            System.out.println("Has sacado " + sacarDinero);
            double nuevaCantidad2 = balance - sacarDinero;
                this.balance = nuevaCantidad2;
                System.out.println("Le quedan " + balance + " euros en el banco.");
        }}
    
    
    public void depositar(){
        System.out.println("Cuanto dinero quieres depositar?");
        double depositar = sc.nextInt();
        double newBalance = depositar + balance;
        this.balance = newBalance;
        System.out.println("Has ingresado " + depositar + " euros tu saldo total es " + balance);} 


     public void verSaldo(){
         System.out.println("Su saldo es de " + balance);
                 
     }
     
     
     


}           
  
