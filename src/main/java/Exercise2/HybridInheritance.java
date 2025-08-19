package Exercise2;

interface Engine {
    void start();
}

interface Battery {
    void charge();
}

class ElectricCar implements Engine, Battery {
    public void start() {
        System.out.println("Electric car starts silently");
    }

    public void charge() {
        System.out.println("Electric car charging...");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        ElectricCar ec = new ElectricCar();
        ec.start();
        ec.charge();
    }
}
