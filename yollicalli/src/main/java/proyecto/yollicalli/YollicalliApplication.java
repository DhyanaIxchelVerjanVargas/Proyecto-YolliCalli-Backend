package proyecto.yollicalli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class YollicalliApplication {

	public static void main(String[] args) {
		SpringApplication.run(YollicalliApplication.class, args);
	}//main
	@Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/api/**") // Configura el acceso CORS para las rutas que empiezan con /api
                        .allowedOrigins("http://127.0.0.1:5502") // Permite acceso desde http://127.0.0.1:5502
                        .allowedMethods("GET", "POST", "PUT", "DELETE") // Permite los métodos HTTP especificados
                        .allowedHeaders("*"); // Permite todos los encabezados
            }
        };
    }
}
