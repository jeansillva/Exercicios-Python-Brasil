import java.util.Scanner;

public class DEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma letra qualquer: ");
        String letra = sc.nextLine();
        sc.close();

        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") ||
                letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") ||
                letra.equalsIgnoreCase("u")) {

            System.out.println("A letra e uma vogal!");
        } else {
            System.out.println("A letra é uma consoante!");
        }
    }

}
