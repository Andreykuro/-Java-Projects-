import java.util.Random;

public class Randomnumbers {
//Randomizer number -- from 1 to 100 (Customize it to your liking)
    public static void main(String[] args) {

        Random rand = new Random();

        //int x = rand.nextInt(100);
        //double  y = rand.nextInt();
        //boolean z = rand.nextBoolean();
        // remove the "//" for the following function to work
        int x = rand.nextInt(100);
        double  y = rand.nextInt();
        boolean z = rand.nextBoolean();
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }
}
