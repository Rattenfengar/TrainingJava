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
 * Para ver la documentacion del proyecto ir a: https://github.com/Rattenfengar/TrainingJava
 */
public class EjercicioPrimerParcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Creación del objeto Scanner
        Scanner input = new Scanner(System.in);
        //Definición de las variables
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
        //Imprime el nombre junto con la bienvenida.
        System.out.println("Bienvenido: " + Nombre);
        //Muestra un menú
        System.out.println("1) Calcular cuadrados");
        System.out.println("2) Calcular Raiz cuadrada");
        System.out.println("3) Calcular promedio de 3 notas");
        System.out.println("Ingrese la opcion deseada");
        //Verifica que no se ingrese otro dato diferente de Int
        if (input.hasNextInt()) {
            //Almacena el dato en la variable opción
            opcion = input.nextInt();
        } else {
            //Da un mensaje de error y termina el programa
            System.out.println("Error, Ingresó dato incorrecto");
            System.exit(0);
        }
        //Evaluar la opción ingresada
        if (opcion == 1) {
            System.out.println("Ha escogido la función calcular cuadrados");
            System.out.println("Ingrese el valor");
            if(input.hasNextDouble()){ //Verifica que el usuario ingrese un numero
                r1 = input.nextDouble();
            }else{
                System.out.println("Error, dato erroneo ingresado");
                System.exit(0);
            }
            //Calcula y almacena el resultado en la variable resultado
            resultado = Math.pow(r1, 2); //pow - para potencias
            System.out.format("El resultado es: %.2f %n", resultado);
        } else if (opcion == 2) {
            System.out.println("Ha escogido la función raiz cuadrada");
            System.out.println("Ingrese el valor");
            if(input.hasNextDouble()){
                r1 = input.nextDouble();
            }else{
                System.out.println("Error, dato erroneo ingresado");
            }
            resultado = Math.sqrt(r1); // sqrt para raíz cuadrada
            System.out.format("El resultado es: %.2f %n", resultado);
        } else if (opcion == 3) {
            System.out.println("Sacar promedio");
            System.out.println("Ingrese nota 1");
            if(input.hasNextDouble()){
                r1 = input.nextDouble();
            }else{
                System.out.println("Error, dato erroneo ingresado");
            }
            System.out.println("Ingrese nota 2");
            if(input.hasNextDouble()){
                r2 = input.nextDouble();
            }else{
                System.out.println("Error, dato erroneo ingresado");
            }
            System.out.println("Ingrese nota 3");
            if(input.hasNextDouble()){
                r3 = input.nextDouble();
            }else{
                System.out.println("Error, dato erroneo ingresado");
            }
            resultado = (r1 + r2 + r3) / 3;
            System.out.format("Su promedio de notas es: %.2f %n", resultado);
            //Clasificación del desempeño
            if (resultado >= 0 && resultado < 3) {
                System.out.println("Su desempeño es bajo!");
            } else if (resultado >= 3 && resultado < 4) {
                System.out.println("Su desempeño es Medio!");
            } else if (resultado >= 4 && resultado <= 5) {
                System.out.println("Su desempeño es Alto");
            }
        } else {
            //Si se digita una opción fuera del rango 1-3 da un error
            System.out.println("Error, Opcion fuera de rango");
            System.exit(0);
        }
    }

}
