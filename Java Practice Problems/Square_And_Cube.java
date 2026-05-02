//Find square and cube of a number

public class Square_And_Cube {

    public  void sqaure(){
        int a = 10;
        int square = a * a;
        System.out.println("The Square of a is "+square);
    }

    public  void cube(){
        int a = 10;
        int cube = a * a * a;
        System.out.println("The Square of a is "+cube);
    }

    public static void main(String[] args) {
        Square_And_Cube obj = new Square_And_Cube();
        obj.sqaure();
        obj.cube();
    }
}
