package com.arquitecturajava.webspring.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.arquitecturajava.webspring.models.Persona;

class PersonaTest {

	@Test
	void mayorEdadTest() {
		Persona p = new Persona("Pepe", 20);
		boolean esMayor = p.esMayorEdad();
		assertTrue(esMayor);
	}

	@Test
	void mayorEdadTest2() {
		Persona p = new Persona("Ana", 18);
		boolean esMayor = p.esMayorEdad();
		assertTrue(esMayor);
	}
	
	@Test
	void mayorEdadTest3() {
		Persona p = new Persona("Jorge", 30);
		boolean esMayor = p.esMayorEdad();
		assertTrue(esMayor);
	}
	
	@Test
	void mayorEdadTest4() {
		Persona p = new Persona("Mike", 10);
		boolean esMayor = p.esMayorEdad();
		assertTrue(esMayor);
	}
	
}
