import java.util.Scanner;

public class DEx8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do primeiro produto:");
        double p1 = sc.nextDouble();

        System.out.println("Digite o valor do segundo produto:");
        double p2 = sc.nextDouble();

        System.out.println("Digite o valor do terceiro produto:");
        double p3 = sc.nextDouble();

        sc.close();

        if (p1 < p2 && p1 < p3) {
            System.out.println("Você deve comprar o primeiro produto de valor: " + p1);
        } else if (p2 < p1 && p2 < p3) {
            System.out.println("Você deve comprar o segundo produto de valor: " + p2);
        } else {
            System.out.println("Você deve comprar o terceiro produto de valor: " + p3);
        }

    }
}
