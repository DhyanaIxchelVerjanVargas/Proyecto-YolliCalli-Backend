package proyecto.yollicalli.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import proyecto.yollicalli.model.ProductosResponse;
import proyecto.yollicalli.service.ProductoService;

@RestController
@RequestMapping(path = "/tienda")
public class TiendaController {
	private final ProductoService productoService;
	
	@Autowired
	public TiendaController(ProductoService productoService) {
		this.productoService = productoService;
	}
	
	@GetMapping(path = "/productos")
	public ProductosResponse getProductos(
			@RequestParam (required=false) String buscar,
			@RequestParam (required=false) int pagina){
		if(buscar != null) {
			return productoService.getProductosBuscar(pagina,buscar);
		}else {
			return productoService.getAllProductos(pagina);
		}
		
	}

}

