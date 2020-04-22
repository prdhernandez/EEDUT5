/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mipackage;

/**
 *
 * @author Nayra Deniz
 */
public class Account {

	public String getTitular() {
		return titular;
	}

	@Override
	public String toString() {
		return "Account [titular=" + titular + ", ccc=" + ccc + ", dineroCuenta=" + dineroCuenta + "]";
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getCcc() {
		return ccc;
	}

	public void setCcc(String ccc) {
		this.ccc = ccc;
	}

	public double getBalance() {
		return dineroCuenta;
	}

	public void setBalance(double balance) {
		this.dineroCuenta = balance;
	}

	public Account() {
		super();
	}

	public Account(double balance) {
		super();
		this.setBalance(balance);
	}

	// Atributos de la clase Account
	private String titular;
	private String ccc;
	private double dineroCuenta = 0;

	// Constructor
	public Account(String nom, String cuenta) {
		this.setTitular(nom);
		this.setCcc(cuenta);
	}

	// Método que me devuelve el saldo disponible en cada momento

	/*
	 * Método para ingresar cantidades en la cuenta. Modifica el saldo.
	 */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		setBalance(getBalance() + cantidad);
	}

	/*
	 * Metodo para retirar cantidades en la cuenta. Modifica el saldo.
	 */
	public void retirar(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede retirar una cantidad negativa.");
		if (getBalance() < cantidad)
			throw new Exception("No hay suficiente saldo para retirar la cantidad solicitada.");
		setBalance(getBalance() - cantidad);
	}

	public void mostrarSaldo() {
		System.out.println("El dinero que hay en la cuenta es " + this.dineroCuenta);
	}

}
