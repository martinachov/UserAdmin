package ar.com.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ar.com.project.bos.UserBO;
import ar.com.project.dtos.UserDTO;
import ar.com.project.entities.User;

@RestController
@RequestMapping("/users")
public class UserService {

	@Autowired
	UserBO userBO;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<UserDTO> getAll(){
		return userBO.getAll();
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public UserDTO create(@RequestBody User user){
		return userBO.save(user);
	}
	
	@RequestMapping(method=RequestMethod.DELETE)
	public void delete(@PathVariable Long id){
		userBO.delete(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value = "/assignProfile/{userId}/{profile}")
	public UserDTO assignProfile(@PathVariable Long userId, @PathVariable String profile ){
		return userBO.assignProfile(userId, profile);
	}
	
}