package proyecto.yollicalli.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import proyecto.yollicalli.model.Producto;
import proyecto.yollicalli.model.ProductosResponse;

@Service
public class ProductoService {
	public final ArrayList<Producto>lista = new ArrayList<Producto>();
	public ProductoService() {
		lista.add(new Producto("Cojín Tenango",1,"Bordado por artesanos de Tenango.",399.99, "https://res.cloudinary.com/dayprjvbg/image/upload/v1710819158/YolliCalli/bxesfmz5sbgrcmoc6bhh.jpg",1,"",10));
		lista.add(new Producto("Cojines Chiapanecos",2,"Cojines bordados por artesanos del estado de Chiapas.",299.99, "https://res.cloudinary.com/dayprjvbg/image/upload/v1710819201/YolliCalli/cgc0xlww7ux1bl6m0q9s.jpg",1,"",20));
		lista.add(new Producto("Sagrado Corazón",3,"Bordado con hilos de algodón y chaquira.",99.99, "https://res.cloudinary.com/dayprjvbg/image/upload/v1710819249/YolliCalli/ioi9064pkzqjpksc4ell.jpg",1,"",10));
		lista.add(new Producto("Camino de mesa",2,"Camino de mesa colo fiusha, bordado con hilos de algodón.",115.99, "https://res.cloudinary.com/dayprjvbg/image/upload/v1710819229/YolliCalli/tbchniksldikgm5k7umz.jpg",1,"",50));
		lista.add(new Producto("Blusa Oaxaqueña",4,"Camisa de color negro con flores amarillas borda a mano, 100% algodón.",500.99, "https://res.cloudinary.com/dayprjvbg/image/upload/v1710819272/YolliCalli/dyhbffsz5mbeetc6h4at.jpg",1,"",5));
		lista.add(new Producto("Cesto Tejido",5,"Cesto tejido a mano de color blanco con azul.",150.99, "https://res.cloudinary.com/dayprjvbg/image/upload/v1710819284/YolliCalli/cmzv9fnrpzjhyvvle0i3.jpg",1,"",50));
		lista.add(new Producto("Alebrije",6,"Alebrije elaborado con papel mache y pintado a mano.",99.99, "https://res.cloudinary.com/dayprjvbg/image/upload/v1710819301/YolliCalli/skvwjkyvkw15vlgs6wmh.jpg",1,"",10));
		lista.add(new Producto("Cazuela de barro",1,"Cazuela elaborada con barro y pintada a mano.",59.99, "https://res.cloudinary.com/dayprjvbg/image/upload/v1710819314/YolliCalli/oo4mmc4msype2exttysx.jpg",1,"",33));
		lista.add(new Producto("Alebrije Búho",2,"Alebrije de búho elaborado con papel mache y pintado a mano, por artesanos del estado de Oaxaca.",200.50,"https://programadestinosmexico.com/wp-content/uploads/2023/08/ARTESANIAS-OAX.jpg",0,"",5));
		lista.add(new Producto("Alebrije Ajolote",3,"Alebrije de ajolote elaborado con papel mache y pintado a mano por artesanos del estado de Oxaca",200.50,"https://media.licdn.com/dms/image/D5612AQFx8phwV2yN6g/article-cover_image-shrink_720_1280/0/1697657051080?e=2147483647&v=beta&t=H57I5dr3zSXi79Rjsc5iTNgOweSYmRbCZw5eWzfAiVA",0,"",3));
		lista.add(new Producto("Muñeca lele",4,"Muñeca Lele elabora a mano por manos artesanas del estado de Queretaro, para encantar el corazón de las personas.",99.99,"https://www.turismomexico.es/wp-content/uploads/2019/01/munecas_mexicanas.jpg",0,"",20));
		lista.add(new Producto("Florero Artesenal",5,"Florero de talavera, alaborado a partir de archilla, pintado a mano hecho por artezanos del estado de Puebla",249.99,"https://http2.mlstatic.com/D_NQ_NP_708931-MLM71088880686_082023-O.webp",0,"",5));
		lista.add(new Producto("Mezcal en olla de barro",1,"Mezcal Joven 100% artesanal, elborado a partir de agave Espadin con un grado de alcohol del 45%.",200,"https://i.pinimg.com/originals/fb/c4/1a/fbc41ad7a84bf6788e0e9ba69140dddd.jpg",0,"",10));
		lista.add(new Producto("Alegría de amaranto",1,"Elaborado a partir de amaranto y miel, con productos organicos.",33.33,"https://biotrendies.com/wp-content/uploads/2015/07/alegria-amaranto.jpg",0,"",100));
		lista.add(new Producto("Carrito de juguete",6,"Carrito de juguete elaborado de madera y pintado a mano, con madera controlada.",99.99,"https://http2.mlstatic.com/D_NQ_NP_845988-MLM53611700096_022023-O.webp",0,"",15));
	}
	
	public Producto getProducto(int prodId) {
		Producto tmpProd = null;
		for (Producto producto : lista) {
			if (producto.getIdProducto() == prodId) {
				tmpProd = producto;
				break;
			}
		}
		return tmpProd;
	}
	
	public ArrayList<Producto> getAllProductos(){
		return lista;
	}
	
	public ProductosResponse getAllProductos(int pagina) {
		int tamanio = lista.size();
        int productosPorPagina = 12;
        int inicio = (pagina - 1) * productosPorPagina;
        int fin = Math.min(inicio + productosPorPagina, lista.size());
        ArrayList<Producto> productosPagina = new ArrayList<Producto>(lista.subList(inicio, fin));
        int paginas = (int) Math.ceil((double) tamanio / productosPorPagina);
        return new ProductosResponse(productosPagina, tamanio, paginas);
	}
	
    public ProductosResponse getProductosBuscar(int pagina, String buscar) {
        int productosPorPagina = 12;
        ArrayList<Producto> productosCoincidentes = new ArrayList<>();
        String[] palabrasClave = buscar.split("_");
        
        for (Producto producto : lista) {
            for (String palabra : palabrasClave) {
                if (producto.getNombreProducto().toLowerCase().contains(palabra.toLowerCase())) {
                    productosCoincidentes.add(producto);
                    break;
                }
            }
        }
        
        int inicio = (pagina - 1) * productosPorPagina;
        int fin = Math.min(inicio + productosPorPagina, productosCoincidentes.size());
        ArrayList<Producto> productosPagina = new ArrayList<Producto>(productosCoincidentes.subList(inicio, fin));
        int tamanio = productosCoincidentes.size();
        int paginas = (int) Math.ceil((double) tamanio / productosPorPagina);
        
        return new ProductosResponse(new ArrayList<>(productosPagina), tamanio, paginas);
    }
    
    public Producto addProducto(Producto producto) {
    	Producto tmpProducto=null;
    	if(lista.add(producto)) {
    		tmpProducto = producto;
    	}
    	return tmpProducto;
    }

}
