public class Program14 {

    public static void four() {
        int i=1;
        int j;
        int k;
        int row=7;
        while (i<=row) {
            j=1;
            while (j<=row-i) {
                System.out.print(" ");
                j++;
            }
            k=1;
            while (k <= i*2-1) {
                System.out.print("*");
                k++;
            }
            System.out.println("");
            i++;
        }
        i=row-1;
        while(i>0){
            j=1;
            while(j<=row-i){
                System.out.print(" ");
                j++;
            }
            k=1;
            while(k<=i*2-1){
                System.out.print("*");
                k++;
            }
            System.out.println();
            i--;
        }

    }


    public static void main(String[] args) {
        four();
    }
}

