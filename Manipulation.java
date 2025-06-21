abstract class Shape {
    abstract void resize(double factor);
    abstract void rotate(double angle);
}

class Circle extends Shape {
    void resize(double factor) {
        System.out.println("Resizing circle by " + factor);
    }
    void rotate(double angle) {
        System.out.println("Rotating circle by " + angle + " degrees");
    }
}

class Square extends Shape {
    void resize(double factor) {
        System.out.println("Resizing square by " + factor);
    }
    void rotate(double angle) {
        System.out.println("Rotating square by " + angle + " degrees");
    }
}

class Triangle extends Shape {
    void resize(double factor) {
        System.out.println("Resizing triangle by " + factor);
    }
    void rotate(double angle) {
        System.out.println("Rotating triangle by " + angle + " degrees");
    }
}

public class Manipulation {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Square();
        Shape s3 = new Triangle();

        s1.resize(1.2); s1.rotate(45);
        s2.resize(1.5); s2.rotate(90);
        s3.resize(2.0); s3.rotate(30);
    }
}
