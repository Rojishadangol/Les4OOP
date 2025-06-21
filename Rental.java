abstract class Vehicle {
    abstract double calculateRental(int days);
}

class Car extends Vehicle {
    double calculateRental(int days) {
        return days * 50.0;
    }
}

class Motorcycle extends Vehicle {
    double calculateRental(int days) {
        return days * 30.0;
    }
}

class Bicycle extends Vehicle {
    double calculateRental(int days) {
        return days * 10.0;
    }
}

public class Rental {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Motorcycle();
        Vehicle v3 = new Bicycle();

        System.out.println("Car: $" + v1.calculateRental(3));
        System.out.println("Motorcycle: $" + v2.calculateRental(3));
        System.out.println("Bicycle: $" + v3.calculateRental(3));
    }
}
