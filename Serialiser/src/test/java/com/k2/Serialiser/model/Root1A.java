package com.k2.Serialiser.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("TYPE_A")
public class Root1A extends Root1 {
	
	public Root1A(Long id) {
		super(id, Root1Type.TYPE_A);
	}

	@Column
	private String description;
	public String getDescription() { return description; }
	public void setDescription(String description) { this.description = description; }
	
	@Column
	private Root2 root2;
	public Root2 getRoot2() { return root2; }
	public void setRoot2(Root2 root2) { this.root2 = root2; }
	
	@Column
	private Entity2 entity2;
	public Entity2 getEntity2() { return entity2; }
	public void setEntity2(Entity2 entity2) { this.entity2 = entity2; }
	
	@Column
	private Embeddable1 embeddable1;
	public Embeddable1 getEmbeddable1() { return embeddable1; }
	public void setEmbeddable1(Embeddable1 embeddable1) { this.embeddable1 = embeddable1; }
	

}
