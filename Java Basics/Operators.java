public class Operators {

        public static void main(String[] args) {

            int a = 10, b = 5;

            // 1. Arithmetic Operators
            System.out.println("Arithmetic Operators:");
            System.out.println("a + b = " + (a + b));
            System.out.println("a - b = " + (a - b));
            System.out.println("a * b = " + (a * b));
            System.out.println("a / b = " + (a / b));
            System.out.println("a % b = " + (a % b));

            // 2. Relational Operators
            System.out.println("\nRelational Operators:");
            System.out.println("a > b = " + (a > b));
            System.out.println("a < b = " + (a < b));
            System.out.println("a == b = " + (a == b));
            System.out.println("a != b = " + (a != b));

            // 3. Logical Operators
            System.out.println("\nLogical Operators:");
            boolean x = true, y = false;
            System.out.println("x && y = " + (x && y));
            System.out.println("x || y = " + (x || y));
            System.out.println("!x = " + (!x));

            // 4. Assignment Operators
            System.out.println("\nAssignment Operators:");
            int c = 10;
            c += 5;  // c = c + 5
            System.out.println("c += 5: " + c);
            c -= 3;
            System.out.println("c -= 3: " + c);

            // 5. Unary Operators
            System.out.println("\nUnary Operators:");
            int d = 5;
            System.out.println("d = " + d);
            System.out.println("++d = " + (++d)); // pre-increment
            System.out.println("d++ = " + (d++)); // post-increment
            System.out.println("d = " + d);

            // 6. Ternary Operator
            System.out.println("\nTernary Operator:");
            int max = (a > b) ? a : b;
            System.out.println("Max of a and b = " + max);

            // 7. Bitwise Operators
            System.out.println("\nBitwise Operators:");
            int e = 5, f = 3;
            System.out.println("e & f = " + (e & f));
            System.out.println("e | f = " + (e | f));
            System.out.println("e ^ f = " + (e ^ f));

            // 8. Shift Operators
            System.out.println("\nShift Operators:");
            System.out.println("e << 1 = " + (e << 1));
            System.out.println("e >> 1 = " + (e >> 1));
        }
    }
