package dev_klaus.lista07;

/*
 * Exercicio 078 - Maior e menor valor até número negativo
 * Feito por Klaus
 */

import java.util.Scanner;

public class Exercicio078_MaiorMenorValor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        while (true) {
            System.out.print("Digite um número inteiro positivo (ou negativo para sair): ");
            int valor = sc.nextInt();

            if (valor < 0) break;

            if (valor > maior) maior = valor;
            if (valor < menor) menor = valor;
        }

        if (maior == Integer.MIN_VALUE) {
            System.out.println("Nenhum valor positivo foi informado.");
        } else {
            System.out.println("Maior valor: " + maior);
            System.out.println("Menor valor: " + menor);
        }

        sc.close();
    }
}
