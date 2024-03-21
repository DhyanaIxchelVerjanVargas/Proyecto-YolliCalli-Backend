package proyecto.yollicalli.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import proyecto.yollicalli.model.Categorias.Categoria; 
import proyecto.yollicalli.service.CategoriasService;

@RestController
@RequestMapping(path = "/api/categorias/")
public class CategoriasController {

    private final CategoriasService categoriasService;

    @Autowired
    public CategoriasController(CategoriasService categoriasService) {
        this.categoriasService = categoriasService;
    }

    @GetMapping
    public List<Categoria> getCategorias() {
        return categoriasService.getAllCategorias();
    }
}
