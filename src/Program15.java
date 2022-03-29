public class Program15 {

    //display triangle pattern by using for loop
    public void test1() {
        int k = 5;
        //first loop
        for (int i = 0; i < k; i++) {
            //nested loop
            for (int j = 2 * k - i; j >= 0; j--) {
                System.out.print(" ");
                //nested loop
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    //calling method in main method via object
    public static void main(String[] args) {
        Program15 obj = new Program15();
        obj.test1();
    }


}
