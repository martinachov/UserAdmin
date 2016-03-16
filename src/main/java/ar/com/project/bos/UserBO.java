package ar.com.project.bos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ar.com.project.daos.UserDAO;
import ar.com.project.dtos.UserDTO;
import ar.com.project.entities.User;
import ar.com.project.helper.MappingHelper;

@Component
public class UserBO {

	@Autowired
	UserDAO userDAO;
	
	@Autowired
	MappingHelper mapper;
	
	public List<UserDTO> getAll(){
		List<User> users = (List<User>) userDAO.findAll();
		return mapper.map(users, UserDTO.class);
	}

	public UserDTO save(User userToSave) {
		User user = userDAO.save(userToSave);
		return mapper.map(user, UserDTO.class);
	}

	public void delete(Long id) {
		User user = userDAO.findById(id);
		userDAO.delete(user);
	}
	
	
}
