package proyecto.yollicalli.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import proyecto.yollicalli.model.User;
import proyecto.yollicalli.service.UserService;

@RestController
@RequestMapping (path="/api/users/")
public class UserController {

	private final UserService userService;
	@Autowired //se generan aqui y se agrega el metodo a service
	public UserController(UserService userService) {
		this.userService=userService;
	}//user controller
	
	@GetMapping
	public ArrayList<User> getUsers() {
		return userService.getAllUsers();	
	}//get users
	
	@GetMapping (path="{userId}")//http:localhost:8080/api/users/1
	public User getUser(@PathVariable("userId") int userId) {
		return userService.getUser(userId);
	}//getProduct|
	
	@PostMapping
	public User addProduct(@RequestBody User product) {
		return userService.addUser(product);
	}//adduser
	
	@DeleteMapping (path="{userId}")
	public User deleteUser(@PathVariable("userId") int userId) {
		return userService.deleteUser(userId);
	}//delete
	@PutMapping(path="{userId}")
	public User updateUser(@PathVariable("userId") int userId,
			@RequestBody User user) {
		return userService.updateUser(userId, user.getName(), user.getEmail(), user.getPhone(), user.getPassword());
	}//put
//	@PutMapping(path="{userId}")
//	public User updateUser(@PathVariable("userId") int userId,
//			@RequestParam (required=false) String name, 
//			@RequestParam (required=false) String email, 
//			@RequestParam (required=false) String phone,
//			@RequestParam (required=false) String password) {
//		return userService.updateUser(userId, name, email, phone, password);
//	}//put
}//class ProductController
	
	
	

