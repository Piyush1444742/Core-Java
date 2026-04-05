package Static_Methods;

import static Static_Methods.StaticMethods.display;

public class Test {
    public static void main(String[] args) {
        StaticMethods obj = new StaticMethods();

        // This is object to call non static method
        obj.nonstatic();

        // static method can called
        // directly without an object
        display();
    }
}
