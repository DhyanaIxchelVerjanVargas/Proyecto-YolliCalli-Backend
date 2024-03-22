package proyecto.yollicalli.dto;

import java.util.ArrayList;

import proyecto.yollicalli.model.Producto;

public class ProductosResponse {
	private ArrayList<Producto>productos = new ArrayList<Producto>();
	private int nProductos;
	private int nPaginas;
	public ProductosResponse(ArrayList<Producto> productos, int nProductos, int nPaginas) {
		this.productos = productos;
		this.nProductos = nProductos;
		this.nPaginas = nPaginas;
	}
	public ArrayList<Producto> getProductos() {
		return productos;
	}
	public int getnProductos() {
		return nProductos;
	}
	public int getnPaginas() {
		return nPaginas;
	}
}
