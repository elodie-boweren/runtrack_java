package runtrack_java.DAY2.job2;
import java.util.Scanner;

class job2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("What's your name? ");
        String firstName = scanner.nextLine();    

        System.out.println("Hello " + firstName + " !");
        
        scanner.close(); 
    }
}
