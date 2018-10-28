package com.k2.Serialiser.model;

import java.util.Date;

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
public class Root3 {
	
	@Id
	@Column
	private Long id;
	public Long getId() { return id; }
	
	@Column
	private String name;
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
	@Column
	private Date created;
	public Date getCreated() { return created; }
	public void setCreated(Date created) { this.created = created; }
	
	@Column
	private Boolean checked;
	public Boolean getChecked() { return checked; }
	public void setChecked(Boolean checked) { this.checked = checked; }
	
	@Column
	private Double amount;
	public Double getAmount() { return amount; }
	public void setAmount(Double amount) { this.amount = amount; }
	

}
