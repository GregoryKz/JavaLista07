package dev_klaus.lista07;

/*
 * Exercicio 074 - Conversão Celsius para Fahrenheit
 * Apresentar valores de conversão de 10 em 10 de 10 a 100°C
 * Feito por Klaus
 */

public class Exercicio074_CelsiusParaFahrenheit {
    public static void main(String[] args) {
        for (int c = 10; c <= 100; c += 10) {
            double f = (9.0 * c / 5) + 32;
            System.out.printf("%d°C = %.1f°F\n", c, f);
        }
    }
}
