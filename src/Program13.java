public class Program13 {
    //to check enter shared digit return with true or false
    public static boolean hasShareDigit(int a,int b){
        //enter value shout between 10 &99
        if((a>=10 && a<=99 )&&(b>=10 &&b<=99)){
            return true;
        }
        else{
            return false;//return false for any other value
    }
    }
    public static void main(String[] args) {
        System.out.println(hasShareDigit(15,55));//initializing value
    }
}
