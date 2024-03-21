package proyecto.yollicalli.model;
import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.List;

@Component
public class Categorias {

    public static class Categoria {
        private int idCategoria;
        private String nombreCategoria;

        public Categoria(int idCategoria, String nombreCategoria) {
            this.idCategoria = idCategoria;
            this.nombreCategoria = nombreCategoria;
        }

        public int getIdCategoria() {
            return idCategoria;
        }

        public void setIdCategoria(int idCategoria) {
            this.idCategoria = idCategoria;
        }

        public String getNombreCategoria() {
            return nombreCategoria;
        }

        public void setNombreCategoria(String nombreCategoria) {
            this.nombreCategoria = nombreCategoria;
        }

        @Override
        public String toString() {
            return "Categoria [idCategoria=" + idCategoria + ", nombreCategoria=" + nombreCategoria + "]";
        }
    }

    public static List<Categoria> getAllCategorias() {
        List<Categoria> categorias = new ArrayList<>();
        categorias.add(new Categoria(1, "Alimentos"));
        categorias.add(new Categoria(2, "Ropa"));
        categorias.add(new Categoria(3, "Accesorios para el hogar"));
        categorias.add(new Categoria(4, "Joyería"));
        categorias.add(new Categoria(5, "Cuidado personal"));
        categorias.add(new Categoria(6, "Muebles"));
        return categorias;
    }
}
