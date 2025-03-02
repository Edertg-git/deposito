package cuentas;

/**
 * Clase que gestiona la operativa de la cuenta.
 */
public class Main {

    public static void main(String[] args) {
        operativa_cuenta(695f); // Llamamos al nuevo método con una cantidad de ejemplo
    }

    /**
     * Método que realiza la operativa de la cuenta.
     * 
     * @param cantidad Cantidad a ingresar en la cuenta
     */
    public static void operativa_cuenta(float cantidad) {
        CCuenta cuenta1; // Variable de cuenta
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual + "€");

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.println("Fallo al retirar");
        }

        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(cantidad);
        } catch (Exception e) {
            System.out.println("Fallo al ingresar");
        }
    }
}