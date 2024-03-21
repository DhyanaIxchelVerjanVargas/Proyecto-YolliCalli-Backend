package proyecto.yollicalli.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto.yollicalli.model.Categorias; 

@Service
public class CategoriasService {

    private final Categorias categoriasRepository;

    @Autowired
    public CategoriasService(Categorias categoriasRepository) {
        this.categoriasRepository = categoriasRepository;
    }

    public List<Categorias.Categoria> getAllCategorias() {
        return Categorias.getAllCategorias();
    }

	public Categorias getCategoriasRepository() {
		return categoriasRepository;
	}
}
