import java.util.Scanner;
public class BitwiseExample2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int X = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int Y = scanner.nextInt();
        int result = X & Y;
        System.out.println(X + " AND " + Y + " = " + result);
    }
}