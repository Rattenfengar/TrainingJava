/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller4;

import java.util.Scanner;

/**
 * El siguiente programa tiene como finalidad usar los métodos como herramientas en el Java
 * Las funciones o métodos que se van a usar serán los siguientes:
 * 1. Bienvenida
 * 2. Menu que retorna opción.
 * 3. Método que evalua una función e imprime los datos tabulados.
 */




/**
 *
 * @author Alejandro Ordoñez
 */
public class Taller4 {
    public static String nombre="";
    public static Scanner input = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        bienvenida();
        navegacion(menu());
        
    }
    /**
     * Método que da la bienvenida.
     */
    public static void bienvenida(){
        System.out.println("Ingresa tu nombre: ");
        nombre = input.nextLine();
        if(nombre.equals(null)){
            System.out.println("El nombre no puede estar vacío.");
            System.exit(0);
        }
        System.out.println("|******************************************************************************|");
        System.out.format ("|*******************************BIENVENIDO: %10s ******************************|", nombre);
        System.out.println("|******************************************************************************|\n");
    }
    /**
     * Este metodo muestra el menu
     * @return es el valor de la opcion digito el usuario.
     */
    public static byte menu(){
        System.out.println("|******************************************************************************|");
        System.out.println("| 1) Tabulación de funciones...................................................|");
        System.out.println("| 2) Calculadora...............................................................|");
        System.out.println("| 3) Comprobar texto...........................................................|");
        System.out.println("| 4) Unir texto................................................................|");
        System.out.println("| 5) Salir.....................................................................|");
        return obtenerByte();
    }
    /**
     * Este metodo define la navegacion del programa
     * @param opcion opcion que recibe del metodo menu
     */
    public static void navegacion(byte opcion){
     switch(opcion){
         case 1:
             break;
         case 2:
             break;
         case 3:
             break;
         case 4:
             break;
         case 5:
             System.out.println("Gracias por usar el programa");
             System.exit(0);
             break;
         default:
             System.out.println("Opción Incorrecta......");
             navegacion(menu());
             break;
     }   
    }
    /**
     * Este metodo tabula una funcion polinomial
     * @param start inicio de la tabulacion
     * @param end fin de la tabulacion.
     */
    public static void tabFunction(double start, double end){
        byte order = 0;
        double coeficiente=0;
        double resultado;
        System.out.println("Las funcione que ingrese deberan ser polinomiales de la forma: x^2+3x+5");
        System.out.println("Ingrese el orden de la ecuacion: ");
        order=obtenerByte();
        
        for (int i = 0; i < order; i++) {
            System.out.println("Coeficiente de grado: "+i);
            
        }
    }
    public static byte obtenerByte(){
        byte x =0;
        if(input.hasNextByte()){
            x = input.nextByte();
            return x;
        }else{
            System.out.println("Error dato incorrecto");
            System.exit(0);
        }
        return Byte.MAX_VALUE;
    }
    
}
