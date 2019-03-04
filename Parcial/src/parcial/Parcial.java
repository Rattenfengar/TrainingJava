/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

import java.util.Scanner;

/**
 *
 * @author Alejandro Ordoñez
 */
public class Parcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nZapatos = 0;
        double precio = 0;
        double precioTotal = 0;
        double precioDto=0;
        Scanner input = new Scanner(System.in);

        System.out.println("Bienvenido al programa de zapatas");
        System.out.println("A continuación digite el número de zapatos: ");
        if (input.hasNextInt()) {
            nZapatos = input.nextInt();
            if (nZapatos <= 0) {
                System.out.println("Error, número de zapatos no valido");
                System.exit(0);
            } else {
                System.out.printf("El número de zapatos es: %4d %n", nZapatos);
            }
        } else {
            System.out.println("Error, Dato inválido");
            System.exit(0);
        }
        System.out.println("Ingrese el valor de los zapatos");
        if (input.hasNextDouble()) {
            precio = input.nextDouble();
            if (precio <= 0) {
                System.out.println("Error, número de zapatos no valido");
                System.exit(0);
            } else {
                System.out.printf("El precio por zapato zapatos es: %.2f", precio);
            }
        } else {
            System.out.println("Error, Dato inválido");
            System.exit(0);
        }
        precioTotal=nZapatos*precio;
        System.out.println("El precio total es: "+precioTotal);
        if(nZapatos%2==0){
            System.out.println("El número de zapatos que digitó es par");
            if(precio>20000&&precio<=70000){
                System.out.println("Se aplica el descuento del 10%");
                precioDto=precioTotal*0.9;
            }
            else{
                System.out.println("No aplica para descuento");
                precioDto=precioTotal;
            }
        }else{
            System.out.println("El número de zapatos que digitó es impar");
            System.out.println("El descuento es del 20%");
            precioDto=precioTotal*0.8;
        }
        System.out.println("El precio a pagar es: "+precioDto);
        System.out.println("Gracias por usar el programa");
    }

}
