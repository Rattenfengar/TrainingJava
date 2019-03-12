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
             tabFunction();
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
    public static void tabFunction(){
        int start=0, end=0;
        byte x = 0;
        double r1=0,r2=0,r3=0, r4 =0;
        System.out.println("Ingrese el valor inicial desde donde dessea tabular");
        start=obtenerInt();
        System.out.println("Ingrese el valor final hasta donde dessea tabular");
        end=obtenerInt();
        System.out.println("|******************************************************************************|");
        System.out.println("| 1) Lineal y=ax+b.............................................................|");
        System.out.println("| 2) Cuadrática y=ax^2+bx+c....................................................|");
        System.out.println("| 3) Cúbica y=ax^3+bx^2+cx+d..............................................................|");
        System.out.println("|******************************************************************************|");
        System.out.println("Ingrese la opción deseada...");
        x=obtenerByte();
        switch(x){
            case 1:
                System.out.println("Ingrese el coeficiente a");
                r1=obtenerDouble();
                System.out.println("Ingrese el coeficiente b");
                r2=obtenerDouble();
                printFunction("Lineal",start, end, x, r1, r2, r3,r4);
                break;
            case 2:
                System.out.println("Ingrese el coeficiente a");
                r1=obtenerDouble();
                System.out.println("Ingrese el coeficiente b");
                r2=obtenerDouble();
                System.out.println("Ingrese el coeficiente c");
                r3=obtenerDouble();
                printFunction("Cuadratica",start, end, x, r1, r2, r3,r4);
                break;
            case 3:
                System.out.println("Ingrese el coeficiente a");
                r1=obtenerDouble();
                System.out.println("Ingrese el coeficiente b");
                r2=obtenerDouble();
                System.out.println("Ingrese el coeficiente c");
                r3=obtenerDouble();
                System.out.println("Ingrese el coeficiente d");
                r4=obtenerDouble();
                printFunction("Cubica",start, end, x, r1, r2, r3,r4);
                break;
            default:
                break;
        }
    }
    public static double calcLinear(double a, double b, double x){
        return a*x+b;
    }
    public static double calcCubic(double a, double b, double c,double d, double x){
        return a*Math.pow(x, 3)+b*Math.pow(x, 2)+c*x+d;
    }
    public static double calcQuadratic(double a, double b, double c, double x){
        return a*Math.pow(x, 2)+b*x+c;
    }
    public static void printFunction(String msg, int init, int end, byte z, double a, double b, double c, double d){
        System.out.println("Tabulacion funcion "+msg);
        System.out.println("|***************************************");
        System.out.println("|        x          |           y        |");
        switch(z){
            case 1:
                for (int i = init; i <= end; i++) {
                    System.out.printf( "|     %4d          |        %5.4f      |\n", i, calcLinear(a,b,i) );
                }
                break;
            case 2:
                for (int i = init; i <=end; i++) {
                    System.out.printf( "|     %4d          |        %5.4f      |\n", i, calcQuadratic(a,b,c,i) );
                }
                break;
            case 3:
                for (int i = init; i <= end; i++) {
                    System.out.println("|        x          |           y        |");
                    System.out.printf( "|     %4d         |        %5.4f      | \n", i, calcCubic(a,b,c,d,i) );
                }
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
    public static double obtenerDouble(){
        double x =0;
        if(input.hasNextDouble()){
            x = input.nextDouble();
            return x;
        }else{
            System.out.println("Error dato incorrecto");
            System.exit(0);
        }
        return Double.NaN;
    }
    public static int obtenerInt(){
         int x =0;
        if(input.hasNextInt()){
            x = input.nextInt();
            return x;
        }else{
            System.out.println("Error dato incorrecto");
            System.exit(0);
        }
        return Integer.MAX_VALUE;
    }
    
}
