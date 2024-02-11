import java.util.Scanner;

public class DEx10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o turno em que você estuda: \n"
                + "M = Matutino, V = Vespertino ou N = Noturno: ");

        String turno = sc.next();
        sc.close();

        if (turno.equalsIgnoreCase("M")) {
            System.out.println("Bom dia!");
        } else if (turno.equalsIgnoreCase("V")) {
            System.out.println("Boa tade!");
        } else if (turno.equalsIgnoreCase("N")) {
            System.out.println("Boa noite!");
        } else {
            System.out.println("Valor Inválido!");
        }

    }
}
