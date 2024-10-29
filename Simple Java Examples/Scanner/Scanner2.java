import java.util.Scanner;
public class Scanner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String first = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String second = scanner.nextLine();
        System.out.print("Enter the third string: ");
        String third = scanner.nextLine();
        System.out.println(first + " - " + second + " - " + third);
        scanner.close();

    }
}