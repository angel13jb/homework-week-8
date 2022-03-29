public class Program11 {
    public static void getEvenDigitSum(int number){
        //find even digit sum

        int sum=0;
        for(int i=1;i<=number;i++){
            //find even number
           if(i%2==0) {
               sum = sum + i;
           }

        }
        System.out.println("sum of even number:"+number+"="+sum);

    }
//calling in main method
    public static void main(String[] args) {
        getEvenDigitSum(252);//initializing value
    }
}
