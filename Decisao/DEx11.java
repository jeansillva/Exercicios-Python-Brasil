import java.util.Scanner;

public class DEx11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o salário para reajuste: ");
        double salario = sc.nextDouble();
        sc.close();

        double reajuste = 0;

        if (salario > 0 && salario <= 280) {
            reajuste = 0.2;
            System.out.println("Aumento de 20%!");
        } else if (salario >= 281 && salario <= 700) {
            reajuste = 0.15;
            System.out.println("Aumento de 15%!");
        } else if (salario >= 701 && salario <= 1500) {
            reajuste = 0.10;
            System.out.println("Aumento de 10%!");
        } else if (salario >= 1501) {
            reajuste = 0.05;
            System.out.println("Aumento de 5%!");
        }

        System.out.println("Salário antes do reajuste: " + salario + "\n"
                + "O valor do aumento: " + salario * reajuste + "\n"
                + "O novo salário, após o aumento: " + salario * (1 + reajuste));

    }
}
