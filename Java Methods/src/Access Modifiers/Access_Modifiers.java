class Demo {

        private int a = 1;
        int b = 2;              // default
        protected int c = 3;
        public int d = 4;

        void show() {
            System.out.println(a + " " + b + " " + c + " " + d);
        }
    }

public class Access_Modifiers  {
        public static void main(String[] args) {

            Demo obj = new Demo();

            // System.out.println(obj.a); ❌ private (not allowed)
            System.out.println(obj.b); // ✔ default
            System.out.println(obj.c); // ✔ protected
            System.out.println(obj.d); // ✔ public

            obj.show(); // ✔ can access private inside class
        }
    }
