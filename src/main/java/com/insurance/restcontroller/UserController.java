package com.insurance.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.User;
import com.insurance.service.UserService;

@RestController
public class UserController {
	@Autowired
private UserService userService;
	/*Build the Restful API to add user details into database 134*/
	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) {
		User users=userService.addUser(user);
		return users;
	}
	/*Build the Restful API to update user details into database 135*/
	@PutMapping("/updateUser")
	public User updateUser(@RequestBody User user) {
		User users=userService.updateUser(user);
		return users;
	}
	/*Build the Restful API to get user details from database 136*/
	@GetMapping("/getUser/{id}")
	public User getUser(@PathVariable("id") Integer id) {
      User user=userService.getUser(id);
      return user;
	}
	/*Build the Restful API to fetch all user details from database 137
*/
	@GetMapping("/getAllUser")
	public List<User> getAllUser() {
	List<User> user=userService.getAllUser();
	return user;
	}
/*	Build the Restful API to delete the user details from database 138*/

	@DeleteMapping("/deleteUser/{id}")
	public void deleteUser(@PathVariable ("id")Integer id) {
		userService.deleteUser(id);
	}
}
