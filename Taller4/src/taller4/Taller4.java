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
    public static byte menu(){
        System.out.println("|******************************************************************************|");
        System.out.println("| 1) Tabulación de funciones...................................................|");
        System.out.println("| 2) Calculadora...............................................................|");
        System.out.println("| 3) Comprobar texto...........................................................|");
        System.out.println("| 4) ");
    }
    
}
