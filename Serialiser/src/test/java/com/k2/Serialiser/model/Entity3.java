package com.k2.Serialiser.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.k2.Util.entity.ParentEntity;


@Entity
public class Entity3 {

	@Id
	@Column
	private Long id;
	public Long getId() { return id; }
	
	@Column
	@ParentEntity
	private Entity1 entity1;
	public Entity1 getEntity1() { return entity1; }
	public void setEntity1(Entity1 entity1) { this.entity1 = entity1; }
	
	@Column
	private String name;
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	

}
