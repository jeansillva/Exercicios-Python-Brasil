package Listas;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        System.out.println("Digite 5 números:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ":");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Os números digitados são:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        scanner.close();
    }
}
