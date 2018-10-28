package com.k2.Serialiser.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import com.k2.Util.entity.RootEntity;

@Entity
@RootEntity
public class Root2 {
	
	@Id
	@Column
	private Long id;
	public Long getId() { return id; }
	
	@Column
	private String name;
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
	@Column
	private String description;
	public String getDescription() { return description; }
	public void setDescription(String description) { this.description = description; }
	

}
