import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        //logical operators:
        // && = (AND) both conditions must be true
        // ! = (NOT) reverses the boolean of condition
        // || (OR) either conditions must be true

        Scanner sc = new Scanner(System.in);

        System.out.print("Current Temperature: ");
        double temperature = sc.nextDouble();

        if(temperature >= 34 && temperature <= 50) {
            System.out.println("It's scrotching hot outside haiyah...");
        }
        else if(temperature >= 1 && temperature <= 20) {
            System.out.println("It's super cold outside fuiyoh!");
        }
    }
}
