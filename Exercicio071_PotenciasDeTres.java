package dev_klaus.lista07;

/*
 * Exercicio 071 - Potências de 3
 * Apresentar as potências de 3 de 0 a 15 sem usar o operador ^
 * Feito por Klaus
 */

public class Exercicio071_PotenciasDeTres {
    public static void main(String[] args) {
        int resultado = 1;
        for (int i = 0; i <= 15; i++) {
            System.out.printf("3^%d = %d\n", i, resultado);
            resultado *= 3;
        }
    }
}