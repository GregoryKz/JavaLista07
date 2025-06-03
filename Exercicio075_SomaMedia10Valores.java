package dev_klaus.lista07;

/*
 * Exercicio 075 - Soma e Média de 10 valores
 * Ler 10 valores e apresentar soma e média
 * Feito por Klaus
 */

import java.util.Scanner;

public class Exercicio075_SomaMedia10Valores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º valor: ");
            soma += sc.nextInt();
        }

        double media = soma / 10.0;
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
        sc.close();
    }
}
