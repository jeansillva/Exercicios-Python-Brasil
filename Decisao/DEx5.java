import java.util.Scanner;

public class DEx5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com a primeira nota do aluno: ");
        double nota1 = sc.nextDouble();
        System.out.println("Entre com a segunda nota do aluno: ");
        double nota2 = sc.nextDouble();
        sc.close();

        double media = (nota1 + nota2) / 2;

        if (media >= 7 && media < 10) {
            System.out.println("Aprovado!");
        } else if (media < 7 && media > 0) {
            System.out.println("Reprovado!");
        } else if (media == 10) {
            System.out.println("Aprovado com distinção!");
        } else {
            System.out.println("Média Inválida!");
        }
    }
}
