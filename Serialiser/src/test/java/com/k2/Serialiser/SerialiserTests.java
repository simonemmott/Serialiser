package com.k2.Serialiser;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.k2.Serialiser.model.*;
import com.k2.Util.entity.EntityUtil;

public class SerialiserTests {
	
	private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
	
	@Test
	public void EnittyUtil_isRootEntityTest() {
		
		assertTrue(EntityUtil.isRootEntity(Root1.class));
		assertTrue(EntityUtil.isRootEntity(Root1A.class));
		assertTrue(EntityUtil.isRootEntity(Root1B.class));
		assertTrue(EntityUtil.isRootEntity(Root2.class));
		assertTrue(EntityUtil.isRootEntity(Root3.class));
		assertFalse(EntityUtil.isRootEntity(Entity1.class));
		assertFalse(EntityUtil.isRootEntity(Entity2.class));
		assertFalse(EntityUtil.isRootEntity(Entity3.class));
		assertFalse(EntityUtil.isRootEntity(Embeddable1.class));
		assertFalse(EntityUtil.isRootEntity(Embeddable2.class));


	}
	
	@Test
	public void EnittyUtil_getRootEntityTypeTest() {

		assertEquals(Root1.class, EntityUtil.getRootEntityType(Root1.class));
		assertEquals(Root1A.class, EntityUtil.getRootEntityType(Root1A.class));
		assertEquals(Root1B.class, EntityUtil.getRootEntityType(Root1B.class));
		assertEquals(Root2.class, EntityUtil.getRootEntityType(Root2.class));
		assertEquals(Root3.class, EntityUtil.getRootEntityType(Root3.class));
		assertEquals(Root1B.class, EntityUtil.getRootEntityType(Entity1.class));
		assertEquals(Root1A.class, EntityUtil.getRootEntityType(Entity2.class));
		assertEquals(Root1B.class, EntityUtil.getRootEntityType(Entity3.class));


	}
	
	@Test
	public void EnittyUtil_getParentEntityTypeTest() {
		
		assertNull(EntityUtil.getParentEntityType(Root1.class));
		assertNull(EntityUtil.getParentEntityType(Root1A.class));
		assertNull(EntityUtil.getParentEntityType(Root1B.class));
		assertNull(EntityUtil.getParentEntityType(Root2.class));
		assertNull(EntityUtil.getParentEntityType(Root3.class));
		assertEquals(Root1B.class, EntityUtil.getParentEntityType(Entity1.class));
		assertEquals(Root1A.class, EntityUtil.getParentEntityType(Entity2.class));
		assertEquals(Entity1.class, EntityUtil.getParentEntityType(Entity3.class));


	}
	
	@Test
	public void EntityUtil_getRootEntityTest() {
		Root1A r1a = new Root1A(10L);
		Entity2 e2 = new Entity2();
		e2.setRoot1A(r1a);
		e2.setName("e2");
		r1a.setEntity2(e2);
		assertEquals(r1a, EntityUtil.getRootEntity(e2));
		
		Root1B r1b = new Root1B(20L);
		List<Entity1> e1s = new ArrayList<Entity1>();
		Entity1 e1 = new Entity1();
		e1.setName("e1a");
		e1.setRoot1B(r1b);
		List<Entity3> e3s = new ArrayList<Entity3>();
		e1.setEntity3s(e3s);
		
		Entity3 e3 = new Entity3();
		e3.setName("e3a");
		e3.setEntity1(e1);
		e3s.add(e3);
		
		e1s.add(e1);
		
		r1b.setEntity1s(e1s);
		
		assertEquals(r1b, EntityUtil.getRootEntity(e3));
		assertEquals(r1b, EntityUtil.getRootEntity(e1));
	}
	
	@Test
	public void EntityUtil_getParentEntityTest() {
		Root1A r1a = new Root1A(10L);
		Entity2 e2 = new Entity2();
		e2.setRoot1A(r1a);
		e2.setName("e2");
		r1a.setEntity2(e2);
		assertEquals(r1a, EntityUtil.getParentEntity(e2));
		
		Root1B r1b = new Root1B(20L);
		List<Entity1> e1s = new ArrayList<Entity1>();
		Entity1 e1 = new Entity1();
		e1.setName("e1a");
		e1.setRoot1B(r1b);
		List<Entity3> e3s = new ArrayList<Entity3>();
		e1.setEntity3s(e3s);
		
		Entity3 e3 = new Entity3();
		e3.setName("e3a");
		e3.setEntity1(e1);
		e3s.add(e3);
		
		e1s.add(e1);
		
		r1b.setEntity1s(e1s);
		
		assertEquals(e1, EntityUtil.getParentEntity(e3));
		assertEquals(r1b, EntityUtil.getParentEntity(e1));

	}
	
	
}
