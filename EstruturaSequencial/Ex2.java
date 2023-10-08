import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        // Faça um Programa que peça um número e então mostre a mensagem O número
        // informado foi [número].
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        double nmr = sc.nextDouble();

        System.out.println("O numero digitado foi: " + nmr);

        sc.close();
    }
}
