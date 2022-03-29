

public class Program05 {
    //tTo check given number is palindrome number or not
    public static boolean isPalindrome(int number) {

//declare variables
        int n =number;//121,12321,1001
        int r;
        int sum = 0;
        int temp;

        temp = n;
        // using reverse number
        while (n > 0) {
            r = n % 10;  //getting remainder
            sum = (sum * 10) + r;
            n = n / 10;
        }
        boolean result=true;
        if (temp == sum) {
            System.out.println("Palindrome number ");//its palindrom number
            return true;
        } else
            System.out.println("Not palindrome number");//707 not palindrom number
            return false;

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(11212));
    }

}
