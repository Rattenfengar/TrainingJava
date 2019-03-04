/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package credito;

import java.util.Scanner;

/**
 *
 * @author Alejandro Ordoñez
 */
public class Credito {

    public static String nombre;
    public static int puntos;
    public static double salario;
    public static String vidaCredit;
    public static double prestamo;
    public static Scanner in = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bienvenido");
        System.out.println("Ingrese sus nombre");
        nombre = in.nextLine();
        System.out.println("Ingrese el estado de su vida crediticia");
        vidaCredit = in.nextLine();
        System.out.println("Ingrese el valor del prestamo");
        prestamo = in.nextDouble();
        
    }
    
}
