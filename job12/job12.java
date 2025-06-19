package runtrack_java.job12;
import java.util.Scanner;

public class job12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir un nombre entier positif");
        int n = sc.nextInt();

        System.out.println("Voici tous les nombres pairs inférieurs à cet entier: ");
        for (int i = n-1; i > 0; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
