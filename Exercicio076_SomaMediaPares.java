package dev_klaus.lista07;

/*
 * Exercicio 076 - Soma e Média de pares de 50 a 70
 * Feito por Klaus
 */

public class Exercicio076_SomaMediaPares {
    public static void main(String[] args) {
        int soma = 0, count = 0;

        for (int i = 50; i <= 70; i++) {
            if (i % 2 == 0) {
                soma += i;
                count++;
            }
        }

        double media = soma / (double) count;
        System.out.println("Soma dos pares: " + soma);
        System.out.println("Média dos pares: " + media);
    }
}