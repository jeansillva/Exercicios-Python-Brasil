package ExerciciosChatGPT;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista1 {
    // Solicita ao usuário uma lista de números inteiros e, em seguida, exibe a soma
    // desses números:
    public static void main(String[] args) {
        List<Integer> somaList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira numeros inteiros com ENTER ou digite 0 para sair!");
        int numero = sc.nextInt();

        while (numero != 0) {
            somaList.add(numero);
            numero = sc.nextInt();
        }

        int soma = 0;
        for (int num : somaList) {
            soma += num;
        }
        System.out.println(soma);
        sc.close();
    }
}
