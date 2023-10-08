import java.util.Scanner;

public class DEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite F para feminino ou M para masculino! ");
        String letra = sc.nextLine();

        if (letra.equalsIgnoreCase("M")) {
            System.out.println("Sexo Masculino! ");
        } else if (letra.equalsIgnoreCase("F")) {
            System.out.println("Sexo Feminino!");
        } else {
            System.out.println("Sexo Inváido!");
        }
        sc.close();
    }
}
