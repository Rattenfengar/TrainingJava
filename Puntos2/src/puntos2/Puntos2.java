/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntos2;

import java.awt.Point;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Alejandro Ordoñez
 */
public class Puntos2 {

    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        darBienvenida();
        for (int i = 1; i <= 5; i++) {
            dibujarEscalera(i);
            Point p = obtenerPunto("punto p" + i);
            Point p2 = obtenerPunto("Punto p" + (i + 1));
            double tP = Teorema(p, p2);
            cajaTexto(String.format("el resultado es: %.2f", tP), '#');

            cajaTexto(String.format("punto 1 (%.0f,%.0f)", p.getX(), p.getY()));
            cajaTexto(String.format("punto 2 (%.0f,%.0f)", p2.getX(), p2.getY()));
        }
        darDespedida();
        entrada.close();
    }

    /**
     * obtener punto
     *
     * @param string obtener punto
     * @return retornar a punto 2
     */
    private static Point obtenerPunto(String string) {
        System.out.println(string);
        int x = obtenerInt("x");
        int y = obtenerInt("y");
        Point p = new Point(x, y);
        return p;
    }

    /**
     * Teorema de pitagoras
     *
     * @param p1 y1 y x1
     * @param p2 y2 y x2
     * @return retorna
     */
    private static double Teorema(Point p1, Point p2) {
        double tP = Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2.0) + Math.pow(p2.getY() - p1.getY(), 2.0));
        return tP;
    }

    /**
     * método que muestra un String rodeado por un borde
     *
     * @param object cadena de texto que quiere ser impresa
     * @return n la longitud de la cadena de texto recibida
     * @see java.util.regex.Pattern#DOTALL
     */
    public static int cajaTexto(String str) {
        int n = str.length();
        System.out.println("##" + str.replaceAll("(?s).", "#") + "##");
        System.out.println("# " + str + " #");
        System.out.println("##" + str.replaceAll("(?s).", "#") + "##");
        System.out.println();
        return n;
    }

    public static void cajaTexto(String str, char car) {
        int n = str.length();
        for (int i = 0; i < n + 4; i++) {
            System.out.print(car);
        }
        System.out.println();
        System.out.println(car + " " + str + " " + car);
        for (int i = 0; i < n + 4; i++) {
            System.out.print(car);
        }
        System.out.println();
    }

    /**
     * da la bienvenida
     */
    private static void darBienvenida() {
        // TODO Auto-generated method stub
        cajaTexto("Bienvenido al programa del teorema de pitagoras", '*');

    }

    private static int obtenerInt(String msg) {
        // TODO Auto-generated method stub
        int number;
        do {
            System.out.println("Please enter a positive number!");
            while (!entrada.hasNextInt()) {
                System.out.println("That's not a number!");
                entrada.next(); // this is important!
            }
            number = entrada.nextInt();
        } while (number <= 0);
        System.out.println("Thank you! Got " + number);
        return number;
    }

    /**
     * Da una despedida al programa
     */
    private static void darDespedida() {
        // TODO Auto-generated method stub
        cajaTexto("Gracias por utilizar el programa creado por la chica de las 3L");

    }

    private static void dibujarEscalera(int k) {
        for (int i = 0; i <= k; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
