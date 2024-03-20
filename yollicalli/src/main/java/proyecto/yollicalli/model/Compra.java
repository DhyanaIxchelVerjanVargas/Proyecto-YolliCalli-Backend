package proyecto.yollicalli.model;

public class Compra {
	// Atributos
	private double subtotal;
	private double envio;
	private double total;
	private int idCompra;
	private static int totalId = 0;
	
	// Constructores
	public Compra(double subtotal, double envio) {
		this.subtotal = subtotal;
		this.envio = envio;
		this.total = subtotal + envio;
		Compra.totalId++;
		idCompra = Compra.totalId;
	}
	public Compra() {
		Compra.totalId++;
		idCompra = Compra.totalId;
	}
	
	// Métodos
	public int getId() {
		return idCompra;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	public double getEnvio() {
		return envio;
	}
	public void setEnvio(double envio) {
		this.envio = envio;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	@Override
	public String toString() {
		return "Compra [subtotal=" + subtotal + ", envio=" + envio + ", total=" + total + ", idCompra=" + idCompra + "]";
	}
	
	
	
}
