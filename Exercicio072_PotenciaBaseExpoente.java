package dev_klaus.lista07;

/*
 * Exercicio 072 - Potência Base e Expoente
 * Apresentar o valor de uma base elevada a um expoente, sem usar ^
 * Feito por Klaus
 */

import java.util.Scanner;

public class Exercicio072_PotenciaBaseExpoente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a base: ");
        int base = sc.nextInt();
        System.out.print("Digite o expoente: ");
        int expoente = sc.nextInt();

        int resultado = 1;
        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }

        System.out.println("Resultado: " + resultado);
        sc.close();
    }
}
