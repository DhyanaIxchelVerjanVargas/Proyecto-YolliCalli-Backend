package proyecto.yollicalli.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import proyecto.yollicalli.model.Producto;
import proyecto.yollicalli.service.ProductoService;

@RestController
@RequestMapping(path="/api/products/")
public class ProductoController {
	private final ProductoService productoService;
	@Autowired
	public ProductoController(ProductoService productoService) {
		this.productoService = productoService;
	}
	
	@GetMapping
	public List<Producto> getProducts() {
		return productoService.getAllProductos();
	}
	
	//GET
	@GetMapping(path="{prodId}")
	public Producto getProduto(@PathVariable("prodId") Long prodId) {
		return productoService.getProducto(prodId);
	}
	
	//Post
	@PostMapping
	public Producto addProducto(@RequestBody Producto producto) {
		return productoService.addProducto(producto);
	}
}
