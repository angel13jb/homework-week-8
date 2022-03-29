
public class Program08 {
    public static void eight() {
        String a = "@";
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print(a);
            }
            System.out.println("");
        }

    }
public static void main(String[] args) {
        eight();
}
}