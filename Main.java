public class Main {
/**
 * Clase principal del programa deposito.
 * Su función es operativa de una cuenta de dinero.
 * @author Alberto
 * @version 4.17 26/01/2021
 * @see https://github.com/Alberto-Garcia-Cobos/deposito
 * @param args
 */
    public static void main(String[] args) {
    	
    	operativa_cuenta();
    }
/**
 * Método operativa cuenta  indica las acciones del usuario Antonio Lopez
 * de retirada e ingreso de la cuenta  	
 * @return El dinero que que tiene en la cuenta.
 */
    	private static void operativa_cuenta() {
        CCuenta miCuenta;
        double saldoActual;
        float cantidad;
        miCuenta = new CCuenta("Antonio LÃ³pez","1000-2365-85-1230456789",2500,0);
        saldoActual = miCuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            miCuenta.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            miCuenta.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    	}
    }

