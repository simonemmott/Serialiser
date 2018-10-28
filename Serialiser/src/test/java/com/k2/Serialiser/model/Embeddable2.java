package com.k2.Serialiser.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Embeddable
public class Embeddable2 {

	@Id
	@Column
	private Long id;
	public Long getId() { return id; }
	
	@Column
	private String name;
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	

}
