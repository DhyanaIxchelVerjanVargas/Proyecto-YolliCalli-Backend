package proyecto.yollicalli.model;

public class PayDetails {
	private double amount;
	private int id;
	private static int total = 0;
	
	public PayDetails(double amount) {
		super();
		this.amount = amount;
		PayDetails.total++;
		id= PayDetails.total;
	}
	
	public PayDetails() {
		PayDetails.total++;
		id= PayDetails.total;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
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
		PayDetails.total = total;
	}

	@Override
	public String toString() {
		return "PayDetails [id=" + id + ", amount=" + amount + "]";
	}
}
