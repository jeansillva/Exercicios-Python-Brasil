import java.util.Scanner;

public class Dex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor da sua hora: ");
        double valorHora = sc.nextDouble();

        System.out.println("Insira a quantidade de horas trabalhadas no mês: ");
        double horasTrabalhadas = sc.nextDouble();

        double salarioBruto = valorHora * horasTrabalhadas;
        sc.close();

        double porcentagemIR = 0;
        if (salarioBruto <= 900) {
            porcentagemIR = 0;
        } else if (salarioBruto > 901 && salarioBruto <= 1500) {
            porcentagemIR = 0.05;
        } else if (salarioBruto > 1501 && salarioBruto <= 2500) {
            porcentagemIR = 0.1;
        } else if (salarioBruto > 2501) {
            porcentagemIR = 0.2;
        }
        double IR = salarioBruto * porcentagemIR;
        double INSS = 0.10 * salarioBruto;
        double FGTS = salarioBruto * 0.11;

        double descontos = IR + INSS;
        double salarioLiquido = salarioBruto - descontos;

        System.out.printf("Salario bruto: %.2f\n", salarioBruto);
        System.out.printf("(-) IR (%.2f): %.2f\n", porcentagemIR, IR);
        System.out.printf("(-) INSS (10%%): %.2f\n", INSS);
        System.out.printf("FGTS (11%%): %.2f\n", FGTS);
        System.out.printf("Total de descontos: %.2f\n", descontos);
        System.out.printf("Salário Liquido: %.2f\n", salarioLiquido);
    }
}
