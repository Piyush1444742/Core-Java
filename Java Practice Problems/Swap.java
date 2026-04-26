//Swap two numbers (with and without temp variable)

public class Swap {
    public void swapWithTemp(){
        int a = 10;
        int b = 20;
        System.out.println("Before swapping the value of a is "+a + " and b is "+b);

        int temp = a;
        a = b ;
        b = temp;
        System.out.println("After swapping the value of a is "+a + " and b is "+b);
    }

    public void swapWithoutTemp(){
        int a = 10 , b = 20;
        System.out.println("Before swapping the value of a is "+a + " and b is "+b);
         a = a+b;
         b = a-b;
         a = a-b;
        System.out.println("After swapping the value of a is "+a + " and b is "+b);
    }


    public static void main(String[] args) {
        Swap Swap = new Swap();
        Swap.swapWithTemp();
        Swap.swapWithoutTemp();
    }
}
