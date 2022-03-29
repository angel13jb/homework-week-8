import java.util.Scanner;

public class Program06 {
//input 10 number row and get triangle pattern
    //using for loop
    public static void test(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Input numbers of row:");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }


    }
    //calling method in main method
    public static void main(String[] args) {
        test();
    }

    }




