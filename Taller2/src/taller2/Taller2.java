/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller2;

import java.util.Scanner;

/**
 *
 * @author Alejandro Ordoñez
 */
public class Taller2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        int opcion = 0;
        double r1 = 0;
        double r2 = 0;
        double r3 = 0;
        double resultado = 0;
        //se crea un segundo resultado;
        double resultado2=0;
        //Saludo al cliente
        System.out.println("/***********Bienvenido al programa***********/");
        System.out.println("Programador: Manuel Alejandro Ordoñez********/");
        System.out.println("Con este programa podrá realizar tareas generales");
        System.out.println("1) Cálculos básicos");
        System.out.println("2) Cálculos complejos");
        System.out.println("4) Promedio Arimético de 6 notas");
        System.out.println("Ingrese la opcion deseada");
        //Validación de la entrada Esta validación debería hacerse en cada ingreso del código como en el anterior ejercicio (Taller 1), pero no extender el código lo omitiré.
        if (input.hasNextInt()) {
            opcion = input.nextInt();
        } else {
            //Recordar sacar al usuario del programa cuando se produzcan errores.
            System.out.println("Error, Dato incorrecto");
            System.exit(0);
        }
        if (opcion == 1) { //Opcion 1 Menu 1
            opcion = 0;//Resetear la variable para poderla usar
            //Menu dentro de opción 1
            System.out.println("Haz escogido calculos básicos");
            System.out.println("1) Sumar dos números");
            System.out.println("2) Resta dos números");
            System.out.println("3) Mulplicación dos números");
            System.out.println("4) Division dos números");
            System.out.println("Ingrese la opcion");
            opcion = input.nextInt();//Actualizar la variable y pedir nueva opción
            if (opcion == 1) { //Opción 1 Menu 2
                System.out.println("Inrese el primer valor");
                r1 = input.nextDouble();//Pedirle el primer valor a operar
                System.out.println("Ingrese el segundo valor");
                r2 = input.nextDouble();//Pedirle el segundo valor a operar
                resultado = r1 + r2;
                System.out.format("El resultado es: %.4f \n", resultado); //% indica donde va el número si es F entonces es decimal si es d es entero ej:  %4d, entero de 4 espacios
                //La etructura es la misma para las demás opciones.
            } else if (opcion == 2) { //Opción 2 Menu 2
                System.out.println("Inrese el primer valor");
                r1 = input.nextDouble();
                System.out.println("Ingrese el segundo valor");
                r2 = input.nextDouble();
                resultado = r1 - r2;
                System.out.format("El resultado es: %.4f \n", resultado);
            } else if (opcion == 3) { //Opción 3 Menú 2
                System.out.println("Inrese el primer valor");
                r1 = input.nextDouble();
                System.out.println("Ingrese el segundo valor");
                r2 = input.nextDouble();
                resultado = r1 * r2;
                System.out.format("El resultado es: %.4f \n", resultado);
            } else if (opcion == 4) { //Opción 4 Menú 2
                System.out.println("Inrese el primer valor");
                r1 = input.nextDouble();
                System.out.println("Ingrese el segundo valor");
                r2 = input.nextDouble();
                resultado = r1 / r2;
                System.out.format("El resultado es: %.4f \n", resultado);
            } else { //Si digita una opción diferente.
                System.out.println("Error, opción incorrecta");
                System.exit(0);
            }
        } else if (opcion == 2) {
            //Codigo para la opcion 2 menú 1
            opcion = 0; // Reseteo la variable
            System.out.println("1) Calcular potencias");
            System.out.println("2) Calcular raices");
            System.out.println("3) Raices de ecuación cuadrática");
            System.out.println("Ingrese la opcion");
            opcion = input.nextInt();
            if (opcion == 1) { //Opción 1 menú opción 2 de menú 1
                System.out.println("Inrese el primer valor");
                r1 = input.nextDouble();
                System.out.println("Ingrese el segundo valor");
                r2 = input.nextDouble();
                resultado = Math.pow(r1, r2); //La librería Math se usa para usar operacines avanzadas. Math.pow(double a, double b), calcula a^b
                System.out.format("El resultado es: %.4f \n", resultado);
            } else if (opcion == 2) { //Opción 2 menú opción 2 de menú 1
                System.out.println("Inrese el valor");
                r1 = input.nextDouble();
                resultado = Math.sqrt(r1); //Math.sqrt(double), calcula la raiz cuadrada
                System.out.format("El resultado es: %.4f \n", resultado);
            } else if(opcion==3){//Opción 3 menú opción 2 de menú 1
                /*Para calcular las raices de una ecuación cuadrática se usa la fórmula general. Esta da como resultado dos raices.
                //En esta sección no se controla si las raices son imaginarias, por lo que puede producir un error.
                //Formula: x1=(-b+sqrt(b^2-4ac))/2a
                //x2=(-b-sqrt(b^2-4ac))/2a
                Para hacer esto creamos un segundo resultado y se reutiliza r1, r2, r3 para almacenar a, b, c.
                */
                System.out.println("Calculo de raices de la ecuación cuadrática");
                System.out.println("Ingrese los coeficientes:");
                System.out.println("Ingrese el coeficiente a");
                r1=input.nextDouble(); //A
                System.out.println("Ingrese el coeficiente b:");
                r2=input.nextDouble();//B
                System.out.println("Ingrese el coeficiente c:");
                r3=input.nextDouble();//C
                System.out.println("La ecuación que ingresó fue:");
                System.out.println(r1+"x^2+"+r2+"x+"+r3);
                resultado=(-r1+Math.sqrt((Math.pow(r2, 2)-(4*r1*r3))))/(2*r1); //Equivalente de la formula x1.
                resultado2=(-r1+Math.sqrt((Math.pow(r2, 2)-(4*r1*r3))))/(2*r1); //Equivalente de la formula x2.
                System.out.printf("Las raices son: x1= %.4f x2= %.4f", resultado, resultado2 );
            } 
            else {//Si esccge una opción incorrecta.
                System.out.println("Error, opcion incorrecta"); //Saco al usuario si se equivoca de opción
                System.exit(0);
            }
        } else if (opcion == 4) { //Opción 4 Menú 1
            System.out.println("Ingrese las notas");
            System.out.println("Primer nota:");
            r1 = input.nextDouble();
            System.out.println("Segunda nota:");
            r2 = input.nextDouble();
            System.out.println("Tercera nota:");
            r3 = input.nextDouble();
            resultado = Math.pow((r1 * r2 * r3), 1.0 / 3.0); //Para que la divición de correctamente se escriben los numeros 1 y 3 con decimal
            System.out.format("El resultado es: %.4f \n", resultado);
            if (resultado >= 0 && resultado < 3) { //[0,3) //Primer rango, incluye el 0 pero no el 3
                System.out.println("Su desempeño es bajo");
            } else if (resultado >= 3 && resultado < 4) {//[3,4) Segundo rango, incluye el 3 pero no el 4
                System.out.println("Desempeño medio");
            } else if (resultado >= 4 && resultado <= 5) { // Tercer rango Incluye el 4 y el 5
                System.out.println("Desempeño alto");
            }
        } else {//Error si el usuario es coge mal la opción en el menú 1
            System.out.println("Error, opción incorrecta");
            System.exit(0);
        }
        //Despedida.
        System.out.println("Gracias por usar el programa");
        System.exit(0);
    }
}
