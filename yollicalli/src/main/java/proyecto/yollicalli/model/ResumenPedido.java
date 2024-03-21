package proyecto.yollicalli.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ResumenPedido {
	/*Propiedades*/
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
	private Date fechaPedido;
	private String estadoPedido;
	private int idResumen;
	private static int total=0;
	
	/*Constructores*/
	public ResumenPedido(Date fechaPedido, String estadoPedido) {
		super();
		this.fechaPedido = fechaPedido;
		this.estadoPedido = estadoPedido;
		ResumenPedido.total++;
		idResumen = ResumenPedido.total;
	}

	public ResumenPedido() {
		ResumenPedido.total++;
		idResumen = ResumenPedido.total;
	}

	public Date getFecha() {
		return fechaPedido;
	}

	/*public void setFecha(Date fecha) {
		this.date = fecha;
	}*/

	public String getEstado() {
		return estadoPedido;
	}

	public void setEstado(String estado) {
		this.estadoPedido = estado;
	}

	public int getId() {
		return idResumen;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + idResumen + ", fecha=" + fechaPedido + ", estado=" + estadoPedido + "]";
	}	
	
	
}
