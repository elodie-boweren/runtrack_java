package runtrack_java.job5;
import java.util.Scanner;

public class job5bis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demande et lecture des trois nombres
        System.out.print("Saisissez le premier nombre : \n");
        double nombre1 = scanner.nextDouble();

        System.out.print("Saisissez le deuxième nombre : \n");
        double nombre2 = scanner.nextDouble();

        System.out.print("Saisissez le troisième nombre : \n");
        double nombre3 = scanner.nextDouble();

        // Méthode alternative plus concise avec Math.max()
        double plusGrand = Math.max(Math.max(nombre1, nombre2), nombre3);

        double deuxiemePlusGrand;
        if (plusGrand == nombre1) {
            deuxiemePlusGrand = Math.max(nombre2, nombre3);
        } else if (plusGrand == nombre2) {
            deuxiemePlusGrand = Math.max(nombre1, nombre3);
        } else {
            deuxiemePlusGrand = Math.max(nombre1, nombre2);
        }

        // Affichage des résultats sans décimales
        System.out.println("\nLes deux plus grands nombres sont :");
        System.out.printf("Le plus grand : %.0f%n", plusGrand);
        System.out.printf("Le deuxième plus grand : %.0f%n", deuxiemePlusGrand);

        scanner.close();
    }
}

