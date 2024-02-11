package Listas;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[4];
        double soma = 0;

        System.out.println("Digite 4 notas: ");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota " + (i + 1));
            notas[i] = sc.nextDouble();
        }

        System.out.println("Notas digitadas: ");
        for (double nota : notas) {
            System.out.println(nota);
            soma += nota;
        }

        double media = soma / notas.length;
        System.out.println("Media das notas: " + media);

        sc.close();
    }
}
