import java.util.Scanner;

public class DEx2 {
    public static void main(String[] args) {
        // Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou
        // negativo.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double nmr = sc.nextDouble();

        if (nmr >= 0) {
            System.out.println("O numero digitado é positivo!");
        } else {
            System.out.println("O numero digitado é negativo!");
        }
        sc.close();
    }
}
