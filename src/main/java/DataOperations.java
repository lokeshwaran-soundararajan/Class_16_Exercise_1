public class DataOperations {
    public static void main(String[] args) {
        int a = 10, b = 5;
        float x = 3.5f, y = 1.5f;
        double d1 = 4.567, d2 = 2.123;
        char c1 = 'A', c2 = 'B';
        boolean flag = true;

        System.out.println("Arithmetic Operations:");
        System.out.println("a + b = " + (a + b));
        System.out.println("x - y = " + (x - y));
        System.out.println("d1 * d2 = " + (d1 * d2));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        System.out.println("\nRelational Operations:");
        System.out.println("a > b = " + (a > b));
        System.out.println("x <= y = " + (x <= y));

        System.out.println("\nLogical Operations:");
        System.out.println("flag && (a > b): " + (flag && (a > b)));
        System.out.println("flag || (a < b): " + (flag || (a < b)));
        System.out.println("!flag = " + (!flag));

        System.out.println("\nAssignment and Compound Operations:");
        a += 2; // a = a + 2
        System.out.println("a += 2 => " + a);
        x *= 2; // x = x * 2
        System.out.println("x *= 2 => " + x);

        System.out.println("\nCharacter Operations:");
        System.out.println("c1: " + c1 + ", ASCII: " + (int)c1);
    }
}
