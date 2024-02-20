import java.util.HashMap;
import java.util.Scanner;

public class CadastroAluno {
    /*
     * Você precisa criar um programa em Java para um sistema de cadastro de alunos.
     * Cada aluno deve ter um nome e uma nota. O programa deve permitir que o
     * usuário cadastre novos alunos, consulte a nota de um aluno específico e liste
     * todos os alunos cadastrados juntamente com suas notas. Utilize uma coleção
     * adequada para armazenar os alunos.
     */
    public static void main(String[] args) {
        HashMap<String, Double> alunos = new HashMap<>();
        Aluno a1 = new Aluno();
        Mensagem m1 = new Mensagem();
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-vindo ao Sistema de Cadastro de Alunos!\n");

        m1.mostraMensagem();
        int opcao = sc.nextInt();

        while (opcao != 4) {
            if (opcao == 1) {
                System.out.println("Digite o nome do aluno: ");
                a1.setNome(sc.next());
                System.out.println("Digite a nota do aluno " + a1.getNome());
                a1.setNota(sc.nextDouble());
                alunos.put(a1.getNome(), a1.getNota());
                System.out.println("Aluno cadastrado com sucesso!\n");

                m1.mostraMensagem();
                opcao = sc.nextInt();

            } else if (opcao == 2) {
                System.out.println("Digite o nome do Aluno: ");
                a1.setNome(sc.next());
                double notaAluno = alunos.get(a1.getNome());

                System.out.println("Nota do " + a1.getNome() + ": " + notaAluno + "\n");

                m1.mostraMensagem();
                opcao = sc.nextInt();

            } else if (opcao == 3) {
                System.out.println("Lista de alunos cadastrados:");
                for (String nome : alunos.keySet()) {
                    double nota = alunos.get(nome);
                    System.out.println("Nome: " + nome + " - Nota: " + nota);
                }
            }
        }
        sc.close();
    }
}
