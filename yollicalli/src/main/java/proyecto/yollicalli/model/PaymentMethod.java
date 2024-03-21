package proyecto.yollicalli.model;

public class PaymentMethod {
	private String nombreMetodo;
	private int id;
	private static int total = 0;
	
	public PaymentMethod(String nombreMetodo) {
		super();
		this.nombreMetodo = nombreMetodo;
		PaymentMethod.total++;
		id= PaymentMethod.total;
	}
	
	public PaymentMethod() {
		PaymentMethod.total++;
		id= PaymentMethod.total;
	}

	public String getNombreMetodo() {
		return nombreMetodo;
	}

	public void setNombreMetodo(String nombreMetodo) {
		this.nombreMetodo = nombreMetodo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static int getTotal() {
		return total;
	}

	public static void setTotal(int total) {
		PaymentMethod.total = total;
	}

	@Override
	public String toString() {
		return "paymentMethod [id=" + id + ", nombreMetodo=" + nombreMetodo + "]";
	}
	
	
}
