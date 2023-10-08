import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quanto voce ganha por hora? "); // Quanto você ganha por hora
        double valorHora = sc.nextDouble();
        System.out.println("Numero de horas trabalhadas no mes: "); // O número de horas trabalhadas no mês
        double horaMes = sc.nextDouble();

        double salarioBruto = valorHora * horaMes; // Total do seu salário no referido mês

        double IR = 0.11 * salarioBruto;
        double INSS = 0.08 * salarioBruto;
        double sindicato = 0.05 * salarioBruto;
        double salarioLiquido = salarioBruto - IR - INSS - sindicato;

        System.out.printf("Salario Bruto: R$%.2f%n"
                + "Quanto pagou ao INSS: R$%.2f%n"
                + "Quanto pagou ao sindicato: R$%.2f%n"
                + "Imposto de Renda: R$%.2f%n"
                + "Salario Liquido: R$%.2f%n",
                salarioBruto, INSS, sindicato, IR, salarioLiquido);
        sc.close();
    }
}
