package ar.com.project.daos;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import ar.com.project.entities.Permission;

public interface PermissionDAO extends CrudRepository<Permission, Serializable> {

}
