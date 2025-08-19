package Exercise2;

class Vehicle {
    void fuel() {
        System.out.println("Vehicle uses fuel");
    }
}

class Car extends Vehicle {
    void wheels() {
        System.out.println("Car has 4 wheels");
    }
}

class SportsCar extends Car {
    void turbo() {
        System.out.println("Sports car has turbo");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        SportsCar sc = new SportsCar();
        sc.fuel();   // from Vehicle
        sc.wheels(); // from Car
        sc.turbo();  // from SportsCar
    }
}
