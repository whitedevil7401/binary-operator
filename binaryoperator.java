import java.util.Scanner;
public class binaryoperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value for 'a': ");
        int a = scanner.nextInt();

        System.out.print("Enter value for 'b': ");
        int b = scanner.nextInt();

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // bitwise and
        System.out.println("a & b = " + (a & b));

        // bitwise or
        System.out.println("a | b = " + (a | b));

        // bitwise xor
        System.out.println("a ^ b = " + (a ^ b));

        // bitwise not
        System.out.println("~a = " + ~a);
        scanner.close();
    }
}
