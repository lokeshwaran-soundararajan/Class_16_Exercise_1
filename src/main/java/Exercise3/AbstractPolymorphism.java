package Exercise3;

abstract class Shape {
    abstract void draw(); // abstract method
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Drawing Square");
    }
}

public class AbstractPolymorphism {
    public static void main(String[] args) {
        Shape s;

        s = new Circle();
        s.draw();

        s = new Square();
        s.draw();
    }
}
