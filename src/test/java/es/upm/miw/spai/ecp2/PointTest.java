package es.upm.miw.spai.ecp2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PointTest {
    private Point pt;
    private Point pt1;

    @Before
    public void before() {
        pt = new Point(2, 3);
        pt1 = new Point(-101,200);
    }

    @Test
    public void testPuntoIntInt() {
        assertEquals(2, pt.getX());
        assertEquals(3, pt.getY());
        assertEquals(pt1.getX(),-100);
        assertEquals(pt1.getY(),100);
    }

    @Test
    public void testPunto() {
        pt = new Point();
        assertEquals(0, pt.getX());
        assertEquals(0, pt.getY());
    }

    @Test
    public void testModulo() {
        assertEquals(3.6055, pt.module(), 10e-5);
    }

    @Test
    public void testFase() {
        assertEquals(0.9828, pt.phase(), 10e-5);
    }

    @Test
    public void testTranslate() {
        this.pt.translateOrigin(new Point(1, 1));
        assertEquals(1, pt.getX());
        assertEquals(2, pt.getY());
    }

    @Test
    public void testToString() {
        assertEquals("Coordenadas del punto: valorX[2], valorY[3]", pt.toString());
    }

    @Test
    public void testCambiar(){
        pt.Cambiar(3,4);
        assertEquals(pt.getX(), 3);
        assertEquals(pt.getY(), 4);
    }
}
