/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioprimerparcial;
//En este Proyecto encontrarán el desarrollo de una aplicación para toma    

import java.util.Scanner;

/**
 *
 * @author Alejandro Ordoñez
 */
public class EjercicioPrimerParcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String Nombre = "";
        int opcion = 0;
        double resultado = 0;
        double r1 = 0;
        double r2 = 0;
        double r3 = 0;
        //Bienvenida al programa.
        System.out.println("**************Programa multipropósito***************");
        System.out.println("********MANUEL ALEJANDRO ORDOÑEZ********************");
        System.out.println("Digite su nombre: ");
        //Toma el valor de Scanner en la siguiente línea.
        Nombre = input.nextLine();
        System.out.println("Bienvenido: " + Nombre);
        System.out.println("1) Calcular cuadrados");
        System.out.println("2) Calcular Raiz cuadrada");
        System.out.println("3) Calcular promedio de 3 notas");
        System.out.println("Ingrese la opcion deseada");
        if (input.hasNextInt()) {
            opcion = input.nextInt();
            if (opcion < 1 && opcion > 4) {
                System.out.println("Error, opcion fuera de rango");
                System.exit(0);
            }
        } else {
            System.out.println("Error, Ingresó dato incorrecto");
            System.exit(0);
        }
        if (opcion == 1) {
            System.out.println("Ha escogido la función calcular cuadrados");
            System.out.println("Ingrese el valor");
            r1 = input.nextDouble();
            resultado = Math.pow(r1, 2);
            System.out.format("El resultado es: %.2f %n", resultado);
        } else if (opcion == 2) {
            System.out.println("Ha escogido la función raiz cuadrada");
            System.out.println("Ingrese el valor");
            r1 = input.nextDouble();
            resultado = Math.sqrt(r1);
            System.out.format("El resultado es: %.2f %n", resultado);
        } else if (opcion == 3) {
            System.out.println("Sacar promedio");
            System.out.println("Ingrese nota 1");
            r1 = input.nextDouble();
            System.out.println("Ingrese nota 2");
            r2 = input.nextDouble();
            System.out.println("Ingrese nota 3");
            r3 = input.nextDouble();
            resultado = (r1 + r2 + r3) / 3;
            System.out.format("Su promedio de notas es: %.2f %n", resultado);
            if (resultado >= 0 && resultado < 3) {
                System.out.println("Su desempeño es bajo!");
            } else if (resultado >= 3 && resultado < 4) {
                System.out.println("Su desempeño es Medio!");
            } else if (resultado >= 4 && resultado <= 5) {
                System.out.println("Su desempeño es Alto");
            }
        } else {
            System.out.println("Opcion no valida");
        }

    }

}
