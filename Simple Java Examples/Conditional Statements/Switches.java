public class Switches {

    public static void main(String[] args) {

        String day = "Thursday";
        //switch is a statement that allows said variable to be tested for equality with the list of values
        switch (day) {
            case "Sunday": System.out.println("Cardio Day");
            break;
            case "Monday": System.out.println("Arm day!!!!");
            break;
            case "Tuesday": System.out.println("Chest and Back day!");
            break;
            case "Wednesday": System.out.println("Leg and abs D:");
            break;
            default: System.out.println("You ain't skipping lil bro");
            break;
        }

    }
}
