abstract class MenuItem {
    abstract void prepare();
    abstract void serve();
}

class Appetizer extends MenuItem {
    void prepare() { System.out.println("Preparing appetizer..."); }
    void serve() { System.out.println("Serving appetizer..."); }
}

class MainCourse extends MenuItem {
    void prepare() { System.out.println("Preparing main course..."); }
    void serve() { System.out.println("Serving main course..."); }
}

class Beverage extends MenuItem {
    void prepare() { System.out.println("Preparing beverage..."); }
    void serve() { System.out.println("Serving beverage..."); }
}

public class Menu {
    public static void main(String[] args) {
        MenuItem m1 = new Appetizer();
        MenuItem m2 = new MainCourse();
        MenuItem m3 = new Beverage();

        m1.prepare(); m1.serve();
        m2.prepare(); m2.serve();
        m3.prepare(); m3.serve();
    }
}
