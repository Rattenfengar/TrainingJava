
import java.awt.Point;
import java.util.Scanner;

public class Puntos2 {

    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        /**
         * Hacer que el programa de pit�goras se repita 5 veces. Al inicio de
         * cada repetici�n dibujar una escalera de asteriscos con el n�mero de
         * veces ejecutado el programa Al final de cada repartici�n dibujar una
         * pir�mide hacia abajo (opcional)
         */
        //for para que el programa se repita 5 veces
        for (int n = 0; n < 5; n++) {
            darSaludo();
            Point p1 = recibirPunto("Punto 1");
            Point p2 = recibirPunto("Punto 2");
            cajaTexto(String.format("Estas son tus coordenadas punto 1: (%.0f,%.0f)", p1.getX(), p1.getY()));

            cajaTexto(String.format("Estas son tus coordenadas punto 2: (%.0f,%.0f)", p2.getX(), p2.getY()));
            cajaTextoMenor(String.format("Angulo de la recta: %.2f", calcularAngulo(p1, p2)), "<>");
            System.out.println("La pendiente de la recta es: " + calcularPendiente(p1, p2));

            //for escalera 
            for (int i = 0; i < n + 1; i++) {
                for (int j = 0; j < i + 1; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
            System.out.format("La distancia entre los puntos es:  %.2f  %n", calcularDistancia(p1, p2));
            //for(3)
            for (int P = n; P > -1; P--) {
                for (int j = 0; j < P + 1; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
            double x = calcularPendiente(p1, p2);
            cajaTexto(ecuacionRecta(x, puntoCruze(p1, x, p2)));
            verificarRango(p1, x, puntoCruze(p1, x, p2), p2);
        }

    }

    //Fuera del main
    private static void darSaludo() {
        System.out.println("*****************************************************");
        System.out.println("Bienvenidos al programa realizado por Natalia Ram�rez");
        System.out.println("*****************************************************");
    }

    private static Point recibirPunto(String str) {
        int x = 0, y = 0;
        System.out.println("Insertar coodernada x de " + str);
        x = recibirEntero();
        System.out.println("Insertar coodernada y de " + str);
        y = recibirEntero();
        Point a = new Point(x, y);
        return a;

    }

    /**
     * teorema de pitagoras
     *
     * @return
     */
    private static double calcularDistancia(Point p1, Point p2) {
        double res = Math.sqrt((Math.pow((p2.x - p1.x), 2)) + (Math.pow((p2.y - p1.y), 2)));
        return res;
    }

    //m=(y2-y1)/(x2-x1)
    private static double calcularPendiente(Point p1, Point p2) {
        double m = 0;
        try {
            m = (p2.y - p1.y) / (p2.x - p1.x);
        } catch (Exception e) {
            System.out.println("Error, pendiente indefinida " + e);
        }
        return m;
    }

    //Agregar un m�todo que calcule el �ngulo del vector entre los dos puntos.
    //angle=atan((y2-y1)/(x2-x1))
    private static double calcularAngulo(Point p1, Point p2) {
        double angle = 0;
        angle = Math.atan(p2.y - p1.y) / (p2.x - p1.x);
        return angle;
    }

    /**
     * Solicitar datos al usuario
     *
     * @return numero recibido
     */
    private static int recibirEntero() {

        int salida = 0;

        System.out.println("Please enter a positive number!");
        while (!teclado.hasNextInt()) {
            System.out.println("That's not a number!");
            teclado.next(); // this is important!
        }
        salida = teclado.nextInt();

        return salida;
    }

    /**
     *
     * m�todo que muestra un String rodeado por un borde
     *
     * @param str cadena de texto que quiere ser impresa
     *
     * @return n la longitud de la cadena de texto recibida
     *
     * @see java.util.regex.Pattern#DOTALL
     *
     */
    public static int cajaTexto(String str) {

        int n = str.length();

        System.out.println("##" + str.replaceAll("(?s).", "#") + "##");
        System.out.println("# " + str + " #");
        System.out.println("##" + str.replaceAll("(?s).", "#") + "##");
        System.out.println();

        return n;
    }

    //caja <>
    public static void cajaTextoMenor(String str, String ui) {
        int op = str.length();
        for (int i = 0; i < (op / 2) + 3; i++) {
            System.out.print(ui);
        }
        System.out.println();
        System.out.println(ui + " " + str + " " + ui);
        for (int i = 0; i < (op / 2) + 3; i++) {
            System.out.print(ui);
        }
        System.out.println();
    }

    //Realizar m�todos que calcule la ecuaci�n de la recta (y=mx+b)  que forman los dos puntos.
    //  m=(y2-y1)/(x2-x1)       b=y1-mx1
    /**
     * Recibir un numero x y si se encuentra dentro de (x1,x2) imprimir el valor
     * y correspondiente en caso contrario decir que se encuentra fuera del
     * rango
     */
    private static double puntoCruze(Point p1, Double m, Point p2) {
        double b;
        b = (p1.y - (m * p1.x));
        System.out.println("Punto de corte b: " + b);
        return b;
    }

    private static void verificarRango(Point p1, double m, double b, Point p2) {

        double y;
        int numero;
        System.out.println("ingrese un numero x");
        numero = recibirEntero();
        if (((numero >= p1.x) && (numero <= p2.x))) {
            y = ((m * numero) + b);
            System.out.println("y: " + y);

            System.out.println("Su n�mero est� dentro del rango");
        } else {
            System.out.println("Su n�mero se encuentra fuera del rango");
        }
    }

    private static String ecuacionRecta(double m, double b) {
        return String.format("La ecuaci�n de la recta es y= %.0f x+%.0f", m, b);

    }

}
