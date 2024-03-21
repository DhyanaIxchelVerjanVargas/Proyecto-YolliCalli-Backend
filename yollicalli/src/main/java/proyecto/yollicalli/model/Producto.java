package proyecto.yollicalli.model;


public class Producto {
	private int idProducto;
	private String nombreProducto;
	private int idCategoria;
	private String descripcion;
	private double precio;
	private String imagen;
	private int destacado;
	private int cantidad;
	private String talla;
	private static int total = 0;
	
	public Producto(String nombreProducto, int idCategoria, String descripcion, double precio, String imagen,
			int destacado,String talla ,int cantidad) {
		super();
		this.nombreProducto = nombreProducto;
		this.idCategoria = idCategoria;
		this.descripcion = descripcion;
		this.precio = precio;
		this.imagen = imagen;
		this.destacado = destacado;
		this.cantidad = cantidad;
		this.talla = talla; 
		Producto.total++;
		idProducto = Producto.total;
	}
	
	public Producto() {
		Producto.total++;
		idProducto = Producto.total;
	}
	
	public int getIdProducto() {
		return idProducto;
	}

	public int getIdCategoria() {
		return idCategoria;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public int getDestacado() {
		return destacado;
	}

	public void setDestacado(int destacado) {
		this.destacado = destacado;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", nombreProducto=" + nombreProducto + ", idCategoria="
				+ idCategoria + ", descripcion=" + descripcion + ", precio=" + precio + ", imagen=" + imagen
				+ ", destacado=" + destacado + ", cantidad=" + cantidad + ", talla=" + talla + "]";
	}	
	
}

