import java.util.Scanner;
import java.lang.Math;

public class Hypothenus {
    public static void main(String[] args) {
        double x;
        double y;
        double z;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X: ");
        x = sc.nextDouble();
        System.out.print("Enter Y: ");
        y = sc.nextDouble();
        z = Math.sqrt((x*x)+(y*y));
        System.out.println("Hypothenus "+ z);
        sc.close();
    }
}
