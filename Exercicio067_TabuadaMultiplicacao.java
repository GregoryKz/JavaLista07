package dev_klaus.lista07;

/*
 * Exercicio 067 - Tabuada de Multiplicacao
 * Apresentar os resultados de uma tabuada de multiplicar (de 1 até 10)
 * de um número qualquer informado pelo usuário.
 * Feito por Klaus
 */

import java.util.Scanner;

public class Exercicio067_TabuadaMultiplicacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para ver a tabuada: ");
        int numero = scanner.nextInt();

        System.out.println("\nTabuada do " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.printf("%d x %d = %d%n", numero, i, resultado);
        }

        scanner.close();
    }
}
