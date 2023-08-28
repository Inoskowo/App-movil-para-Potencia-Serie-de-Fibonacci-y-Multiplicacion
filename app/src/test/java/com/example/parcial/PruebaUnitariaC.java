package com.example.parcial;

import org.junit.Test;
import static org.junit.Assert.*;

public class PruebaUnitariaC {

    @Test
    public void testCombinado() {
        int resultadoMultiplicar = multiplicar(2, 3);
        assertEquals(6, resultadoMultiplicar);

        int resultadoFibonacci = fibonacci(6);
        assertEquals(8, resultadoFibonacci);

        double resultadoPotencia = potencia(2, 4);
        assertEquals(16.0, resultadoPotencia, 0.001);
    }

    private int multiplicar(int a, int b) {
        return a * b;
    }

    private int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    private double potencia(int base, int exponente) {
        return Math.pow(base, exponente);
    }
}
