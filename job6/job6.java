package runtrack_java.job6;
import java.util.Scanner;

public class job6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variable 1 : pour stocker la somme des nombres
        int somme = 0;

        // Variable 2 : pour stocker temporairement chaque nombre saisi
        int nombre;

        System.out.println("Saisissez 5 entiers :");

        // Saisie et accumulation des 5 nombres
        System.out.print("Entier 1 : ");
        nombre = scanner.nextInt();
        somme += nombre;

        System.out.print("Entier 2 : ");
        nombre = scanner.nextInt();
        somme += nombre;

        System.out.print("Entier 3 : ");
        nombre = scanner.nextInt();
        somme += nombre;

        System.out.print("Entier 4 : ");
        nombre = scanner.nextInt();
        somme += nombre;

        System.out.print("Entier 5 : ");
        nombre = scanner.nextInt();
        somme += nombre;

        // Calcul et affichage de la moyenne
        // On réutilise la variable 'nombre' pour stocker la moyenne
        double moyenne = (double)somme / 5;

        System.out.printf("La moyenne des 5 entiers est : %.2f%n", moyenne);

        scanner.close();
    }
}

