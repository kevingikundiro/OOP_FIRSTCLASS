
import java.util.Scanner;

public class Declaration {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        // Declare variables
    int id;
    String name;
    int semester;
    String department;

    System.out.print("Enter student ID: ");
    id = scanner.nextInt();
    scanner.nextLine();

    System.out.print("Enter student name: ");
    name = scanner.nextLine();
    System.out.print("Enter student semester: ");
    semester = scanner.nextInt();
    scanner.nextLine();
    System.out.print("Enter student department: ");
    department = scanner.nextLine();

}
}