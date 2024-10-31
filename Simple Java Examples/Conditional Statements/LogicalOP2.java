import java.util.Scanner;

public class LogicalOP2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //logical operators:
        // && = (AND) both conditions must be true
        // ! = (NOT) reverses the boolean of condition
        // || (OR) either conditions must be true

        System.out.println("You are an idiot sandwhich press pp or PP to confirm or else.");
        String response = sc.next();

        if (response.equals("pp") || response.equals("PP")) {
            System.out.println("You are an idiot Sandwich!!");
        }
        else {
            System.out.println("You are... but sure buddy");
        }
    }
}
