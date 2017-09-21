package ml.icitapeng.pera.backend.entity;

import java.util.List;

public class Organization {

	private Long id;
	
	private String name;
	
	private Organization parent;
	
	private List<Organization> childs;
	
	private boolean childType;
	
	private String type;
	
	public Organization() {

	}

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

	public Organization getParent() {
		return parent;
	}

	public void setParent(Organization parent) {
		this.parent = parent;
	}

	public List<Organization> getChilds() {
		return childs;
	}

	public void setChilds(List<Organization> childs) {
		this.childs = childs;
	}

	public boolean isChildType() {
		return childType;
	}

	public void setChildType(boolean childType) {
		this.childType = childType;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
