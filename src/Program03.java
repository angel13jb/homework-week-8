import java.util.Scanner;

public class Program03 {
    //enter character to fine its vowel or consonant
    //error message if enter other value
    public static void method() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Alphabet");
        char ch = sc.next().charAt(0);
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    System.out.println("this alphabet is vowel");
                } else
                    System.out.println("this alphabet is consonant");

            } else
                System.out.println("not valid input");

        }

        public static void main (String[]args){
            method();
        }

    }