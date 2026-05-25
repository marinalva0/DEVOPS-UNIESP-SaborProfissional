package com.xabum;

import com.xabum.domain.Calculadora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class XabumCalculadoraTest {

    @Test
    public void testSomar() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.somar(2, 3));
    }

    @Test
    public void testSubtrair() {
        Calculadora calc = new Calculadora();
        assertEquals(1, calc.subtrair(3, 2));
    }
}