package dev_klaus.lista07;

/*
 * Exercicio 069 - Soma dos Pares até 500
 * Apresentar o somatório dos valores pares existentes na faixa de 1 até 500.
 * Feito por Klaus
 */

public class Exercicio069_SomaPares {
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 2; i <= 500; i += 2) {
            soma += i;
        }
        System.out.println("Soma dos valores pares de 1 até 500: " + soma);
    }
}
