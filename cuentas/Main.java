package cuentas;

/**
 * Clase que gestiona la operativa de la cuenta.
 */
public class Main {

    public static void main(String[] args) {
        operativa_cuenta(695.0f); // Llamamos a operativa_cuenta con una cantidad de ingreso
    }

    /**
     * Método que realiza operaciones sobre una cuenta bancaria.
     * 
     * @param cantidad Cantidad de dinero a ingresar en la cuenta.
     */
    public static void operativa_cuenta(float cantidad) {
        CCuenta cuenta1; // sustituimos micuenta por cuenta1
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
            cuenta1.ingresar(cantidad); // Se usa la cantidad recibida por parámetro
        } catch (Exception e) {
            System.out.println("Fallo al ingresar");
        }
    }
}
