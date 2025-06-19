package runtrack_java.job7;

public class job7 {
    public static void main(String[] args) {
        int somme = 0;

        for (int i = 1; i <= 100; i++) {
            somme += i;
        }
        System.out.println("La somme des 100 premiers entiers est : " + somme);
    }
}