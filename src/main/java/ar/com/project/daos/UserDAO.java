package ar.com.project.daos;

import java.io.Serializable;

import org.springframework.data.repository.PagingAndSortingRepository;
import ar.com.project.entities.User;

public interface UserDAO extends PagingAndSortingRepository<User, Serializable> {

	public User findById(Long id);
	
}
