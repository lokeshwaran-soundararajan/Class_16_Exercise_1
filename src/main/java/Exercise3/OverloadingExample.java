package Exercise3;

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class OverloadingExample {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Sum of 2 ints: " + c.add(5, 10));
        System.out.println("Sum of 3 ints: " + c.add(5, 10, 15));
        System.out.println("Sum of doubles: " + c.add(2.5, 3.7));
    }
}
