package Classes.Ex4;

public class Pessoa {
    String nome;
    int idade;
    double peso;
    double altura;
    double novaAltura;

    public Pessoa(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    void envelhecer() {
        idade++;
    }

    void engordar() {
        peso++;
    }

    void emagrecer() {
        peso--;
    }

    void crescer() {
        if (idade > 0 && idade <= 21) {
            novaAltura = altura + 0.5;
            altura += novaAltura;
        } else {
            altura += 0.2;
        }
    }

}
