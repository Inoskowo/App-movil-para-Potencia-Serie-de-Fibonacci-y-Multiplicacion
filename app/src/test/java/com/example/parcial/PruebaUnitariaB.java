package com.example.parcial;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.robolectric.Robolectric;

public class PruebaUnitariaB {

    private MainActivity activity;

    @Before
    public void setUp() {
        activity = Robolectric.buildActivity(MainActivity.class).create().visible().get();
    }

    @Test
    public void testMultiplicar() {
        activity.numero1.setText("3");
        activity.numero2.setText("4");
        activity.button_multiplicar.performClick();
        assertEquals("Multiplicación: 12", activity.resultado.getText().toString());
    }

    @Test
    public void testFibonacci() {
        activity.numero1.setText("5");
        activity.button_fibonacci.performClick();
        assertEquals("Fibonacci: 5", activity.resultado.getText().toString());
    }

    @Test
    public void testPotencia() {
        activity.numero1.setText("2");
        activity.numero2.setText("3");
        activity.button_potencia.performClick();
        assertEquals("Potencia: 8.0", activity.resultado.getText().toString());
    }

    @Test
    public void testLimpiar() {
        activity.numero1.setText("2");
        activity.numero2.setText("3");
        activity.button_ncalculo.performClick();
        assertEquals("", activity.numero1.getText().toString());
        assertEquals("", activity.numero2.getText().toString());
    }
}
