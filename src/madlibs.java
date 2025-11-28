import java.util.Scanner;

public class madlibs {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String noun1, adjective1, verb1;

        System.out.print("Enter a noun (name of person or animal): ");
        noun1 = scanner.nextLine();

        System.out.print("Enter an adjective (describing word): ");
        adjective1 = scanner.nextLine();

        System.out.print("Enter a verb (with -ing): ");
        verb1 = scanner.nextLine();

        System.out.println("\nToday, I saw " + noun1);
        System.out.println(noun1 + " was very " + adjective1);
        System.out.print("But i remebered about learning java so I started " + verb1);

        scanner.close();
    }
}
