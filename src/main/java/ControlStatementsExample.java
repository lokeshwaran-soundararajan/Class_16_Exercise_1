public class ControlStatementsExample {
    public static void main(String[] args) {
        int number = 7;

        // If-else
        if (number > 0) {
            System.out.println("Number is positive.");
        } else {
            System.out.println("Number is non-positive.");
        }

        // Switch
        switch (number) {
            case 1:
                System.out.println("One");
                break;
            case 7:
                System.out.println("Lucky Seven!");
                break;
            default:
                System.out.println("Not Matched");
        }

        // For loop
        System.out.println("\nFor Loop:");
        for (int i = 0; i < 5; i++) {
            if (i == 3) continue;
            System.out.println("i: " + i);
        }

        // While loop
        System.out.println("\nWhile Loop:");
        int i = 0;
        while (i < 3) {
            System.out.println("While i: " + i);
            i++;
        }

        // Do-While
        System.out.println("\nDo-While Loop:");
        int j = 0;
        do {
            System.out.println("Do-While j: " + j);
            j++;
        } while (j < 3);

        // Jump statement
        outer: for (int m = 1; m <= 3; m++) {
            for (int n = 1; n <= 3; n++) {
                if (n == 2) {
                    break outer; // labeled break
                }
                System.out.println("m=" + m + ", n=" + n);
            }
        }
    }
}
