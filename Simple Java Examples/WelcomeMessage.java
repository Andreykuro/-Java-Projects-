import java.util.Scanner;
public class WelcomeMessage {  
        static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter your name: ");
                String name = scanner.nextLine();
                System.out.print("What's your section: ");
                String section = scanner.nextLine();
                System.out.print("Enter your Age: ");
                int age = scanner.nextInt();
                System.out.print("Student ID: ");
                int studentID = scanner.nextInt();
                System.out.print("Enter your Birthdate: ");
                String birthdate = scanner.nextLine();
                System.out.print("Enter your Gender: ");
                String gender = scanner.nextLine();
                System.out.print("Enter your Number: ");
                int number = scanner.nextInt();
                System.out.print("Enter your Address: ");
                String address = scanner.nextLine();
                System.out.print("Enter your email address: ");
                String email = scanner.nextLine();
                System.out.println("\nYour Info:\n");
                System.out.println("Name: " + name);
                System.out.println("Section: " + section);
                System.out.println("Age: " + age);
                System.out.println("StudentID: " + studentID);
                System.out.println("Birthdate: " + birthdate);
                System.out.println("Gender: " + gender);
                System.out.println("Number: " + number);
                System.out.println("Address: " + address);
                System.out.println("Email: " + email);
                scanner.close();
        }
}