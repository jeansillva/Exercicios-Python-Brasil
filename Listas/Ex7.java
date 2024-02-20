package Listas;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] inteiros = new int[5];
        int soma = 0;
        int multiplicacao = 1;

        System.out.println("Digite 5 numeros inteiros: ");
        for (int i = 0; i < inteiros.length; i++) {
            System.out.println((i + 1) + " Numero");
            inteiros[i] = sc.nextInt();
        }

        System.out.println("Números digitados:");
        for (int numero : inteiros) {
            System.out.println(numero);
        }

        for (int numero : inteiros) {
            soma += numero;
            multiplicacao *= numero;
        }

        System.out.println("Soma: " + soma);
        System.out.println("Multiplicação: " + multiplicacao);
        sc.close();

    }
}
