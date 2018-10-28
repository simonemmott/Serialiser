package com.k2.Serialiser.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.k2.Util.entity.ParentEntity;
import com.k2.Util.entity.RootEntity;


@Entity
public class Entity1 {

	@Id
	@Column
	private Long id;
	public Long getId() { return id; }
	
	@Column
	@RootEntity
	@ParentEntity
	private Root1B root1b;
	public Root1B getRoot1B() { return root1b; }
	public void setRoot1B(Root1B root1b) { this.root1b = root1b; }
	
	@Column
	private String name;
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
	@OneToMany
	private List<Entity3> entity3s;
	public List<Entity3> getEntity3s() { return entity3s; }
	public void setEntity3s(List<Entity3> entity3s) { this.entity3s = entity3s; }


}
