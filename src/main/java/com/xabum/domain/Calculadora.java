package com.xabum.domain;

public class Calculadora {

    public int somar(int a, int b) {
        int resultado = a + b;
        System.out.println("Resultado da soma: " + resultado);
        return resultado;
    }

    public int subtrair(int a, int b) {
        int resultado = a - b;
        System.out.println("Resultado da subtracao: " + resultado);
        return resultado;
    }
}