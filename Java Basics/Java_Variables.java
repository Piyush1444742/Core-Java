public class Java_Variables {

        // Instance variable (belongs to object)
        int instanceVar = 10;

        // Static variable (shared by all objects)
        static int staticVar = 20;

        // Final variable (constant)
        final int finalVar = 30;

        public void show() {

            // Local variable (inside method)
            int localVar = 40;

            // Printing all variables
            System.out.println("Instance Variable: " + instanceVar);
            System.out.println("Static Variable: " + staticVar);
            System.out.println("Final Variable: " + finalVar);
            System.out.println("Local Variable: " + localVar);
        }

        public static void main(String[] args) {

            // Creating object
            Java_Variables obj = new Java_Variables();

            // Accessing variables
            obj.show();

            // Access static variable without object
            System.out.println("Access Static directly: " + staticVar);
        }
    }

