package proyecto.yollicalli.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import proyecto.yollicalli.model.Usuario; // Cambio de User a Usuario

@Service
public class UserService {
	
	public final ArrayList<Usuario> list = new ArrayList<Usuario>(); // Cambio de User a Usuario
	
	public UserService() {
		list.add(new Usuario("Edgar Benitez","edgar@gmail.com","5555555555", "12345678")); // Cambio de User a Usuario
		list.add(new Usuario("Jetsael Villegaz","jetsa@gmail.com","6666666666", "87654321")); // Cambio de User a Usuario
		list.add(new Usuario("Nadia Martinez","nadia@gmail.com","7777777777", "24681357")); // Cambio de User a Usuario
		list.add(new Usuario("Ollin Ollin","ollin@gmail.com","8888888888", "13572468")); // Cambio de User a Usuario
	}
	
	public ArrayList<Usuario> getAllUsers() {
		return list;
	}

	public Usuario getUser(int userId) {
		Usuario tmpUsuario = null;
		for (Usuario usuario : list) {
			if(usuario.getId()==userId) {
				tmpUsuario=usuario;
				break;
			}
		}
		return tmpUsuario;
	}

	public Usuario addUser(Usuario usuario) {
		Usuario tmpUsuario = null;
		if(list.add(usuario)){
			tmpUsuario=usuario;
		}
		return tmpUsuario;
	}

	public Usuario deleteUser(int userId) {
		Usuario tmpUsuario = null;
		for (Usuario usuario : list) {
			if(usuario.getId()==userId) {
				tmpUsuario=usuario;
				list.remove(tmpUsuario);
				break;
			}
		}
		return tmpUsuario;
	}

	public Usuario updateUser(int userId, String nombre, String email, String telefono, String contrasena) {
		Usuario tmpUsuario = null;
		for (Usuario usuario : list) {
			if(usuario.getId()==userId) {
				tmpUsuario=usuario;
				if (nombre.length()!=0) usuario.setNombre(nombre);
				if (email.length()!=0) usuario.setEmail(email);
				if (telefono.length()!=0) usuario.setTelefono(telefono);
				if (contrasena.length()!=0) usuario.setContrasena(contrasena);
				break;
			}
		}
		return tmpUsuario;
	}
}

//	public User updateUser(int userId, String name, String email, String phone, String password) {
//		User tmpUser = null;
//		for (User user : list) {
//			if(user.getId()==userId) {
//				tmpUser=user;
//				if (name!=null) user.setName(name);
//				if (email!=null) user.setEmail(email);
//				if (phone!=null) user.setPhone(phone);
//				if (password!=null) user.setPassword(password);
//				break;
//			}// if ==
//		}//foreach
//		return tmpUser;
//	}//put
	
	





