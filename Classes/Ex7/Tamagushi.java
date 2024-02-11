package Classes.Ex7;

public class Tamagushi {
    String nome;
    int fome;
    int saude;
    int idade;

    public Tamagushi(String nome, int fome, int saude, int idade) {
        this.nome = nome;
        this.fome = fome;
        this.saude = saude;
        this.idade = idade;
    }

    public String exibeHumor() {
        if (saude >= 70 && fome >= 6) {
            return "Feliz";
        } else if (saude <= 69 && fome <= 5) {
            return "Triste";
        } else {
            return "Valor invalido!";
        }
    }

}