package ar.com.project.daos;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import ar.com.project.entities.Profile;

public interface ProfileDAO extends CrudRepository<Profile, Serializable> {

	public Profile findByProfileName(String profileName);
	
	public Profile findById(Long id);
}
