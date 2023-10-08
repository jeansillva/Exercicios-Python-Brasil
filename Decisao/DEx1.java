import java.util.Scanner;

public class DEx1 {
    public static void main(String[] args) {
        // Faça um Programa que peça dois números e imprima o maior deles.
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        double n1 = sc.nextDouble();
        System.out.println("Digite o segundo numero:");
        double n2 = sc.nextDouble();

        if (n1 > n2) {
            System.out.println("O primeiro numero digitado é o maior: " + n1);
        } else {
            System.out.println("O segundo numero digitado é o maior: " + n2);
        }
        sc.close();
    }
}
