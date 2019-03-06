/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3;

import java.util.Scanner;

/**
 *
 * @author Alejandro Ordoñez
 * Realizar un programa para satisfacer las siguientes necesidades de un usuario.
 * 1) El usuario necesita saber cuanto ha gastado en el mes, a partir de acumulados por semena.
 * 2) Promedio de gastos
 * 3) Deudas.
 */
public class Taller3 {
    public static Scanner input = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double s1=0, s2=0, s3=0, s4=0;
        double acumMes = 0;
        double salario=0;
        double promGastos =0;
        double sobra=0;
        String nombre="";     
        System.out.println("Bienvenido");
        System.out.println("Ingrese su nombre: ");
        nombre=input.nextLine();
        //El porcentaje es un indicador de donde se va a situar el dato con un formato en especifico
        //f para decimales, d para enteros y s para Strings
        System.out.format("Hola %s, este programa le permite llevar sus cuentas %n", nombre);
        System.out.println("A continuacion ingrese su salario: ");
        salario = verificarDato();
        System.out.printf("Su salario es: %.3f %n", salario);
        System.out.println("Ingrese los gastos de la semana 1");
        s1=verificarDato();
        System.out.println("Ingrese los gastos de la semana 2");
        s2=verificarDato();
        System.out.println("Ingrese los gastos de la semana 3");
        s3=verificarDato();
        System.out.println("Ingrese los gastos de la semana 4");
        s4=verificarDato();
        acumMes = s1+s2+s3+s4;
        //System.out.printf("Su gasto en el mes es: %.3f %n", acumMes);
        promGastos = Math.pow((s1*s2*s3*s4), 1.0/4.0);
        System.out.printf("Su promedio de gastos es de: %.2f %n",promGastos);
        sobra=salario-acumMes;
        if(sobra<0){
            System.out.println("Esta debiendo: "+sobra);
        } else if(sobra==0){
            System.out.println("NO le sobro dinero");
        }else{
            System.out.println("Le sobro: "+sobra);
        }
    }
    /**
     * El metodo me retorna un double
     * Verificado
     * @return 
     */
    public static double verificarDato(){
        double x =0;
        if(input.hasNextDouble()){ //Pregunta si lo que ingreso es un numero
            x=input.nextDouble();
            if(x<0){ //Pregunta si hay un numero negativo
                System.out.println("Error, dato invalido");
                System.exit(0);
            }
        } else{
            System.out.println("Error, dato no valido");
            System.exit(0);
        }
        return x;
    }
    
}
