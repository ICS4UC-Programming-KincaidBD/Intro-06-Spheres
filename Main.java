import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Scanner object to read user input
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the radius number: ");

        // All the math
        double radius = scan.nextDouble();
        double surfaceArea = 4 * Math.PI * radius * radius;
        double volume = (4.0/3.0) * Math.PI * radius * radius * radius;

        // Printing result
        System.out.println("Surface Area: " + surfaceArea);
        System.out.println("Volume: " + volume);
    }
}
