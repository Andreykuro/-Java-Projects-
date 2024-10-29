import java.util.Scanner;
public class Scanner3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter color 1: ");
        String color1 = scanner.nextLine();
        System.out.print("Enter color 2: ");
        String color2 = scanner.nextLine();
        System.out.print("Enter color 3: ");
        String color3 = scanner.nextLine();
        System.out.println("Mixing " + color1 + ", " + color2 + ", " + "and " + color3 + " creates a new color!");
        scanner.close();
    }
}
