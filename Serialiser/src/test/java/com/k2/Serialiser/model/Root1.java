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
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="TYPE", discriminatorType = DiscriminatorType.STRING)
public class Root1 {
	
	public Root1(Long id, Root1Type type) {
		this.id = id;
		this.type = type;
	}
	
	@Id
	@Column
	private Long id;
	public Long getId() { return id; }
	public void setId(Long id) { this.id = id; }
	
	@Column
	private String name;
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
	@Column
	private Root1Type type;
	public Root1Type getType() { return type; }
	public void setType(Root1Type type) { this.type = type; }

}
