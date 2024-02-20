package Classes.Ex7;

import java.util.Scanner;

public class TamagushiMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int comida = sc.nextInt();
        int diversaoEmHoras = sc.nextInt();

        Tamagushi t2 = new Tamagushi(comida, diversaoEmHoras);
        t2.exibeHumor();
        sc.close();
    }
}
