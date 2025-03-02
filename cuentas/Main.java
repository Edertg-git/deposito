package cuentas;

/**
 * Clase que gestiona la operativa de la cuenta.
 */
public class Main {

    public static void main(String[] args) {
        operativa_cuenta(2300); // Llamamos al nuevo método operativa_cueta
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
            System.out.println("Retirada en cuenta de " + cantidad +"€"); // Modificamos para que muestre la cantidad y el símbolo de "€"
            cuenta1.retirar(cantidad);
        } catch (Exception e) {
            System.out.println("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta de 695€"); //Modificamos para que muestre el importe del ingreso
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.println("Fallo al ingresar");
        }
        System.out.println("El saldo actual después de las operaciones es " + cuenta1.estado() + "€");   
    }
}