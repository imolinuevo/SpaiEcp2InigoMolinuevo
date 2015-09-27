package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {
    private Fraction fr;

    @Before
    public void before() {
        fr = new Fraction(6, 13);
    }

    @Test
    public void testFractionIntInt() {
        assertEquals(6, fr.getNumerator());
        assertEquals(13, fr.getDenominator());
    }

    @Test
    public void testFraction() {
        fr = new Fraction();
        assertEquals(1, fr.getNumerator());
        assertEquals(1, fr.getDenominator());
    }

    @Test
    public void testDecimal() {
        assertEquals(0.46, fr.decimal(), 0.01);
    }

    @Test
    public void testMenor() {
        Fraction fr1 = new Fraction(1, 9);
        assertEquals(fr.menor(fr1), fr1);
    }

    @Test
    public void testMayor() {
        Fraction fr1 = new Fraction(1, 2);
        assertEquals(fr.menor(fr1), fr1);
    }
}
