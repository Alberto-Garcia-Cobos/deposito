/**
 * Clase CCuenta del programa deposito, donde se imprementan los métodos 
 * y atributos del programa para ejecutar.
 * @author Alberto
 * @version 4.17 26/01/2021
 */


public class CCuenta {


    private String nombre;
    private String cuenta1;
    private double saldo;
    private double tipo;
/**
 * Obtiene el nombre    
 * @return
 */
    public String getNombre() {
		return nombre;
	}
/**
 * Devuelve el nombre.
 * @param nombre
 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
/**
 * Obtiene el número cuenta.
 * @return
 */
	public String getCuenta1() {
		return cuenta1;
	}
/**
 * Devuelve el número de cuenta.
 * @param cuenta1
 */
	public void setCuenta1(String cuenta1) {
		this.cuenta1 = cuenta1;
	}
/**
 * Obtiene el saldo en cuenta.
 * @return
 */
	public double getSaldo() {
		return saldo;
	}
/**
 * Devuelve el saldo de la cuenta.
 * @param saldo
 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
/**
 * Obtiene el tipo 
 * @return
 */
	public double getTipo() {
		return tipo;
	}
/**
 * Devuelve el tipo
 * @param tipo
 */
	public void setTipo(double tipo) {
		this.tipo = tipo;
	}
/**
 * Construstor CCuenta	
 */
    public CCuenta()
    {
    }
/**
 * Crea los parametros de CCuenta
 * @param nom
 * @param cue
 * @param sal
 * @param tipo
 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta1=cue;
        saldo=sal;
    }
/**
 * Obtiene el estado de la cuenta.
 * @return
 */
    public double estado()
    {
        return saldo;
    }
/**
 * Crea la excepción de no poder ingresar una cantidad negativa.
 * @param cantidad
 * @throws Exception
 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
/**
 * Crea las excepciones al retirar más dinero del posible y
 * retirar una cantidad negativa.
 * @param cantidad
 * @throws Exception
 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
