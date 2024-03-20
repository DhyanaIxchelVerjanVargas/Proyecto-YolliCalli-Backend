package proyecto.yollicalli.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import proyecto.yollicalli.model.User;



@Service
public class UserService {
	
	public final ArrayList<User> list = new ArrayList<User>();
	
	public UserService() {
		list.add( new User("Edgar Benitez","edgar@gmail.com","5555555555", "12345678"));
		list.add( new User("Jetsael Villegaz","jetsa@gmail.com","6666666666", "87654321"));
		list.add( new User("Nadia Martinez","nadia@gmail.com","7777777777", "24681357"));
		list.add( new User("Ollin Ollin","ollin@gmail.com","8888888888", "13572468"));
	
	}
	
	public ArrayList<User> getAllUsers() {
		return list;
	}//get users


	
	public User getUser(int userId) {
		User tmpUser = null; //tmp= temporal
		for (User user : list) {
			if(user.getId()==userId) {
				tmpUser=user;
				break;
			}// if ==
		}//foreach
		return tmpUser;
	}//get user

	public User addUser(User user) {
		User tmpUser=null;
		if(list.add(user)){
			tmpUser=user;
		}//if
		return tmpUser;
	}

	public User deleteUser(int userId) {
		User tmpUser = null;
		for (User user : list) {
			if(user.getId()==userId) {
				tmpUser=user;
				list.remove(tmpUser);//borra el producto en la lista
				break;
			}// if ==
		}//foreach
		return tmpUser;
	}//delete

	public User updateUser(int userId, String name, String email, String phone, String password) {
		User tmpUser = null;
		for (User user : list) {
			if(user.getId()==userId) {
				tmpUser=user;
				if (name.length()!=0) user.setName(name);
				if (email.length()!=0) user.setEmail(email);
				if (phone.length()!=0) user.setPhone(phone);
				if (password.length()!=0) user.setPassword(password);
				break;
			}// if ==
		}//foreach
		return tmpUser;
	}//put
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
	
	




}
