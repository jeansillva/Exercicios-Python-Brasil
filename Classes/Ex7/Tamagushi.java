package Classes.Ex7;

public class Tamagushi {
    String nome;
    int fome;
    int saude;
    int idade;
    int comida;
    int diversaoEmHoras;

    public Tamagushi(int comida, int diversaoEmHoras) {
        this.comida = comida;
        this.diversaoEmHoras = diversaoEmHoras;
        this.fome = comida / 2;
        this.saude = diversaoEmHoras /= 0.33;

        System.out.println("Fome do Tamagushi: " + this.fome);
        System.out.println("Saude do Tamagushi: " + this.saude);
    }

    public Tamagushi(String nome, int fome, int saude, int idade) {
        this.nome = nome;
        this.fome = fome;
        this.saude = saude;
        this.idade = idade;
    }

    public void exibeHumor() {
        if (saude >= 70 && fome >= 6) {
            System.out.println("Tamagushi está feliz");
        } else if (saude <= 69 && fome <= 5) {
            System.out.println("Tamagushi está triste");
        } else {
            System.out.println("Valor Invalido");
        }
    }

}