package ar.com.project.entitie;

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
@Table(name = "groups")
public class Group {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(unique = true)
	private String groupName;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "groups_permissions", joinColumns = @JoinColumn(name = "group_id"), inverseJoinColumns = @JoinColumn(name = "permission_id"))
	private List<Permission> permissions;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameGroup() {
		return groupName;
	}

	public void setNameGroup(String nameGroup) {
		this.groupName = nameGroup;
	}

	public List<Permission> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}

	@Override
	public String toString() {
		return "Group [id=" + id + ", nameGroup=" + groupName
				+ ", permissions=" + permissions + "]";
	}

}
