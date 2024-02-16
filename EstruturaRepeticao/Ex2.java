package EstruturaRepeticao;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        // Faça um programa que leia um nome de usuário e a sua senha e não aceite a
        // senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando a
        // pedir as informações.
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome de usuario: ");
        String usuario = sc.next();

        System.out.println("Cadastre sua senha ");
        String senha = sc.next();

        while (senha.equalsIgnoreCase(usuario)) {
            System.out.println("A senha deve ser diferente do nome de usuário. Digite uma nova senha: ");
            senha = sc.next();
        }

        sc.close();

    }
}
