import java.util.Scanner;

public class main2 {

public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            Scanner scan1 = new Scanner(System.in);
            int i = scan.nextInt();
            double d = scan.nextDouble();
            String s = scan1.nextLine();
            scan.close();
            scan1.close();
            // Write your code here.

            System.out.println("String: " + s);
            System.out.println("Double: " + d);
            System.out.println("Int: " + i);
        }
}