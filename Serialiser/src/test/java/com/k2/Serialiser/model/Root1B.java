package com.k2.Serialiser.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("TYPE_B")
public class Root1B extends Root1 {

	public Root1B(Long id) {
		super(id, Root1Type.TYPE_B);
	}

	@Column
	private Boolean checked;
	public Boolean getChecked() { return checked; }
	public void setChecked(Boolean checked) { this.checked = checked; }
	
	@OneToMany
	private List<Root3> root3s;
	public List<Root3> getRoot3s() { return root3s; }
	public void setRoot3s(List<Root3> root3s) { this.root3s = root3s; }

	@OneToMany
	private List<Entity1> entity1s;
	public List<Entity1> getEntity1s() { return entity1s; }
	public void setEntity1s(List<Entity1> entity1s) { this.entity1s = entity1s; }

}
