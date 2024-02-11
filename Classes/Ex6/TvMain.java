package Classes.Ex6;

import java.util.Scanner;

public class TvMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tv t1 = new Tv();
        int escolha = -1;

        while (escolha != 0) {
            System.out.println("Você deseja:\n0- Desligar TV\n1- Mudar o canal \n2- Trocar o Volume");
            escolha = sc.nextInt();
            if (escolha == 1) {
                System.out.println("Digite o numero do canal desejado: ");
                int numeroCanal = sc.nextInt();
                t1.trocarCanal(numeroCanal);
                System.out.println("Canal alterado para " + numeroCanal
                        + "\n----------");
            } else if (escolha == 2) {
                System.out.println("Digite o numero do volume desejado: (0 a 10)");
                int volume = sc.nextInt();
                if (volume < 0 || volume > 10) {
                    System.out.println("Volume invalido!");
                } else {
                    t1.aumentarVolume(volume);
                    System.out.println("Volume alterado para: " + volume
                            + "----------");
                }
            } else if (escolha == 0) {
                System.out.println("Desligando TV!");
            } else {
                System.out.println("Escolha invalida!");
            }
        }
        sc.close();
    }
}
