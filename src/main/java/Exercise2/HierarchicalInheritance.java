package Exercise2;

class Shape {
    void display() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    void area() {
        System.out.println("Area = πr^2");
    }
}

class Rectangle extends Shape {
    void area() {
        System.out.println("Area = length × breadth");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.display();
        c.area();

        Rectangle r = new Rectangle();
        r.display();
        r.area();
    }
}
