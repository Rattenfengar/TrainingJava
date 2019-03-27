/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Arreglos, metodos y JOptionPane.
 */
package taller6;

import javax.swing.JOptionPane;

/**
 * Bancos Un usario tiene las siguientes propiedades: Nombre, Apellido, Cuenta
 * Bancaria, Saldo, Tipo de cuenta Cuentas disponibles. Depositos Pagos Registro
 * de nuevas cuentas Estadisticas
 *
 * @author Alejandro Ordoñez
 */
public class Taller6 {

    private static final int nCuentas = 3;
    private static int cuentasDisponibles = nCuentas;
    private static String[] nombres = new String[nCuentas];
    private static String[] apellidos = new String[nCuentas];
    private static String[] cuenta = new String[nCuentas];
    private static String[] cedula = new String[nCuentas];
    private static double[] saldo = new double[nCuentas];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        setData();
    }

    private static void setData() {
        for (int i = 0; i < nCuentas; i++) {
            nombres[i] = "N/A";
            apellidos[i] = "N/A";
            cuenta[i] = "N/A";
            cedula[i] = "N/A";
            saldo[i] = 0;
        }
    }

    private static void signUpAccount() {
        JOptionPane.showMessageDialog(null, "Informacion", "Acontinuacion ingrese sus datos", JOptionPane.INFORMATION_MESSAGE);
        String cuenta = JOptionPane.showInputDialog(null, "Ingrese su numero de cuenta");
        if(checkAccount(cuenta)){
            JOptionPane.showMessageDialog(null, "Su cuenta será registrada");
            
        }
    }

    private static String getString(String msg) {
        return JOptionPane.showInputDialog(null, msg);
    }

    private static double getSaldo(String msg) {
        double x = 0;
        try {
            x = Double.parseDouble(JOptionPane.showInputDialog(null, msg));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Alerta", "Dato erroneo", JOptionPane.WARNING_MESSAGE);
        }
        return x;
    }

    private static boolean checkAccount(String ac) {
        if (ac.length() != 4) {
            return false;
        } else {
            for (int i = 0; i < cuenta.length; i++) {
                if (cuenta[i].equals(ac) && !cuenta.equals("N/A")) {
                    return false;
                }
            }
        }
        return true;
    }

}
