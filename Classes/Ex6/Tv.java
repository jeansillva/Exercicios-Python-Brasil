package Classes.Ex6;

public class Tv {
    int numeroCanal;
    int volume;

    public Tv(int numeroCanal, int volume) {
        this.numeroCanal = numeroCanal;
        this.volume = volume;
    }

    public Tv() {

    }

    void trocarCanal(int novoCanal) {
        numeroCanal = novoCanal;
    }

    void aumentarVolume(int novoVolume) {
        volume = novoVolume;
    }

}
