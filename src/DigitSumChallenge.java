public class DigitSumChallenge {

//enter number to find output sum of digits
    public static int sumDigits(int num) {
        int sum = 0;
        int temp=num;
        if(num<=0||num>=0&& num<=9){
            return -1;
        }else{
            sum = (num % 10) + (num / 10);
            num = (sum % 10) + (sum / 10);
        }

        return num;

    }
    //calling in main method
    public static void main(String[] args) {
//initializing value
        System.out.println(sumDigits(1));
    }
}
