import java.util.Scanner;

public class InputOutputExample {
    public static void main(String[] args) {
        // Using Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Using Scanner:");
        System.out.println("Name: " + name + ", Age: " + age);

        // Without Scanner
        System.out.println("\nWithout Scanner (Hardcoded Values):");
        String hardcodedName = "Lokii";
        int hardcodedAge = 21;
        System.out.println("Name: " + hardcodedName + ", Age: " + hardcodedAge);

        sc.close();
    }
}
