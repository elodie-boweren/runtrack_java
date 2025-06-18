package runtrack_java.job5;
import java.util.Scanner;

public class job5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un premier nombre entier: \n");
        double nombre1 = scanner.nextDouble();
        System.out.print("Entrez un deuxième nombre entier: \n");
        double nombre2 = scanner.nextDouble();
        System.out.print("Entrez un troisième nombre entier: \n");
        double nombre3 = scanner.nextDouble();

        // Variables pour stocker les deux plus grands
        double plusGrand, deuxiemePlusGrand;

        // Détermination des deux plus grands nombres
        if (nombre1 >= nombre2 && nombre1 >= nombre3) {
            // nombre1 est le plus grand
            plusGrand = nombre1;
            if (nombre2 >= nombre3) {
                deuxiemePlusGrand = nombre2;
            } else {
                deuxiemePlusGrand = nombre3;
            }
        } else if (nombre2 >= nombre1 && nombre2 >= nombre3) {
            // nombre2 est le plus grand
            plusGrand = nombre2;
            if (nombre1 >= nombre3) {
                deuxiemePlusGrand = nombre1;
            } else {
                deuxiemePlusGrand = nombre3;
            }
        } else {
            // nombre3 est le plus grand
            plusGrand = nombre3;
            if (nombre1 >= nombre2) {
                deuxiemePlusGrand = nombre1;
            } else {
                deuxiemePlusGrand = nombre2;
            }
        }
        // Affichage des résultats
        System.out.println("\nLes deux plus grands nombres sont :");
        System.out.println("Le plus grand : " + plusGrand);
        System.out.println("Le deuxième plus grand : " + deuxiemePlusGrand);

        scanner.close();
    }
}
