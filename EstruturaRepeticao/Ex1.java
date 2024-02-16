package EstruturaRepeticao;

import java.util.Scanner;

public class Ex1 {
    // Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem
    // caso o valor seja inválido e continue pedindo até que o usuário informe um
    // valor válido.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma nota de 0 a 10");
        int nota = sc.nextInt();

        while (nota > 10 || nota < 0) {
            System.out.println("Valor inválido! Insira um valor entre 0 e 10: ");
            nota = sc.nextInt();
        }
        sc.close();
    }

}
