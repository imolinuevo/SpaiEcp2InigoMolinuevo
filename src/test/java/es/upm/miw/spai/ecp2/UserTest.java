package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
	private User usr;
	
	@Before
	public void before(){
		usr = new User(12, "Pedro", "Picapiedra");
	}

	@Test
	public void testUserIntStringString() {
		assertEquals(12, usr.getNumber());
		assertEquals("Pedro", usr.getName());
		assertEquals("Picapiedra", usr.getFamilyName());
	}

	@Test
	public void testNombreCompleto() {
		assertEquals("Pedro Picapiedra", usr.fullName());
	}

	@Test
	public void testIniciales() {
		assertEquals("P.", usr.initials());
	}

	@Test
	public void testLowerName(){
	     
	}
}
