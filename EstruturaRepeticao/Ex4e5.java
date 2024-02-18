package EstruturaRepeticao;

import java.util.Scanner;

public class Ex4e5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nmr;

        do {
            System.out.println("Digite 0 para sair e 1 para calcular: ");
            nmr = sc.nextInt();

            if (nmr != 0) {
                System.out.println("Informe a população A:");
                double paisA = sc.nextDouble();

                System.out.println("Informe a taxa de crescimento A (Exemplo: 0,10): ");
                double taxaA = sc.nextDouble();

                System.out.println("Informe a população B:");
                double paisB = sc.nextDouble();

                System.out.println("Informe a taxa de crescimento B (Exemplo: 0,10): ");
                double taxaB = sc.nextDouble();

                int anos = 0;

                do {
                    paisA *= (1 + taxaA);
                    paisB *= (1 + taxaB);
                    anos++;
                    System.out.printf("População A atual: %.2f %n", paisA);
                    System.out.printf("População B atual: %.2f %n", paisB);
                    System.out.println(anos + " anos!");
                } while (paisA < paisB);
            }
        } while (nmr != 0);

        sc.close();
    }
}
