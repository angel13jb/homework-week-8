

public class Program07 {
    //sum of first and last digit
    public static int sumFirstAndLastDigit(int number) {
        //find last digit by moduler
        if(number<0){
            return -1;
        }
        int lastdigit=number%10;
        int firstdigit=number;
        //if first digit >=10 than number divide by 10 to get first digit
        while(firstdigit>=10){
            firstdigit=firstdigit/10;
        }
        System.out.println("First digit:"+firstdigit);//1
        System.out.println("Last digit:"+lastdigit);//3
        return firstdigit+lastdigit;


    }
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(-10));//initializing value
    }




}
