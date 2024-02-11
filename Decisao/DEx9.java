import java.util.Scanner;

public class DEx9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        double nm1 = sc.nextDouble();

        System.out.println("Digite o segundo numero: ");
        double nm2 = sc.nextDouble();

        System.out.println("Digite o terceiro numero: ");
        double nm3 = sc.nextDouble();

        sc.close();

        if (nm1 >= nm2 && nm1 >= nm3) {
            if (nm2 >= nm3) {
                System.out.println("Ordem: " + nm1 + " " + nm2 + " " + nm3);
            } else {
                System.out.println("Ordem decrescente: " + nm1 + ", " + nm3 + ", " + nm2);
            }
        } else if (nm2 >= nm1 && nm2 > nm3) {
            if (nm3 >= nm1) {
                System.out.println("Ordem: " + nm2 + " " + nm3 + " " + nm1);
            } else {
                System.out.println("Ordem: " + nm3 + " " + nm1 + " " + nm2);
            }
        } else {
            if (nm1 >= nm2) {
                System.out.println("Ordem: " + nm3 + " " + nm2 + " " + nm2);
            } else {
                System.out.println("Ordem: " + nm3 + " " + nm2 + " " + nm1);
            }
        }
    }
}
