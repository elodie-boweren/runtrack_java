package runtrack_java.job13;
import java.util.Scanner;

public class job13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Saisie du nombre avec vérification
        int n;
        do {
            System.out.print("Saisissez un nombre entier entre 0 et 9 : ");
            n = sc.nextInt();

            if (n < 0 || n > 9) {
                System.out.println("Erreur : Le nombre doit être compris entre 0 et 9 !");
            }
        } while (n < 0 || n > 9);

        // Affichage de la table de multiplication
        System.out.println("\nTable de multiplication de " + n + " :");
        System.out.println("─────────────────────────────");

        for (int i = 1; i <= 10; i++) {
            int resultat = n * i;
            System.out.printf("%d × %d = %d%n", n, i, resultat);
        }

        sc.close();
    }
}