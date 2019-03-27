/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntos2;

import java.awt.Point;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro Ordoñez
 */
public class Puntos2 {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            escaleraInvertida(20);
            dibujarEscalera(i);
            Point p1 = recibirPunto("Punto 1");
            Point p2 = recibirPunto("Punto 2");
            double m = calcPendiente(p1, p2);
            double angle = calcAngulo(m);
            double b = puntoDeCorte(p1, m);
            JOptionPane.showMessageDialog(null, String.format("La ecuacion de la recta es: %s", ecuacionRecta(m, b)), "Ecuacion de la recta", JOptionPane.INFORMATION_MESSAGE);

        }
    }

    private static String ecuacionRecta(double m, double b) {
        return "y=" + m + "x+" + b;
    }

    private static double puntoDeCorte(Point p, double m) {
        return p.getY() - (m * p.getX());
    }

    private static double calcAngulo(double m) {
        return Math.toDegrees(Math.atan(m));
    }

    private static double calcPendiente(Point p1, Point p2) {
        return ((p2.getY() - p1.getY()) / (p2.getX() - p1.getX()));
    }

    private static int recibirInt(String msg) {
        System.out.println(msg);
        int x = 0;
        x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor" + msg));
        return x;
    }

    private static void dibujarEscalera(int altura) {
        for (int i = 0; i < altura + 1; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    private static void escaleraInvertida(int altura) {
        for (int i = altura; i > 0 + 1; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

    private static Point recibirPunto(String msg) {
        System.out.println(msg);
        int x = recibirInt("Ingrese la coordenada x");
        int y = recibirInt("Ingrese la coordenada y");
        return new Point(x, y);
    }
}
