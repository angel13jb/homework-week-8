public class Program09 {
    //print fibonacci number
    static void fibonacci(int a) {
        int num1 = 1;
        int num2 = 1;
        int b = 0;
        //itreate till b is a
        while (b < a) {
            System.out.print(num1 + " ");
            //swap number
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            b = b + 1;

        }

    }

    //calling in main method
    public static void main(String[] args) {
        int a = 8;
        fibonacci(a);
    }
}
