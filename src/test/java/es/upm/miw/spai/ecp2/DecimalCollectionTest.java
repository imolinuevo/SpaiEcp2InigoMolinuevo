package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DecimalCollectionTest {
private DecimalCollection coll;
	
	@Before
	public void before(){
		coll = new DecimalCollection();
		coll.add(1.2);
		coll.add(0.78);
		coll.add(3.01);
	}

	@Test
	public void testColeccionDecimal() {
		coll = new DecimalCollection();
		assertEquals(0, coll.size());
	}

	@Test
	public void testSuma() {
		assertEquals(4.99, coll.sum(), 0);
	}

	@Test
	public void testValorAlto() {
		assertEquals(3.01, coll.higher(), 0);
	}

	@Test
    public void testMenor(){
    	coll = new DecimalCollection();
    	coll.add(-3);
    	coll.add(5);
	  	assertTrue(coll.menor() == -3);
	   }
	
	@Test
	public void testtamno(){
		coll = new DecimalCollection();
    	coll.add(-5);
    	coll.add(2);
    	coll.add(6);
    	assertTrue(coll.tamano() == 3);
	}
}
