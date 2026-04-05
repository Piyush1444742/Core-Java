package Static_Methods;

public class StaticMethods {
    static int num = 100;
    static String str = "Piyush";

    // This is Static method
    static void display()
    {
        System.out.println("Static number is: " + num);
        System.out.println("Static string is: " + str);
    }

    // non-static method - // our static method can accessed in non static method
    void nonstatic()
    {
        display();
    }
}
