import java.util.Scanner;

public class Decision {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age: ");
        int age = sc.nextInt();


        if (age >= 21) {
            System.out.println("You are older than 21!");
        }
        else if (age>=15) {
            System.out.println("Dude you ain't drinking shit");
        }
        else {
            System.out.println("You are not older than 21!");
        }
    }
}
