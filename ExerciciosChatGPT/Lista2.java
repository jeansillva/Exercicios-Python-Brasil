package ExerciciosChatGPT;

import java.util.Scanner;

public class Lista2 {
    // Escreva um programa em Java que recebe uma lista de números inteiros do
    // usuário e calcula a média desses números.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o tamanho da lista: ");
        int tamanho = sc.nextInt();
        int[] numeros = new int[tamanho];

        System.out.println("Insira um numero por vez na lista com ENTER: ");

        for (int i = 0; i < tamanho; i++) {
            int entrada = sc.nextInt();
            numeros[i] = entrada;
        }

        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }

        double media = (double) soma / numeros.length;
        System.out.println(media);

        sc.close();

    }
}
