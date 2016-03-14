package ar.com.project.daos;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import ar.com.project.entities.Group;

public interface GroupDAO extends CrudRepository<Group, Serializable> {

}
