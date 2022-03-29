import java.util.Scanner;

public class Program12 {
    //check input number is prime number
   public  void display(){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//2,3
        int b=1;
        int c=0;
        //prime number greater than 1 and divide by itself
        while (b<=n){
            if((n%b)==0)
                c = c + 1;
                b++;

        } if(c==2) {
           System.out.println(n + " is Prime number");//is prime number
       }else
        System.out.println(n+" is not Prime number");

    }

    public static void main(String[] args) {
        Program12 obj=new Program12();
        obj.display();
    }

}
