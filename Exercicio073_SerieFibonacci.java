package dev_klaus.lista07;

/*
 * Exercicio 073 - Série de Fibonacci até o 15º termo
 * Apresentar a série de Fibonacci até o décimo quinto termo.
 * Feito por Klaus
 */

public class Exercicio073_SerieFibonacci {
    public static void main(String[] args) {
        int anterior = 0, atual = 1;

        for (int i = 1; i <= 15; i++) {
            System.out.print(atual + " ");
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
    }
}