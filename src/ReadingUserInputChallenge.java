import java.util.Scanner;

public class ReadingUserInputChallenge {
    //enter upto 10 nubmers in console and print sum of those number
    public static void add() {
    int input=0;
    int a=1;
    int sum=0;

    Scanner sc = new Scanner(System.in);
    while(a<=10){
        System.out.println("Enter number #"+a+":");//enter 1,2,3,4,5,6,7,8,9,10
        if(sc.hasNextInt()){
            input=sc.nextInt();
            sum=sum+input;//
        }else{
            System.out.println("please enter valid integer");//if enter 'a' its invalid
            break;}
        a++;
    }
        System.out.println("Total number :"+sum);//total 55

     }
//calling in main method
    public static void main(String[] args) {
        add();
    }

}


