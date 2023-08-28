package com.example.parcial;
import org.junit.Test;
import static org.junit.Assert.*;


public class PruebaUnitariaA {
    @Test
    public void testClaseA() {

        testMultiplicar();
        testFibonacci();
        testPotencia();
    }

    private void testMultiplicar() {
        int resultado = multiplicar(3, 4);
        assertEquals(12, resultado);
    }

    private void testFibonacci() {
        int resultado = fibonacci(5);
        assertEquals(5, resultado);
    }

    private void testPotencia() {
        double resultado = potencia(2, 3);
        assertEquals(8.0, resultado, 0.001);
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
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    private double potencia(int base, int exponente) {
        return Math.pow(base, exponente);
    }
}
