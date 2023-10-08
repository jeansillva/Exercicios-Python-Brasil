import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        // Faça um Programa que peça 2 números inteiros e um número real
        // a soma do triplo do primeiro com o terceiro
        // o terceiro elevado ao cubo.

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero inteiro: ");
        int nm1 = sc.nextInt();

        System.out.println("Digite o segundo numero inteiro: ");
        int nm2 = sc.nextInt();

        System.out.println("Digite um numero real: ");
        double nm3 = sc.nextDouble();

        double op1 = (nm1 * 2) * (nm2 / 2);
        System.out.println("O produto do dobro do primeiro com metade do segundo: " + op1);
        double op2 = (nm1 * 3) + nm3;
        System.out.println("A soma do triplo do primeiro com o terceiro: " + op2);
        double op3 = Math.pow(nm3, 3);
        System.out.println("O terceiro elevado ao cubo: " + op3);

        sc.close();
    }
}
