package cuentas;

/**
 * Clase que representa una cuenta bancaria.
 */
public class CCuenta {
    
    // Atributos encapsulados (cambiados de public a private)
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor de la clase CCuenta.
     * 
     * @param nom   Nombre del titular
     * @param cue   Número de cuenta
     * @param sal   Saldo inicial
     * @param tipo  Tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        this.nombre = nom;
        this.cuenta = cue;
        this.saldo = sal;
        this.tipoInterés = tipo;
    }

    /**
     * Método para obtener el saldo actual de la cuenta.
     * 
     * @return Saldo actual.
     */
    public double estado() {
        return saldo;
    }

    /**
     * Método para ingresar dinero en la cuenta.
     * 
     * @param cantidad Cantidad a ingresar
     * @throws Exception Si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo += cantidad;
    }

    /**
     * Método para retirar dinero de la cuenta.
     * 
     * @param cantidad Cantidad a retirar
     * @throws Exception Si la cantidad es negativa o mayor que el saldo
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (saldo < cantidad) {
            throw new Exception("No hay suficiente saldo");
        }
        saldo -= cantidad;
    }

    // MÉTODOS GETTER Y SETTER PARA ACCEDER A LOS ATRIBUTOS PRIVADOS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTipoInteres() {
        return tipoInterés;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInterés = tipoInteres;
    }
}
