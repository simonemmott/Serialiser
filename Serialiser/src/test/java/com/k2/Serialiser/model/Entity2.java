package com.k2.Serialiser.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.k2.Util.entity.ParentEntity;
import com.k2.Util.entity.RootEntity;

@Entity
public class Entity2 {

	@Id
	@Column
	private Long id;
	public Long getId() { return id; }
	
	@Column
	@RootEntity
	@ParentEntity
	private Root1A root1a;
	public Root1A getRoot1A() { return root1a; }
	public void setRoot1A(Root1A root1a) { this.root1a = root1a; }
	
	@Column
	private String name;
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	

}
