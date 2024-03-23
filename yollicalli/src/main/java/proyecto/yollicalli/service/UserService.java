package proyecto.yollicalli.service;


import java.util.List;

import org.springframework.stereotype.Service;

import proyecto.yollicalli.model.Usuario;
import proyecto.yollicalli.repository.UserRepository;

@Service
public class UserService {
	
	//public final ArrayList<Usuario> list = new ArrayList<Usuario>();
	private final UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
//		list.add(new Usuario("Edgar Benitez","edgar@gmail.com","5555555555", "12345678")); // Cambio de User a Usuario
//		list.add(new Usuario("Jetsael Villegaz","jetsa@gmail.com","6666666666", "87654321")); // Cambio de User a Usuario
//		list.add(new Usuario("Nadia Martinez","nadia@gmail.com","7777777777", "24681357")); // Cambio de User a Usuario
//		list.add(new Usuario("Ollin Ollin","ollin@gmail.com","8888888888", "13572468")); // Cambio de User a Usuario
		this.userRepository = userRepository;
	}
	
	public List<Usuario> getAllUsers() {
		return userRepository.findAll();
	}

	public Usuario getUser(Long userId) {
//		Usuario tmpUsuario = null;
//		for (Usuario usuario : list) {
//			if(usuario.getId()==userId) {
//				tmpUsuario=usuario;
//				break;
//			}
//		}
//		return tmpUsuario;
		return userRepository.findById(userId).orElseThrow(
				()-> new IllegalArgumentException("El usuario con el id[" +
					userId	+ "] no se encuentra registrado ")
				);
	}//get user
	
	public Usuario deleteUser(Long userId) {
		Usuario tmpUsuario = null;
//		for (Usuario usuario : list) {
//			if(usuario.getId()==userId) {
//				tmpUsuario=usuario;
//				list.remove(tmpUsuario);
//				break;
//			}
//		}
		if(userRepository.existsById(userId)) {
			tmpUsuario=userRepository.findById(userId).get();
			userRepository.deleteById(userId);
		}//if
		return tmpUsuario;
	}

	public Usuario addUser(Usuario usuario) {
		Usuario tmpUsuario = null;
//		if(list.add(usuario)){
//			tmpUsuario=usuario;
//		}
		userRepository.save(usuario);
		return tmpUsuario;
	}



	public Usuario updateUser(Long userId, String nombre, String correo, String telefono, String contrasenia) {
		Usuario tmpUsuario = null;
		if(userRepository.existsById(userId)) {
			tmpUsuario=userRepository.findById(userId).get();
				if (nombre.length()!=0) tmpUsuario.setNombre(nombre);
				if (correo.length()!=0) tmpUsuario.setCorreo(correo);
				if (telefono.length()!=0) tmpUsuario.setTelefono(telefono);
				if (contrasenia.length()!=0) tmpUsuario.setContrasenia(contrasenia);
				userRepository.save(tmpUsuario);
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