package ar.com.project.entitie;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String name;
	
	@Column(unique=true)
	private String mail;
	
	private Date registrationDate;
	
	@Column(unique=true)
	private String userId;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "user_profile", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "profile_id"))
	private List<Profile> profiles;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public Date getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public List<Profile> getProfiles() {
		return profiles;
	}
	public void setProfiles(List<Profile> profiles) {
		this.profiles = profiles;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", mail=" + mail
				+ ", registrationDate=" + registrationDate + ", userId="
				+ userId + ", profiles=" + profiles + "]";
	}
	
}
