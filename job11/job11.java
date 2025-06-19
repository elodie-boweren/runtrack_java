package runtrack_java.job11;
import java.util.Scanner;

public class job11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le nombre dont vous voulez la factorielle: ");
        // Méthode 1 : Avec une boucle for
        int n = sc.nextInt();
        long factorielle = 1;

        System.out.println("Calcul de " + n + "! (factorielle de " + n + ") avec la boucle for");
        System.out.print(n + "! = ");

        for (int i = 1; i <= n; i++) {
            factorielle *= i;
            System.out.print(i);
            if (i < n) {
                System.out.print(" × ");
            }
        }

        System.out.println(" = " + factorielle);

        // Méthode 2 : Avec une boucle while
        long factorielle2 = 1;
        int compteur = 1;

        System.out.println("\nVérification avec une boucle while : " + n + "! ");

        while (compteur <= n) {
            factorielle2 *= compteur;
            System.out.print(compteur);
            if (compteur < n) {
                System.out.print(" × ");
            }
            compteur++;
        }
        System.out.println(" = " + factorielle2);
        sc.close();
    }
}

