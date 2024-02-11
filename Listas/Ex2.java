package Listas;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] reais = new double[10];

        System.out.println("Digite 10 numeros: ");

        for (int i = 0; i < reais.length; i++) {
            System.out.println("Digite o numero " + (i + 1) + ":");
            reais[i] = sc.nextDouble();
        }

        System.out.println("Os números digitados em ordem invertida são:");
        for (int i = reais.length - 1; i > -1; i--) {
            System.out.println(reais[i]);
        }
        sc.close();

    }
}
