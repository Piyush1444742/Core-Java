// Java Program to Illustrate First Argument
class CMD{

    public static void main(String[] args) {
      
        // Printing the first argument
        System.out.println(args[0]);
    }
}

/* 
 -> Java command-line argument is an argument, i.e., passed at the time of running the Java program.
 -> Command-line arguments passed from the console can be received by the Java program and used as input.

Explanation:
 -> Running java GFG GeeksForGeeks prints GeeksForGeeks because the argument is passed to main(String[] args).
 -> If no arguments are given (e.g., java GFG), it throws ArrayIndexOutOfBoundsException since args is empty.
*/
