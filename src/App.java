import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Comment
        /* Same as C */
        
        System.out.print("Enter current year: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Year is " + year);
        System.out.print("Hello, " + name);

        scanner.close();
    }
}