package com.example.parcial;
import org.junit.Test;

import static org.junit.Assert.*;

public class PruebaUnitariaD {

    @Test
    public void testOperacionesNuevas() {
        int resultadoSuma = sumar(7, 8);
        assertEquals(15, resultadoSuma);

        int resultadoResta = restar(10, 3);
        assertEquals(7, resultadoResta);

        int resultadoFactorial = factorial(4);
        assertEquals(24, resultadoFactorial);
    }

    private int sumar(int a, int b) {
        return a + b;
    }

    private int restar(int a, int b) {
        return a - b;
    }

    private int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
