import java.util.Scanner;

public class MinAndMaxInputChallenge {

//find min and max number by while loop
    public static void test3(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int number=sc.nextInt();
        int min=number;
        int max=number;
        //place condition number is not equal zero than enter in loop
        while(number!=0) {
            if (number > max) {
                max = number;//enter number is max
            } else if (number < min) {
                min = number;//enter number is min
            }
            System.out.println("Enter number and press 0 to quit ");
            number=sc.nextInt();
        }
        System.out.println("This max is :"+max);
        System.out.println("This min is:"+min);

    }
//calling in main method
    public static void main(String[] args) {
        test3();
    }


}
