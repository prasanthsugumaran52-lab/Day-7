import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String rev = new StringBuilder(str).reverse().toString();

        if (str.equals(rev)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        sc.close();
    }
}