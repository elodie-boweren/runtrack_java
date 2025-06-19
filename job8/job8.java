package runtrack_java.job8;
import java.util.Scanner;

public class job8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un nombre entier: ");
        int number =  sc.nextInt();

        System.out.println("Voici la liste des cubes de 1 à " + number);
        //calcul des cubes:
        for (int i = 1; i <= number; i++) {
            System.out.println("Cube de " + i + ":");
            System.out.println(i * i * i);
        }
        sc.close();
    }
}
