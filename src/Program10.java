import java.util.Scanner;

public class Program10 {
    //input number to check its armstrong number or not

        public static void test2 (){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter number:");//enter 153
            int num=sc.nextInt();
            int number;
            int temp;
            int total=0;
            number=num;
            while(number!=0){
                temp=number%10;
                total=total+temp*temp*temp;
                number/=10;
            }
            if(total==num){
                System.out.println(num+" is an Armstrong number");//153 is armstrong numb
            }else
                System.out.println(num+" is not an Armstrong number");



}
//calling in main method
    public static void main(String[] args) {
        test2();
    }
}
