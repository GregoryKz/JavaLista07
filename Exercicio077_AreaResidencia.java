package dev_klaus.lista07;

/*
 * Exercicio 077 - Cálculo da área total de uma residência
 * Feito por Klaus
 */

import java.util.Scanner;

public class Exercicio077_AreaResidencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double areaTotal = 0;

        while (true) {
            System.out.print("Nome do cômodo: ");
            String nome = sc.next();

            System.out.print("Largura (m): ");
            double largura = sc.nextDouble();

            System.out.print("Comprimento (m): ");
            double comprimento = sc.nextDouble();

            double areaComodo = largura * comprimento;
            areaTotal += areaComodo;

            System.out.println("Área do cômodo " + nome + ": " + areaComodo + " m²");

            System.out.print("Deseja continuar (SIM/NAO)? ");
            String resposta = sc.next();

            if (resposta.equalsIgnoreCase("NAO")) {
                break;
            }
        }

        System.out.println("Área total da residência: " + areaTotal + " m²");
        sc.close();
    }
}
