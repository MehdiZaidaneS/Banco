package main;

import java.util.Random;
import java.util.Scanner;


public class Customer {
    
    Random r = new Random();
    boolean verdad= true;
    Scanner sc = new Scanner (System.in);
    private int id;
    private int password;
    
    
    public Customer(int identity, int bankPassword){
        this.id = identity;
        this.password = bankPassword;        
    }
     
    
    public void createBank(){
        int numbers = r.nextInt(99999)+1;
        System.out.println("Vamos a crear una cuenta para ti:\n -Tu ID es " + numbers);
        this.id = numbers;
        System.out.println("Ahora escriba la contraseña que desea tener (solo numeros):");
        int contraseña = sc.nextInt();
        this.password = contraseña;
        System.out.println("");
        System.out.println("Tu ID es " + numbers + " y tu contraseña es " + contraseña + ". Además recibiras 50 euros por crearte una cuenta en Banco Mehdi.");
    }
    
    
    public void login(){
        System.out.println("Inicia sesión.\nIntroduzca ID:");
        int escribeID = sc.nextInt();
        if (escribeID == id ){
            System.out.println("Contraseña:");
            int escribeContraseña = sc.nextInt();
            if (escribeContraseña == password){
                System.out.println("Has iniciado sesion correctamente.");
            } else{
                while (verdad){
                    System.out.println("ERROR. Ingrese la contraseña de nuevo.");
                    int escribeContraseña2 = sc.nextInt();
                    if (escribeContraseña2== password){
                    System.out.println("Has iniciado sesion correctamente.");
                    verdad = false;
                    }
                }
            }
        } else {
            while (verdad){
                System.out.println("ERROR. Ingrese tu ID de nuevo");
                int escribeID2 = sc.nextInt();
                if (escribeID2 == id){
                    System.out.println("Contraseña: ");
                    int escribeContraseña = sc.nextInt();
                    if (escribeContraseña == password){
                    System.out.println("Has iniciado sesion correctamente.");
                    verdad = false;    
                  } else {
                     while (verdad){
                     System.out.println("ERROR. Ingrese la contraseña de nuevo.");
                     int escribeContraseña2 = sc.nextInt();
                     if (escribeContraseña2== password){
                     System.out.println("Has iniciado sesion correctamente.");
                     verdad = false;   }}
                    }
            }
        }
        }
    }     
    }
    
    

