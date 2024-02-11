package Listas;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] inteiros = new int[20];

        for (int i = 0; i < inteiros.length; i++) {
            System.out.println("Digite o " + (i + 1) + " numero: ");
            inteiros[i] = sc.nextInt();
        }

    }
}
