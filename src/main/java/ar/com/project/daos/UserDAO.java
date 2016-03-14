package ar.com.project.daos;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import ar.com.project.entities.User;

public interface UserDAO extends CrudRepository<User, Serializable> {

}
