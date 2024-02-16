package EstruturaRepeticao;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * Faça um programa que leia e valide as seguintes informações:
         * Nome: maior que 3 caracteres;
         * Idade: entre 0 e 150;
         * Salário: maior que zero;
         * Sexo: 'f' ou 'm';
         * Estado Civil: 's', 'c', 'v', 'd';
         */
        String nome;
        int idade;
        double salario;
        char sexo;
        char estadoCivil;

        do {
            System.out.print("O nome deve ter mais que 3 caracteres! Digite novamente: ");
            nome = sc.nextLine();
        } while (nome.length() <= 3);

        do {
            System.out.print("A idade deve estar entre 0 e 150! Digite novamente: ");
            idade = sc.nextInt();
        } while (idade < 0 || idade > 150);

        do {
            System.out.print("O salário deve ser maior que zero! Digite novamente: ");
            salario = sc.nextDouble();
        } while (salario <= 0);

        do {
            System.out.print("Use f ou m! Digite novamente:");
            sexo = sc.next().charAt(0);
        } while (sexo != 'f' && sexo != 'm');

        do {
            System.out.print("Digite o estado civil ('s', 'c', 'v' ou 'd'):  Digite novamente:");
            estadoCivil = sc.next().charAt(0);
        } while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd');

        sc.close();
    }
}
