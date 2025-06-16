package runtrack_java.job1;
import java.util.Scanner;

public class job1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Entrez votre prénom : ");
        String firstName = scanner.nextLine();    

        System.out.println("Bonjour " + firstName + " !");
        
        scanner.close(); 
    }
}
