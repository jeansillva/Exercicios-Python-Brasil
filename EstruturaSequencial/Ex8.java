import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        // Faça um Programa que pergunte quanto você ganha por hora e o número de horas
        // trabalhadas no mês.
        // Calcule e mostre o total do seu salário no referido mês.
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o seu salario por hora? ");
        double vhora = sc.nextDouble();

        System.out.println("Quantas horas voce trabalhou no mes? ");
        double horas = sc.nextDouble();

        double salario = vhora * horas;

        System.out.println("O total do seu salario e de: " + salario);
        sc.nextDouble();

        sc.close();
    }
}
