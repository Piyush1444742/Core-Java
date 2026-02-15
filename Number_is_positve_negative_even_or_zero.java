import java.util.Scanner;
public class Number_is_positve_negative_even_or_zero {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>0) {
            System.out.println("Number is Positive");
        }
        else if (n<0) {
            System.out.println("Number is Negative");
        }
        else {
            System.out.println("Number is zero");
        }
        if(n!=0){
            if (n==0){
                System.out.println("Number is even");
            }
        }
    }
}
