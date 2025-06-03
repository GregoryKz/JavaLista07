package dev_klaus.lista07;

/*
 * Exercicio 068 - Soma dos 100 primeiros números inteiros
 * Apresentar o total da soma obtida dos cem primeiros números inteiros.
 * Feito por Klaus
 */

public class Exercicio068_SomaCemPrimeiros {
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 1; i <= 100; i++) {
            soma += i;
        }
        System.out.println("Soma dos 100 primeiros números inteiros: " + soma);
    }
}