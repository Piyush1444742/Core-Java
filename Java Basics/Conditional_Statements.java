public class Conditional_Statements {

        public static void main(String[] args) {

            int a = 10, b = 5;

            // 1. if statement
            if (a > b) {
                System.out.println("if: a is greater than b");
            }

            // 2. if-else statement
            if (a % 2 == 0) {
                System.out.println("if-else: a is even");
            } else {
                System.out.println("if-else: a is odd");
            }

            // 3. else-if ladder
            int num = 0;
            if (num > 0) {
                System.out.println("Positive");
            } else if (num < 0) {
                System.out.println("Negative");
            } else {
                System.out.println("Zero");
            }

            // 4. switch statement
            int day = 2;
            switch (day) {
                case 1:
                    System.out.println("Switch: Monday");
                    break;
                case 2:
                    System.out.println("Switch: Tuesday");
                    break;
                default:
                    System.out.println("Switch: Other day");
            }

        }
    }

