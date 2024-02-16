package EstruturaRepeticao;

public class Ex4 {
    public static void main(String[] args) {
        double paisA = 80000; // 0,03
        double paisB = 200000; // 0,015
        int anos = 0;

        do {
            paisA *= (1 + 0.03);
            paisB *= (1 + 0.015);
            anos++;
            System.out.printf("População A atual: %.2f %n", paisA);
            System.out.printf("População B atual: %.2f %n", paisB);
            System.out.println(anos + " anos!");
        } while (paisA < paisB);
    }
}
