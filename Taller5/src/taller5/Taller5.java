/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller5;

import java.util.Scanner;

/**
 *  Programa de notas
 * Meter notas
 * Promedio notas
 * Numero de estudiantes con nota superior al promedio
 * Actualizar notas con porcentajes incremento o decremento
 * Mostrar notas
 * Recibir Int double.
 * 
 * @author Alejandro Ordoñez
 */
public class Taller5 {
    private static final int NUM_STUDENTS =4;
    private static double[] notas = new double[NUM_STUDENTS];
    private static Scanner input = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        saludo();
        recibirNotas();
        mostrarNotas();
        promNotas();
        actualizarNotas(recibirDouble("Cuanto desea incrementar: "));
        mostrarNotas();
    }
    private static void mostrarNotas(){
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Nota #%1d: %3.4f\n", i, notas[i]);
        }
    }
    private static void actualizarNotas(double x){
        int i=0;
        double porcentaje = x/100;
        while(i<notas.length){
            notas[i]*=(1+porcentaje);
            i++;
        }
    }
    private static void saludo(){
        System.out.println("Hola");
    }
    private static double promNotas(){
        double res=0;
        for (int i = 0; i < notas.length; i++) {
            res+=notas[i];
        }
        return res/notas.length;
    }
    private static void recibirNotas(){
        for (int i = 0; i <notas.length; i++) {
            notas[i]=recibirDouble("Ingresar nota "+(i+1));
        }
    }
    private static double recibirDouble(String msg){
        System.out.println(msg);
        double x=0;
        while(!input.hasNextDouble()){
            System.out.println("Dato incorrecto, ingrese nuevamente "+input.next());
        }
        x=input.nextDouble();
        return x;
    }
}
