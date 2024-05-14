/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primera.clase.java;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class PrimeraClaseJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Una variable es un espacio en la memoria
        //identificador= dato
        //entero= int
        //N° real= double
        // cadena de texyo= string
        String nombre = "Fede";
        int edad = 36;
        double salario = 1000.0;

        System.out.println("nombre" + nombre);
        System.out.println("edad" + edad);
        System.out.println("salario" + salario);
        System.out.println("-----------------");
        //Operadores aritmeticos
        //Son operaciones matematicas: + - / *
        int a = 25;
        int b = 12;
        int c = 2;
        System.out.println("RESTA");
        System.out.println(b - c);
        System.out.println("SUMA");
        System.out.println(a + b);
        //+OPERADORES RELACIONALES, COMPARAN DOS O MAS VALORES
        /*
         == igual que
         ! distinto
         */
        System.out.println(b == d);

//
// OPERADPRES DE INCREMENTO Y DECREMETO
// VAR++ VAR --
        System.out.println("OPERADPRES DE INCREMENTO Y DECREMETO");
        int numIndec = 0;
        numIndec++;
        numIndec++;
        numIndec++;
        numIndec--;
        // ENTRADA DE DATOS
        //CLASE SCANER
        Scanner leer = new Scanner  (System.in);
        
        System.out.println("Ingrese su nombre ");
        String nombreCompleto = leer.nextLine();
        System.out.println("Mi Nombre es: " + nombreCompleto);
        
///Edad y Email
        System.out.println("Ingrese su edad: ");
        int edadScanner = leer.nextInt();
        System.out.println("Mi edad es: " +  edadScanner);
    
    }

}
