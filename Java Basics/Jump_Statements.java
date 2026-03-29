public class Jump_Statements {

        // Method to demonstrate return
        public static void checkNumber(int num) {
            if (num < 0) {
                System.out.println("Negative number, exiting method using return");
                return; // exits method
            }
            System.out.println("Positive number: " + num);
        }

        public static void main(String[] args) {

            // 1. break statement
            System.out.println("Break Example:");
            for (int i = 1; i <= 5; i++) {
                if (i == 3) {
                    break; // exits loop
                }
                System.out.println("i = " + i);
            }

            // 2. continue statement
            System.out.println("\nContinue Example:");
            for (int i = 1; i <= 5; i++) {
                if (i == 3) {
                    continue; // skips iteration
                }
                System.out.println("i = " + i);
            }

            // 3. return statement
            System.out.println("\nReturn Example:");
            checkNumber(-5);
            checkNumber(10);
        }
    }

