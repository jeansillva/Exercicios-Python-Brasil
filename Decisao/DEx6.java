import java.util.Scanner;

public class DEx6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero:");
        double a = sc.nextDouble();

        System.out.println("Digite o segundo numero:");
        double b = sc.nextDouble();

        System.out.println("Digite o terceiro numero:");
        double c = sc.nextDouble();

        sc.close();

        if (a > b && a > c) {
            System.out.println("O primeiro numero digitado é o maior!");
        } else if (b > a && b > c) {
            System.out.println("O segundo numero digitado é o maior!");
        } else if (c > a && c > b) {
            System.out.println("O terceiro numero digitado é o maior!");
        }
    }
}
