import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        // Faça um Programa que peça dois números e imprima a soma.

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero inteiro: ");
        int a = sc.nextInt();
        System.out.println("Digite o segundo numero inteiro: ");
        int b = sc.nextInt();
        int soma = a + b;
        System.out.println("O resultado da soma dos numeros digitados é: " + soma);

        sc.close();
    }
}
