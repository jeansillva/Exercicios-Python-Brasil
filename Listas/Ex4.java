package Listas;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] palavra = new char[10];

        System.out.println("Digite 10 caracteres diferentes: ");
        for (int i = 0; i < palavra.length; i++) {
            System.out.println("Caractere " + (i + 1));
            palavra[i] = sc.next().charAt(0);
        }
        System.out.println("Letras consoantes: ");
        for (char caracteres : palavra) {
            if (caracteres != 'a' && caracteres != 'e' && caracteres != 'i' && caracteres != 'o' && caracteres != 'u') {
                System.out.println(caracteres);
            }
        }
        sc.close();
    }
}
