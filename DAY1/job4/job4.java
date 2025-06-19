package runtrack_java.job4;
import java.util.Scanner;

public class job4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre entier  ");

        String enteredNumber = scanner.nextLine();
        // transform string into int
        int number =  Integer.parseInt(enteredNumber);
        double square = number*number;

        System.out.println("Le carré de ce nombre est: " + square);
    }
}
