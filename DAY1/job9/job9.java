package runtrack_java.job9;
import java.util.Scanner;

public class job9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How old are you?  ");
        int age = sc.nextInt();
        if (age < 18) { System.out.println("You are under 18"); }
        else if (age > 18) { System.out.println("You are of legal age to drink, let's PAAAARTYY!"); }
        sc.close();
    }
}
