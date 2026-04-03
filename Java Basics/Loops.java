public class Loops {

        public static void main(String[] args) {

            // 1. for loop
            System.out.println("For Loop:");
            for (int i = 1; i <= 3; i++) {
                System.out.println("i = " + i);
            }

            // 2. while loop
            System.out.println("\nWhile Loop:");
            int j = 1;
            while (j <= 3) {
                System.out.println("j = " + j);
                j++;
            }

            // 3. do-while loop
            System.out.println("\nDo-While Loop:");
            int k = 1;
            do {
                System.out.println("k = " + k);
                k++;
            } while (k <= 3);

            // 4. enhanced for loop (for-each)
            System.out.println("\nEnhanced For Loop:");
            int[] arr = {10, 20, 30};
            for (int num : arr) {
                System.out.println("num = " + num);
            }
        }
    }

