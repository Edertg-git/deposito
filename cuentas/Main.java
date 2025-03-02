package cuentas;

/**
 * Clase que gestiona la operativa de la cuenta.
 */
public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;	// sustituimos micuenta por cuenta1
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);	// sustituimos micuenta por cuenta1
        saldoActual = cuenta1.estado();	// sustituimos micuenta por cuenta1
        System.out.println("El saldo actual es "+ saldoActual + "€");	// añadimos un espacio despues de "es" para que se separe del saldo y añadimos el símbolo "€".

        try {
            cuenta1.retirar(2300); // sustituimos micuenta por cuenta1
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
           cuenta1.ingresar(695);	// sustituimos micuenta por cuenta1
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
